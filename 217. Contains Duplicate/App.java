import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // solution No.1
        // Set<Integer> duplicate = new HashSet<>();
        // for (int i = 0; i < nums.length; i++) {
        // if (duplicate.contains(nums[i])) {
        // return true;
        // } else {
        // duplicate.add(nums[i]);
        // }
        // }
        // return false;
        // but No.1 is not efficient and take a lot of cache

        // solution No.2
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                return true;
            }
        }
        return false;

    }
}
