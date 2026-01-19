package upstart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Comprehensive test cases for Max Consecutive Ones III (LeetCode #1004)
 */
public class MaxConsecutiveOnesIIITest {

    private final MaxConsecutiveOnesIII solution = new MaxConsecutiveOnesIII();

    // Example test cases from problem statement

    @Test
    public void testExample1_TwoFlips() {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        assertEquals(6, solution.longestOnes(nums, k),
                "Should flip 2 zeros to get 6 consecutive ones");
    }

    @Test
    public void testExample2_ThreeFlips() {
        int[] nums = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k = 3;
        assertEquals(10, solution.longestOnes(nums, k),
                "Should flip 3 zeros to get 10 consecutive ones");
    }

    // Edge cases

    @Test
    public void testEdgeCase_SingleOne() {
        int[] nums = {1};
        int k = 0;
        assertEquals(1, solution.longestOnes(nums, k),
                "Single 1 with no flips should return 1");
    }

    @Test
    public void testEdgeCase_SingleZero() {
        int[] nums = {0};
        int k = 1;
        assertEquals(1, solution.longestOnes(nums, k),
                "Single 0 with 1 flip should return 1");
    }

    @Test
    public void testEdgeCase_SingleZeroNoFlips() {
        int[] nums = {0};
        int k = 0;
        assertEquals(0, solution.longestOnes(nums, k),
                "Single 0 with no flips should return 0");
    }

    @Test
    public void testEdgeCase_AllOnes() {
        int[] nums = {1, 1, 1, 1, 1};
        int k = 0;
        assertEquals(5, solution.longestOnes(nums, k),
                "All ones should return full length");
    }

    @Test
    public void testEdgeCase_AllZeros() {
        int[] nums = {0, 0, 0, 0, 0};
        int k = 5;
        assertEquals(5, solution.longestOnes(nums, k),
                "All zeros with k flips equal to length should return full length");
    }

    @Test
    public void testEdgeCase_AllZerosPartialFlips() {
        int[] nums = {0, 0, 0, 0, 0};
        int k = 2;
        assertEquals(2, solution.longestOnes(nums, k),
                "All zeros with k=2 should return 2");
    }

    // Boundary conditions

    @Test
    public void testBoundary_NoFlipsAllowed() {
        int[] nums = {1, 0, 1, 1, 0, 1};
        int k = 0;
        assertEquals(2, solution.longestOnes(nums, k),
                "With k=0, should find longest existing sequence of 1's");
    }

    @Test
    public void testBoundary_FlipsEqualLength() {
        int[] nums = {0, 1, 0, 1, 0};
        int k = 5;
        assertEquals(5, solution.longestOnes(nums, k),
                "When k >= length, can flip all zeros");
    }

    @Test
    public void testBoundary_ExactlyKZeros() {
        int[] nums = {1, 1, 0, 0, 1, 1};
        int k = 2;
        assertEquals(6, solution.longestOnes(nums, k),
                "Array with exactly k zeros should return full length");
    }

    // Data pattern variations

    @Test
    public void testPattern_AlternatingBits() {
        int[] nums = {0, 1, 0, 1, 0, 1, 0};
        int k = 2;
        assertEquals(5, solution.longestOnes(nums, k),
                "Alternating pattern with k=2 should handle correctly");
    }

    @Test
    public void testPattern_ZerosAtStart() {
        int[] nums = {0, 0, 0, 1, 1, 1, 1};
        int k = 2;
        assertEquals(6, solution.longestOnes(nums, k),
                "Zeros at start should be handled correctly");
    }

    @Test
    public void testPattern_ZerosAtEnd() {
        int[] nums = {1, 1, 1, 1, 0, 0, 0};
        int k = 2;
        assertEquals(6, solution.longestOnes(nums, k),
                "Zeros at end should be handled correctly");
    }

    @Test
    public void testPattern_ZerosInMiddle() {
        int[] nums = {1, 1, 0, 0, 0, 1, 1};
        int k = 1;
        assertEquals(3, solution.longestOnes(nums, k),
                "Zeros in middle with limited flips should find best window");
    }

    @Test
    public void testPattern_MultipleGroups() {
        int[] nums = {1, 1, 0, 1, 1, 1, 0, 1, 1};
        int k = 1;
        assertEquals(6, solution.longestOnes(nums, k),
                "Should find optimal window across multiple groups");
    }

    @Test
    public void testPattern_LongSequence() {
        int[] nums = {1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1};
        int k = 1;
        assertEquals(7, solution.longestOnes(nums, k),
                "Should handle long sequences with single flip");
    }

    // Additional edge cases

    @Test
    public void testAdditional_TwoElements() {
        int[] nums = {0, 1};
        int k = 1;
        assertEquals(2, solution.longestOnes(nums, k),
                "Two elements with one flip should return 2");
    }

    @Test
    public void testAdditional_MoreFlipsThanNeeded() {
        int[] nums = {1, 0, 1, 0, 1};
        int k = 10;
        assertEquals(5, solution.longestOnes(nums, k),
                "More flips than needed should return full length");
    }

    @Test
    public void testAdditional_ConsecutiveZeros() {
        int[] nums = {1, 0, 0, 0, 0, 1, 1, 1};
        int k = 2;
        assertEquals(5, solution.longestOnes(nums, k),
                "Should handle consecutive zeros optimally");
    }
}