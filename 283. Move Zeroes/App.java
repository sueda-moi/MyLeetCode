import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = new int[] { 1 };
        Solution solution = new Solution();
        solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        // when meet 0
        // then every element that after the 0 should go to the previous one
        // the 0 should go to last one
        int zeroCount = 0;
        int index = 0;
        boolean flag = false;

        while (index < nums.length) {

            if (flag) {
                nums[index] = 0;
                index++;
                continue;
            }

            if (index == nums.length - 1 && zeroCount != 0) {
                nums[index - zeroCount] = nums[index];
                nums[index] = 0;
                flag = true;
                index = nums.length - zeroCount;
                continue;
            }
            int current = nums[index];

            if (current == 0) {
                zeroCount = zeroCount + 1;
                index++;
                continue;
            }
            if (zeroCount != 0) {
                nums[index - zeroCount] = nums[index];

            }
            index++;
        }

    }
}