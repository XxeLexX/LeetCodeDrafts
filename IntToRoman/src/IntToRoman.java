import java.util.HashMap;
import java.util.Map;

public class IntToRoman {
    public String run(int num) {
        String res = "";
        
        Map<Integer, String> nums = new HashMap<>();
        nums.put(1, "I");
        nums.put(5, "V");
        nums.put(10, "X");
        nums.put(50, "L");
        nums.put(100, "C");
        nums.put(500, "D");
        nums.put(1000, "M");

        nums.put(4, "IV");
        nums.put(9, "IX");
        nums.put(40, "XL");
        nums.put(90, "XC");
        nums.put(400, "CD");
        nums.put(900, "CM");

        /**
         * 首先需要将数字转为字符串，然后按照索引依次遍历
         * 需要先判断是哪一位数
         * 比如34，有两位数，第一位是30，其小于50，则用XXX表示，第二位数是4，是特殊数字，用IV
         * 判断的关键就是看当前数字与5的关系
         * 如果小于5，用当前数字对应的整数，比如3-1-1-1 = 0; 20-10-10 = 0；
         * 所以34 = XXXIV
         * 2 = 2 * 10^0, 20 = 2 * 10^1, 200 = 2 * 10^2
         */

        String input = String.valueOf(num);
        int indice = input.length();

        for(int i = 0; i < indice; i++) {
            // 取得当前数字对应位数的值
            int cur = Integer.valueOf(input.substring(i, i+1));
            int curNum = (int)(cur * Math.pow(10, indice-1-i));
            int compare = (int) (5 * Math.pow(10, indice-1-i));
            // 将当前数字和5对应的位数的值做对比
            if (nums.containsKey(curNum)) {
                res += nums.get(curNum);
            }
            // 如果比5小，则一直减到0
            else if (curNum < compare) {
                while (curNum > 0) {
                    if (nums.containsKey(curNum)) {
                        res += nums.get(curNum);
                    }else{
                        res += nums.get(compare/5);
                    }
                    curNum -= compare/5;
                }
            }
            // 如果比5大，则先将compare的数字加上再一直减到5
            else if (curNum > compare) {
                res += nums.get(compare);
                while (curNum > compare) {
                    if (nums.containsKey(curNum)) {
                        res += nums.get(curNum);
                    }else{
                        res += nums.get(compare/5);
                    }
                    curNum -= compare/5;
                }
            }
        }
        return res;
    }
}