import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneNumberCombinations {
    List<String> res = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        
        // 递归的退出条件
        if (digits.length() == 0 || digits == null || digits == "1") {
            return res;
        }

        Map<String, String> letters = new HashMap<>();
        //letters.put("0", " ");
        //letters.put("1", null);
        letters.put("2", "abc");
        letters.put("3", "def");
        letters.put("4", "ghi");
        letters.put("5", "jkl");
        letters.put("6", "mno");
        letters.put("7", "pqrs");
        letters.put("8", "tuv");
        letters.put("9", "wxyz");

        String tempDigit = letters.get(digits.substring(0,1));

        // 递归开始，第一个数字输入之前结果是空的所以先将第一个数字的所有字母存入
        if (res.isEmpty()) {
            for (int i = 0; i < tempDigit.length(); i++) {
                res.add(tempDigit.substring(i, i+1));
            }
            return letterCombinations(digits.substring(1, digits.length()));
        }
        
        // 临时结果，用来存放当前产生的结果集，然后替换全局结果
        List<String> tempRes = new ArrayList<>();

        // 递归，依次将res中的字符串和当前字符组合成新的字符串，并添加到临时结果集中
        for (String s : res) {
            for (int i = 0; i < tempDigit.length(); i++) {
                String temp = s + tempDigit.substring(i, i+1);
                tempRes.add(temp);
            }
        }

        // 清空之前的结果，将新结果覆盖到原来的结果集中
        res.clear();
        res = tempRes;

        return letterCombinations(digits.substring(1, digits.length()));    
    }
}