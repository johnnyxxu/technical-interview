package upstart;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode #88 - Merge Sorted Array
 * Difficulty: Easy
 * Frequency: 36% in Upstart interviews
 *
 * Problem Statement:
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 *
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * The final sorted array should not be returned by the function, but instead be
 * stored inside the array nums1.
 *
 * To accommodate this, nums1 has a length of m + n, where the first m elements
 * denote the elements that should be merged, and the last n elements are set to 0
 * and should be ignored. nums2 has a length of n.
 *
 * Additional Details:
 * - nums1.length == m + n
 * - nums2.length == n
 * - 0 <= m, n <= 200
 * - 1 <= m + n <= 200
 * - -10^9 <= nums1[i], nums2[j] <= 10^9
 *
 * Examples:
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6].
 *
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 * Explanation: The arrays we are merging are [1] and [].
 * The result of the merge is [1].
 *
 * Input: nums1 = [0], m = 0, nums2 = [1], n = 1
 * Output: [1]
 * Explanation: The arrays we are merging are [] and [1].
 * The result of the merge is [1].
 *
 * Key Approaches:
 * 1. Forward Two-Pointer with Auxiliary Array:
 *    - Use two pointers to compare elements from nums1 and nums2
 *    - Store merged result in temporary array, then copy back to nums1
 *    - Time: O(m+n), Space: O(m+n)
 *
 * 2. Backward Three-Pointer (Optimal):
 *    - Start from the end of both arrays and fill nums1 from the back
 *    - Compare elements from right to left, placing larger element at end
 *    - No extra space needed since we're filling the empty slots in nums1
 *    - Time: O(m+n), Space: O(1)
 *
 * Follow-up:
 * Can you come up with an algorithm that runs in O(m + n) time with O(1) extra space?
 *
 * LeetCode Link: https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeSortedArray {

    /**
     * Merges two sorted arrays into the first array.
     *
     * @param nums1 first sorted array with space for merged result
     * @param m number of elements in nums1 (excluding trailing zeros)
     * @param nums2 second sorted array
     * @param n number of elements in nums2
     */

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // start index: 0:m+n
        // i, for num1, j for num 2;
        // if (i >= m): add nums2[j], j++;
        // else if (j >= n): add nums1[i], i++;
        // else:
                //(num1[i] <= nums[j]): add nums1[i], i++
                // else: add num2[j], j++
        // rewrite nums1 from the queue

        Queue<Integer> queue = new LinkedList<>();
        int i=0, j=0, count=0;
        while (count < m+n) {
            if (i >= m) {
                queue.add(nums2[j]);
                j++;
            } else if (j >= n) {
                queue.add(nums1[i]);
                i++;
            } else {
                if (nums1[i] <= nums2[j]) {
                    queue.add(nums1[i]);
                    i++;
                } else {
                    queue.add(nums2[j]);
                    j++;
                }
            }
            count++;
        }
        count=0;
        while (!queue.isEmpty()) {
            nums1[count] = queue.poll();
            count++;
        }
    }
}