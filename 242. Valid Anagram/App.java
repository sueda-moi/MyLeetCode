import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        // Map<Character, Integer> map = new HashMap<Character, Integer>();
        // for (int i = 0; i < s.length(); i++) {
        // map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        // }

        // Map<Character, Integer> map2 = new HashMap<Character, Integer>();
        // for (int i = 0; i < t.length(); i++) {
        // map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
        // }

        // for (int i = 0; i < s.length(); i++) {
        // if (map.get(s.charAt(i)) != map2.get(s.charAt(i))) {
        // return false;
        // }
        // }
        char[] arrayS = s.toCharArray();
        Arrays.sort(arrayS);
        char[] arrayT = t.toCharArray();
        Arrays.sort(arrayT);

        for (int i = 0; i < arrayT.length; i++) {
            if (arrayS[i] != arrayT[i]) {
                return false;
            }
        }

        return true;
    }
}