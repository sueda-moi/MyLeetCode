public class App {
    public static void main(String[] args) throws Exception {

        Solution solution = new Solution();
        int a = solution.myAtoi("21474836460");
        System.out.println(a);
    }
}

class Solution {
    public int myAtoi(String s) {

        // char[] c = s.toCharArray();
        // StringBuilder sb = new StringBuilder();

        // for (int i = 0; i < c.length; i++) {
        // if (Character.isWhitespace(c[i])) {
        // break;
        // }
        // if ("+".equals(c[i])) {

        // }
        // if (Character.isDigit(c[i])) {

        // }
        // }
        
                // s = s.trim();
        // int flag = 1; // default
        // int i = 0;
        // int result = 0;
        // if (s.length() == 0) {
        // return 0;
        // }

        // if (s.charAt(0) == '+') {
        // i = 1;
        // }

        // if (s.charAt(0) == '-') {
        // flag = -1;
        // i = 1;
        // }
        // for (; i < s.length(); i++) {

        // if (!Character.isDigit(s.charAt(i))) {
        // break;
        // }

        // if (result > Integer.MAX_VALUE / 10
        // || (result == Integer.MAX_VALUE && s.charAt(i) - '0' > Integer.MAX_VALUE %
        // 10)) {
        // return flag == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        // } else {
        // result = result * 10 + s.charAt(i) - '0';

        // }

        // }
        // return result * flag;
        s = s.trim();
        int flag = 0; // default
        int i = 0;
        if (s.length() == 0) {
            return 0;
        }

        if (s.charAt(0) == '+') {
            flag = 1;
            i = 1;
        }

        if (s.charAt(0) == '-') {
            flag = -1;
            i = 1;
        }
        StringBuilder sb = new StringBuilder();
        for (; i < s.length(); i++) {

            if (!Character.isDigit(s.charAt(i))) {
                break;
            }

            if (Character.isDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            }

        }
        if (sb.length() == 0) {
            return 0;
        }

        try {
            int a = Integer.parseInt(sb.toString());
            if (flag == -1) {
                return -a;
            }

            return a;
        } catch (NumberFormatException e) {
            return flag == 1 || flag == 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

    }
}
