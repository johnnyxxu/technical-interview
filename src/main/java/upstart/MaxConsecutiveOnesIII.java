package upstart;

/**
 * Max Consecutive Ones III (LeetCode #1004) - 44% Frequency
 *
 * Difficulty: Medium
 *
 * Problem Statement:
 * Given a binary array nums and an integer k, return the maximum number of
 * consecutive 1's in the array if you can flip at most k 0's.
 *
 * Examples:
 *
 * Example 1:
 * Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
 * Output: 6
 * Explanation: [1,1,1,0,0,1,1,1,1,1,1]
 * Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 *
 * Example 2:
 * Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
 * Output: 10
 * Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
 * Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 *
 * Constraints:
 * - 1 <= nums.length <= 10^5
 * - nums[i] is either 0 or 1
 * - 0 <= k <= nums.length
 *
 * Approach:
 * This problem is typically solved using a sliding window technique to efficiently
 * find the longest contiguous subarray containing at most k zeros. We maintain a
 * window with left and right pointers, expanding the window by moving right and
 * shrinking it by moving left when we exceed k zeros.
 *
 * Time Complexity: O(n) where n is the length of nums
 * Space Complexity: O(1) - only using a few variables
 *
 * LeetCode Link: https://leetcode.com/problems/max-consecutive-ones-iii/
 */
public class MaxConsecutiveOnesIII {

    /**
     * Finds the maximum number of consecutive 1's after flipping at most k 0's.
     *
     * @param nums binary array containing only 0's and 1's
     * @param k maximum number of 0's that can be flipped
     * @return maximum length of consecutive 1's achievable
     */
    public int longestOnes(int[] nums, int k) {
        // keep index, left=0;
        // keep expanding right
        // count number of zeros
        // when number of zeros exceeds k: then increment left
        // to the first zero again. so zero count == k.
        // ans = max(ans, right-left+1)

        int left=0, countZeros=0, ans=0;
        for (int i=0; i< nums.length; i++) {
            if (nums[i]==0) {
                countZeros++;
                if (countZeros > k) {
                    while (nums[left]==1) {
                        left++;
                    }
                    left++;
                    countZeros--;
                }
            }
            ans = Math.max(ans, i-left+1);
        }
        return ans;
    }
}