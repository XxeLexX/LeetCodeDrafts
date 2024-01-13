import java.util.LinkedHashMap;
import java.util.Map;

public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        // 标记出现的位置
        Map<Character, String> r1 = new LinkedHashMap<>();
        Map<Character, String> r2 = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (r1.containsKey(c1) && r2.containsKey(c2)) {
                r1.put(c1, r1.get(c1) + String.valueOf(i));
                r2.put(c2, r2.get(c2) + String.valueOf(i));
            }
            r1.put(c1, String.valueOf(i));
            r2.put(c2, String.valueOf(i));
        }
        return r1.values().toString().equals(r2.values().toString());
    }
}