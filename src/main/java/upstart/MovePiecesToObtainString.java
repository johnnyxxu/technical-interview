package upstart;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Move Pieces to Obtain a String (LeetCode #2337) - 45% Frequency
 * Difficulty: Medium
 *
 * Problem Statement:
 * You are given two strings start and target, both of length n. Each string consists only of the
 * characters 'L', 'R', and '_' where:
 * - The characters 'L' and 'R' represent pieces
 * - 'L' can move to the left only if there is a blank space directly to its left
 * - 'R' can move to the right only if there is a blank space directly to its right
 * - The character '_' represents a blank space that can be occupied by any piece
 *
 * Return true if it is possible to obtain the string target by moving the pieces of the string
 * start any number of times. Otherwise, return false.
 *
 * Examples:
 *
 * Example 1:
 * Input: start = "_L__R__R_", target = "L______RR"
 * Output: true
 *
 * Example 2:
 * Input: start = "R_L_", target = "__LR"
 * Output: false
 * Explanation: The 'R' piece can move one step right to obtain "_RL_", but cannot obtain target.
 *
 * Example 3:
 * Input: start = "_R", target = "R_"
 * Output: false
 * Explanation: The piece can only move right, so it's impossible to obtain target.
 *
 * Key Insight:
 * 'L' pieces can only move left and 'R' pieces can only move right, and they cannot cross over each other.
 *
 * Constraints:
 * - n == start.length == target.length
 * - 1 <= n <= 10^5
 * - start and target consist of the characters 'L', 'R', and '_'
 *
 * Approach:
 * - The sequence of non-blank pieces must be the same in both strings (since pieces can't cross)
 * - Each 'L' in start can only move left, so its position in start must be >= its position in target
 * - Each 'R' in start can only move right, so its position in start must be <= its position in target
 * - Use two pointers to traverse both strings simultaneously, skipping blanks
 *
 * @see <a href="https://leetcode.com/problems/move-pieces-to-obtain-a-string/">LeetCode #2337</a>
 */
public class MovePiecesToObtainString {

    /**
     * Determines if it's possible to transform start into target by moving pieces.
     *
     * @param start the starting string configuration
     * @param target the target string configuration
     * @return true if transformation is possible, false otherwise
     */
    public boolean canChange(String start, String target) {
        List<Map<Character, Integer>> startArray = new ArrayList<>();
        List<Map<Character, Integer>> targetArray = new ArrayList<>();
        for (int i=0; i<start.length(); i++) {
            if (start.charAt(i) != '_') {
                startArray.add(Map.of(start.charAt(i), i));
            }
        }

        for (int i=0; i<target.length(); i++) {
            if (target.charAt(i) != '_') {
                targetArray.add(Map.of(target.charAt(i), i));
            }
        }

        if (targetArray.size() != startArray.size()) return false;

        for (int i=0; i<targetArray.size(); i++) {
            Map.Entry<Character, Integer> map1 = targetArray.get(i).entrySet().iterator().next();
            Map.Entry<Character, Integer> map2 = startArray.get(i).entrySet().iterator().next();

            if (map1.getKey() != map2.getKey() ) {
                return false;
            } else if (map1.getKey() == 'L' && map2.getValue() < map1.getValue()) {
                return false;
            } else if (map1.getKey() == 'R' && map2.getValue() > map1.getValue()) {
                return false;
            }
        }
        return true;
    }
}