import java.util.Arrays;
import java.util.HashMap;

public class ContainsDuplicate {
    /**
     * Approach via HashMap
     * @param nums
     * @return
     */
    public boolean wayOne(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }

        HashMap<Integer, Integer> res = new HashMap<>();
        for (int i: nums) {
            if (res.containsKey(i)) {
                return true;
            }
            res.put(i, 1);
        }
        return false;
    }

    /**
     * Approach via sorting array, time complexity = O(n*log(n))
     * @param nums
     * @return
     */
    public boolean wayTwo(int[] nums) {
        int lengthOfNums = nums.length;
        if (lengthOfNums <= 1) {
            return false;
        }
        Arrays.sort(nums);

        for (int i = 1; i < lengthOfNums; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}