package upstart;

/**
 * Maximum Subarray
 *
 * Given an integer array nums, find the contiguous subarray (containing at least one number)
 * which has the largest sum and return its sum.
 *
 * Example 1:
 * Input: nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
 * Output: 6
 * Explanation: The contiguous subarray [4, -1, 2, 1] has the largest sum of 6.
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return Integer.MIN_VALUE;
        int globalMax = nums[0], currentMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(currentMax + nums[i], nums[i]);
            globalMax = Math.max(globalMax, currentMax);
        }
        return globalMax;
    }
}