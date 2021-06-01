
public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[] nums = new int[] { 1, 1, 2, 2, 2, 3, 6, 9, 10, 10, 15, 20, 20 };

        int s = solution.removeDuplicates(nums);
        System.out.println(s);
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                nums[i - count] = nums[i];
            }

        }
        int a = nums.length - count;

        return a;
    }

    // public int[] remove(int[] nums, int index) {
    // if (nums.length == 1) {
    // return nums;
    // }
    // int[] s = new int[nums.length - 1];
    // for (int i = 0; i < nums.length; i++) {

    // if (i >= nums.length - 1) {
    // break;
    // }
    // if (i >= index) {
    // s[i] = nums[i + 1];

    // } else {
    // s[i] = nums[i];
    // }
    // }
    // nums = null;
    // nums = this.copy(s, nums);
    // return nums;

    // }

    // public int[] copy(int[] a, int[] arrayB) {
    // arrayB = new int[a.length];
    // for (int i = 0; i < arrayB.length; i++) {
    // arrayB[i] = a[i];
    // }
    // return arrayB;
    // }
}
