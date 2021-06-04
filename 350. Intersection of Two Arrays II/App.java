import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class App {
    public static void main(String[] args) throws Exception {

        int[] nums1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] nums2 = new int[] { 2, 2, 2, 4, 5, 2, 4, 5, 6 };

        System.out.println("Hello, World!");
    }
}

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        // List<Integer> list = new ArrayList<>();

        // for (int i = 0; i < nums1.length; i++) {
        // map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        // }

        // for (int i = 0; i < nums2.length; i++) {
        // if (map.getOrDefault(nums2[i], 0) > 0) {
        // list.add(nums2[i]);
        // map.put(nums2[i], map.get(nums2[i]) - 1);
        // }
        // }

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            }
        }

        int[] answer = new int[list.size()];

        for (int k = 0; k < answer.length; k++) {
            answer[k] = list.get(k);
        }

        return answer;

    }

}