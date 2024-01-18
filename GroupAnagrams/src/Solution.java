import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> resMap = new HashMap<>();
        // travers each string and sort
        // store the mapping like <sorted, unsorted>
        for (String s : strs) {
            char[] ss = s.toCharArray();
            Arrays.sort(ss);
            String sortedString = String.valueOf(ss);
            List<String> tempList = new ArrayList<>();

            if (resMap.containsKey(sortedString)) {
                resMap.get(sortedString).add(s);
            } else {
                tempList.add(s);
                resMap.put(sortedString, tempList);
            }
        }
        // add to result
        for (List<String> list : resMap.values()) {
            res.add(list);
        }
        return res;
    }
    
}