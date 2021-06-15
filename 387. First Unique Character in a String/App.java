import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;

    }
}
