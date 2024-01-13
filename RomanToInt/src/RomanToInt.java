import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public int romanToInt(String s) {
        int res = 0;

        Map<String, Integer> nums = new HashMap<>();
        nums.put("I", 1);
        nums.put("V", 5);
        nums.put("X", 10);
        nums.put("L", 50);
        nums.put("C", 100);
        nums.put("D", 500);
        nums.put("M", 1000);

        nums.put("IV", 4);
        nums.put("IX", 9);
        nums.put("XL", 40);
        nums.put("XC", 90);
        nums.put("CD", 400);
        nums.put("CM", 900);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I' || s.charAt(i) == 'X' || s.charAt(i) == 'C') {
                if (i + 1 < s.length() && nums.containsKey(s.substring(i, i+2))) {
                    res += nums.get(s.substring(i, i+2));
                    i++;
                    continue;
                }
            }
            res += nums.get(s.substring(i, i+1));
        }

        return res;
    }
}