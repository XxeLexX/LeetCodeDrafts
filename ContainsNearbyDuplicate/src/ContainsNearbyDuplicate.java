public class ContainsNearbyDuplicate {
    /**
     * needed to be fixed
     * @param nums
     * @param k
     * @return
     */
    public boolean way1(int[] nums, int k) {
        if (nums.length <= k) {
            k = nums.length - 1;
        }
        // slide window
        for (int i = 0; i < nums.length - k; i++) {
            int window = k + i;
            while (window > i) {
                if (nums[i] == nums[window]) {
                    return true;
                }
                window--;
            }
        }
        return false;
    }

    /**
     * An approach via HashMap
     * @param nums
     * @param k
     * @return
     */
    public boolean way2(int[] nums, int k) {
        
        return false;
    }
}