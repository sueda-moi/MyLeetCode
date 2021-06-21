
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        // StringBuffer de = new StringBuffer();
        // de.append("1").append("1");
        // System.out.println(de.toString());

        String a = countAndSay(5);

        System.out.println(a);
    }

    public static String countAndSay(int n) {

        if (n == 1) {
            return "1";
        }

        String re = countAndSay(n - 1);
        StringBuffer de = new StringBuffer();

        char c = re.charAt(0);
        int count = 1;
        for (int i = 1; i < re.length(); i++) {
            if (re.charAt(i) == c) {
                count++;
            } else {
                de.append(count).append(c);
                c = re.charAt(i);
                count = 1;
            }
        }
        de.append(count).append(c);
        return de.toString();
        // StringBuffer de = new StringBuffer();
        // String s = null;
        // de.append("1");

        // if (n == 1) {
        // return de.toString();
        // } else if (n > 1) {
        // for (int i = 1; i < n; i++) {
        // int len = de.length();
        // // Map<Integer, Character> map1 = new LinkedHashMap<>(); // index :value
        // // Map<Integer, Integer> map2 = new HashMap<>(); // index : count

        // for (int j = 0; j < len; j++) {
        // if (j == 0) {
        // map1.put(0, de.charAt(0));
        // map2.put(0, 1);
        // } else {
        // if (de.charAt(j - 1) == de.charAt(j)) {
        // Character a = de.charAt(j);
        // map2.put(index, map2.getOrDefault(index, 0) + 1);
        // } else {
        // map1.put(j, de.charAt(j));
        // map2.put(j, 1);
        // }
        // }

        // }
        // StringBuffer re = new StringBuffer();
        // for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
        // String key = entry.getKey().toString();
        // int index = entry.getValue();
        // String value = map2.get(index).toString();

        // re.append(value).append(key);
        // s = re.toString();
        // }
        // de = re;

        // }
        // }

        // return s;
    }
}
