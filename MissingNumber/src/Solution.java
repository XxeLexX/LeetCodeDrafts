import java.util.Arrays;

public class Solution {
    public int missingNumber(int[] nums) {
        return way1(nums);
        //return way2(nums);
    }
    
    private int way1(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        int sumOfnums = 0;
        for (int i = 0; i < n; i++) {
            sumOfnums += nums[i];
        }
        return sum - sumOfnums;
    }

    private int way2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}