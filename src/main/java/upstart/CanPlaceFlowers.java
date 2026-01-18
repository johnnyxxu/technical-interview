package upstart;

/**
 * LeetCode #605 - Can Place Flowers
 * Difficulty: Easy
 * Frequency: 71%
 *
 * Problem Statement:
 * You have a long flowerbed in which some of the plots are planted, and some are not.
 * However, flowers cannot be planted in adjacent plots.
 *
 * Given an integer array `flowerbed` containing 0's and 1's, where 0 means empty and
 * 1 means not empty, and an integer `n`, return `true` if `n` new flowers can be
 * planted in the flowerbed without violating the no-adjacent-flowers rule and `false`
 * otherwise.
 *
 * Examples:
 * - Example 1: Input: flowerbed = [1,0,0,0,1], n = 1 → Output: true
 *   Explanation: Can plant a flower at index 2
 * - Example 2: Input: flowerbed = [1,0,0,0,1], n = 2 → Output: false
 *   Explanation: Only one position (index 2) is available
 *
 * Constraints:
 * - 1 <= flowerbed.length <= 2 * 10^4
 * - flowerbed[i] is 0 or 1
 * - There are no two adjacent flowers in flowerbed
 * - 0 <= n <= flowerbed.length
 *
 * Key Insight:
 * A position i can have a flower planted if:
 * - flowerbed[i] == 0
 * - (i == 0 OR flowerbed[i-1] == 0) - left is empty or at boundary
 * - (i == flowerbed.length-1 OR flowerbed[i+1] == 0) - right is empty or at boundary
 *
 * LeetCode Link: https://leetcode.com/problems/can-place-flowers/
 */
public class CanPlaceFlowers {

    /**
     * Determines if n new flowers can be planted in the flowerbed
     * without violating the no-adjacent-flowers rule.
     *
     * @param flowerbed array representing the flowerbed (0 = empty, 1 = planted)
     * @param n number of new flowers to plant
     * @return true if n flowers can be planted, false otherwise
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // find the first 1, then you know the next one can be one
        // find the zeros before the first 1, then count/2, 1's can be planted
        int start=-1, zeros = 0;
        for (int i=0; i< flowerbed.length; i++) {
            if (flowerbed[i] == 1) {
                start = i;
                break;
            } else {
                zeros++;
            }
        }

        int count=0;
        if (start == -1) {
            count = (zeros+1)/2;
            return count >= n;
        }

        for (int i = start; i< flowerbed.length; i++) {
            if ((i-start) % 2 ==0 && flowerbed[i-start] ==0) {
                count ++;
            }
        }

        return (count >= n);
    }
}