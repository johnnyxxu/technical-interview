package upstart;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode #169 - Majority Element
 * Difficulty: Easy
 * Frequency: 100%
 *
 * Problem Statement:
 * Given an array nums of size n, return the majority element. The majority element
 * is the element that appears more than ⌊n / 2⌋ times. You may assume that the
 * majority element always exists in the array.
 *
 * Key Points:
 * - Find an element that appears more than half the time in the array
 * - It's guaranteed that such a majority element always exists
 * - Common approaches include:
 *   1. Hash Map: Count occurrences of each element
 *   2. Sorting: Sort array and return middle element
 *   3. Boyer-Moore Voting Algorithm: O(1) space solution
 *
 * Examples:
 * - Input: nums = [3,2,3] → Output: 3
 * - Input: nums = [2,2,1,1,1,2,2] → Output: 2
 *
 * Constraints:
 * - n == nums.length
 * - 1 <= n <= 5 * 10^4
 * - -10^9 <= nums[i] <= 10^9
 *
 * Follow-up: Could you solve the problem in linear time and in O(1) space?
 *
 * LeetCode Link: https://leetcode.com/problems/majority-element/
 */
public class MajorityElement {

    /**
     * Finds the majority element in the array.
     * The majority element appears more than ⌊n / 2⌋ times.
     *
     * @param nums the input array
     * @return the majority element
     */
    public int majorityElement(int[] nums) {
        // TODO: Implement solution

        // iterate through array, keep count of i, <i, count++>
        // iterate through map key set, if one key value is greater than n/2
        // return that number
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            int count = map.getOrDefault(i, 0)+1;
            map.put(i, count);
            if (count > nums.length/2) return i;
        }

        return 0;
    }
}