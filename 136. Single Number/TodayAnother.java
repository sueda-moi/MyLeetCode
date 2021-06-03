import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TodayAnother {

    public static void main(String[] args) throws Exception {
        int[] nums = new int[] { 11, 11, 12, 12, 1, 2, 3, 1, 2, 3, 5, 5, 6, 8, 6, 9, 9, 13, 14, 13, 14 };
        Solution solution = new Solution();
        int a = solution.singleNumber(nums);
        System.out.println(a);
    }
}

class Solution {
    public int singleNumber(int[] nums) {

        // solution No.1 not efficient and take too much cache
        // Set<Integer> set = new HashSet<>();
        // for (int i = 0; i < nums.length; i++) {
        // if (set.contains(nums[i])) {
        // set.remove(nums[i]);
        // } else {
        // set.add(nums[i]);
        // }
        // }
        // int answer = set.iterator().next();
        // return answer;

        // solution No.2
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            answer = answer ^ nums[i];
        }
        return answer;

    }
}