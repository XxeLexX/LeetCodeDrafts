import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character, Integer> chars = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (chars.containsKey(s.charAt(i))) {
                chars.put(s.charAt(i), chars.get(s.charAt(i)) + 1);
            } else {
                chars.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (!chars.containsKey(t.charAt(i)) || chars.get(t.charAt(i)) == 0) {
                return false;
            } else {
                chars.put(t.charAt(i), chars.get(t.charAt(i)) - 1);
            }
        }
        return true;
    }

    public boolean isAnagram2(String s, String t) {
        char[]ss = s.toCharArray();
        char[]tt = t.toCharArray();

        Arrays.sort(ss);
        Arrays.sort(tt);

        System.out.println(ss);
        System.out.println(tt);

        return Arrays.equals(ss, tt);
    }
}