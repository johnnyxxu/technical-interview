package upstart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

    private final MaximumSubarray solution = new MaximumSubarray();

    @Test
    void testExample1() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, solution.maxSubArray(nums));
        // iterate through array
        // global max, current max
        // if x > x + current max, a new max starts, current max = x, otherwise current max = current + x;
        // current max = max(current max, x)
        // max = max (max, current max)
    }

    @Test
    void testExample2() {
        int[] nums = {1};
        assertEquals(1, solution.maxSubArray(nums));
    }

    @Test
    void testExample3() {
        int[] nums = {5, 4, -1, 7, 8};
        assertEquals(23, solution.maxSubArray(nums));
    }

    @Test
    void testAllNegative() {
        int[] nums = {-3, -2, -5, -1, -4};
        assertEquals(-1, solution.maxSubArray(nums));
    }

    @Test
    void testAllPositive() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(15, solution.maxSubArray(nums));
    }

    @Test
    void testMixedWithZeros() {
        int[] nums = {-2, 0, -1};
        assertEquals(0, solution.maxSubArray(nums));
    }

    @Test
    void testSingleNegative() {
        int[] nums = {-5};
        assertEquals(-5, solution.maxSubArray(nums));
    }

    @Test
    void testTwoElements() {
        int[] nums = {-1, 2};
        assertEquals(2, solution.maxSubArray(nums));
    }

    @Test
    void testAlternatingPattern() {
        int[] nums = {1, -1, 1, -1, 1};
        assertEquals(1, solution.maxSubArray(nums));
    }

    @Test
    void testLargePositiveAtEnd() {
        int[] nums = {-2, -3, -1, 10};
        assertEquals(10, solution.maxSubArray(nums));
    }

    @Test
    void testLargePositiveAtStart() {
        int[] nums = {10, -3, -2, -1};
        assertEquals(10, solution.maxSubArray(nums));
    }

    @Test
    void testMultipleSubarrays() {
        int[] nums = {2, -1, 2, -1, 2};
        assertEquals(4, solution.maxSubArray(nums));
    }
}