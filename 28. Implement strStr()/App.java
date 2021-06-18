public class App {
    public static void main(String[] args) throws Exception {
        String haystack = "a";
        String needle = "a";
        int a = strStr(haystack, needle);
        System.out.println(a);
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;

        }
        if (needle.length() == 0 || haystack.length() == 0) {
            return 0;
        }
        int nLen = needle.length();
        // int hayLen = haystack.length();

        boolean flag = false;
        int firstEqueal = 0;

        for (int i = 0; i < haystack.length(); i++) {
            int index = 0;
            char one = needle.charAt(index);
            char hayOne = haystack.charAt(i);
            if (hayOne == one && i + nLen <= haystack.length()) {
                firstEqueal = i;
                flag = true;
                // break;
                index++;
                while (index < nLen) {
                    char a = haystack.charAt(i + index);
                    char b = needle.charAt(index);
                    if (a != b) {
                        flag = false;
                        break;
                    }
                    index++;
                }
                if (flag) {
                    return firstEqueal;
                }
            }
        }

        return -1;

    }

}
