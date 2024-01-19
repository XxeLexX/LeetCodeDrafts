import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] ss = s.split(" ");
        HashMap<Character, String> res = new HashMap<>();

        if (pattern.length() != ss.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            
            if (res.containsKey(ch)) {
                if (!ss[i].equals(res.get(ch))) {
                    return false;
                }
            } else {
                if (res.containsValue(ss[i])) {
                    return false;
                } else {
                    res.put(ch, ss[i]);
                }
            }
            res.put(ch, ss[i]);
        }
        return true;
    }
}