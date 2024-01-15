import java.util.HashMap;
import java.util.HashSet;

public class ContainsNearbyDuplicate {
    /**
     * An approach via HashMap
     * @param nums
     * @param k
     * @return
     */
    public boolean way1(int[] nums, int k) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numbers.containsKey(nums[i]) && Math.abs(i - numbers.get(nums[i])) <= k) {
                return true;
            }
            numbers.put(nums[i], i);
        }
        return false;
    }

    /**
     * If the way by using sliding window can work?
     * @param nums
     * @param k
     * @return
     */
    public boolean way2(int[] nums, int k) {
        HashSet<Integer> window = new HashSet<>();
        for (int i = 0; i < nums.length; i ++) {
            if (i > k) {
                window.remove(nums[i - k - 1]);
            }
            if (!window.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}