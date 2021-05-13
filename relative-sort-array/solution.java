package generate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class solution {

    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;

        arr1 = new int[]{2,3,1,3,2,4,6,7,9,2,19};
        arr2 = new int[]{2,1,4,3,9,6};

        int[] ints = relativeSortArray(arr1, arr2);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();


        int[] arr4 = new int[arr1.length];


        int c = 0;
        int b = 0;
        int arrBSize = 0;
        for(int index=0;index<arr1.length; index++) {

            if (map.containsKey(arr1[index])) {

                map.put(arr1[index], map.get(arr1[index]) + 1);

            } else {
                map.put(arr1[index], 1);

            }
        }

        for(int index=0;index<arr2.length; index++) {
            map2.put(index, arr2[index]);
        }


        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int count = 0;
            for(int index=0;index<arr2.length; index++) {
                if (entry.getKey() == arr2[index]) {
                    count ++;
                    break;
                }
            }
            if (count == 0) {
                arrBSize = arrBSize + entry.getValue();
            }

        }

        int[] arrB = new int[arrBSize];


        for (int index=0;index<arr1.length; index++) {
            if (!map2.containsValue(arr1[index])) {
                arrB[c] = arr1[index];
                c++;
            }
        }

        Arrays.sort(arrB);


        for (int index=0;index<arr2.length; index++) {
            int re = arr2[index];
            int count = map.get(re);
            for (int i = 0; i < count; i++) {
                arr4[b] = re;
                b++;
            }
        }

        for (int index=0;index<arrB.length; index++) {

            //map2.put(arrB[index], 1);
            arr4[b] = arrB[index];
            b++;
        }



        return arr4;
    }
}
