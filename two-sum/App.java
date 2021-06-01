public class App {
    public static void main(String[] args) throws Exception {
        Solution s = new Solution();
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 8, 9 };
        int[] v = s.twoSum(nums, 9);
        System.out.println(v);
    }
}

class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] c = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int b = nums[j];

                if (i == j) {
                    break;
                }

                if (a + b == target) {
                    c[0] = i;
                    c[1] = j;

                }

            }
        }

        return c;

    }
}
