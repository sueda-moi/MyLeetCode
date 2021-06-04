import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        int[] digits = new int[] { 8, 9, 9, 9 };
        Solution solution = new Solution();
        int[] a = solution.plusOne(digits);
        System.out.println(Arrays.toString(a));
    }
}

class Solution {
    public int[] plusOne(int[] digits) {

        int[] answer;
        boolean flag = false;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 9) {
                flag = true;
            }
        }

        if (flag) {
            // not all 9
            int index = digits.length - 1;
            int count = 1;
            while (index >= 0) {
                int s = digits[index];
                if (s >= 9 && count == 1) {
                    digits[index] = 0;
                    count = 1;
                } else if (s < 9 && count == 1) {
                    digits[index] = s + 1;
                    count = 0;
                }
                index--;
            }
            return digits;

        } else {
            // all 9
            answer = new int[digits.length + 1];
            answer[0] = 1;
            for (int i = 1; i < answer.length; i++) {
                answer[i] = 0;
            }
            return answer;
        }

    }
}
