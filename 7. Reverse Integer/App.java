import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        int x = 1534236469;
        Solution solution = new Solution();
        int a = solution.reverse(x);
        System.out.println(a);
        // Collections.unmodifiableList()
    }
}

class Solution {
    public int reverse(int x) {
        boolean deFlag = false;
        int result = 0;

        if (x < 0) {
            x = -x;
            deFlag = true;

        }

        String s = Integer.toString(x);
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length / 2; i++) {
            char temp = c[i];
            c[i] = c[c.length - i - 1];
            c[c.length - i - 1] = temp;
        }

        String answer = String.valueOf(c);

        try {
            result = Integer.parseInt(answer);
        } catch (NumberFormatException e) {

            return 0;
        }

        if (deFlag) {
            result = -result;
        }

        return result;

    }
}