import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        int[] nums = new int[] { 1, 2, 3, 4, 5, 6 };
        int k = 3;

        Solution solution = new Solution();
        solution.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}

class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] arr = new int[nums.length];

        if (k == 0) {
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {

            if (i < k) {
                nums[i] = arr[i + (nums.length - k)];

            } else {
                nums[i] = arr[i - k];
            }

        }

    }
}