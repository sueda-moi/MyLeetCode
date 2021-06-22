public class App {
    public static void main(String[] args) throws Exception {
        String[] strs = new String[] { "flower", "flow", "flight" };
        String s = longestCommonPrefix(strs);
        System.out.println(s);
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuffer s = new StringBuffer();
        int sLen = strs.length;
        if (sLen == 0) {
            return "";
        } else if (sLen == 1) {
            return strs[0];
        }

        int shortLen = strs[0].length();
        for (int i = 1; i < sLen; i++) {
            if (strs[i].length() < shortLen) {
                shortLen = strs[i].length();
            }
        }

        if (shortLen == 0) {
            return "";
        }

        for (int k = 0; k < shortLen; k++) {
            char c = ' ';
            for (int i = 1; i < sLen; i++) {
                c = strs[i - 1].charAt(k);
                char a = strs[i].charAt(k);
                if (a != c) {
                    return s.toString();
                }
            }
            s.append(c);

        }

        return s.toString();

    }
}
