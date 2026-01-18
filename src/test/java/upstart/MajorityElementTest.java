package upstart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for MajorityElement solution.
 */
public class MajorityElementTest {

    private final MajorityElement solution = new MajorityElement();

    @Test
    public void testExample1_SimpleMajority() {
        int[] nums = {3, 2, 3};
        assertEquals(3, solution.majorityElement(nums),
            "3 appears twice, which is more than half of 3 elements");
    }

    @Test
    public void testExample2_LongerArray() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        assertEquals(2, solution.majorityElement(nums),
            "2 appears 4 times out of 7, which is more than half");
    }

    @Test
    public void testSingleElement() {
        int[] nums = {1};
        assertEquals(1, solution.majorityElement(nums),
            "Single element is always the majority");
    }

    @Test
    public void testTwoElements_SameValue() {
        int[] nums = {5, 5};
        assertEquals(5, solution.majorityElement(nums),
            "Both elements are the same");
    }

    @Test
    public void testAllSameElements() {
        int[] nums = {7, 7, 7, 7, 7};
        assertEquals(7, solution.majorityElement(nums),
            "All elements are the same");
    }

    @Test
    public void testMajorityAtStart() {
        int[] nums = {1, 1, 1, 1, 2, 3, 4};
        assertEquals(1, solution.majorityElement(nums),
            "Majority element appears at the beginning");
    }

    @Test
    public void testMajorityAtEnd() {
        int[] nums = {1, 2, 3, 4, 4, 4, 4};
        assertEquals(4, solution.majorityElement(nums),
            "Majority element appears at the end");
    }

    @Test
    public void testMajorityScattered() {
        int[] nums = {1, 3, 1, 5, 1, 7, 1};
        assertEquals(1, solution.majorityElement(nums),
            "Majority element scattered throughout array");
    }

    @Test
    public void testNegativeNumbers() {
        int[] nums = {-1, -1, -1, 2, 2};
        assertEquals(-1, solution.majorityElement(nums),
            "Should work with negative numbers");
    }

    @Test
    public void testMixedPositiveNegative() {
        int[] nums = {-5, -5, 3, -5, 2, -5, -5};
        assertEquals(-5, solution.majorityElement(nums),
            "Majority element can be negative");
    }

    @Test
    public void testZeroAsMajority() {
        int[] nums = {0, 0, 0, 1, 2};
        assertEquals(0, solution.majorityElement(nums),
            "Zero can be the majority element");
    }

    @Test
    public void testLargeNumbers() {
        int[] nums = {1000000000, 1000000000, 1000000000, 999999999, 999999999};
        assertEquals(1000000000, solution.majorityElement(nums),
            "Should work with large numbers");
    }

    @Test
    public void testAlternatingPattern_MajorityWins() {
        int[] nums = {1, 2, 1, 2, 1, 2, 1};
        assertEquals(1, solution.majorityElement(nums),
            "1 appears 4 times, 2 appears 3 times");
    }

    @Test
    public void testLargeArray_ExactlyHalfPlusOne() {
        // Create array of size 9 where majority element appears exactly 5 times (> 4.5)
        int[] nums = {5, 5, 5, 5, 5, 1, 2, 3, 4};
        assertEquals(5, solution.majorityElement(nums),
            "Majority element appears exactly ⌊n/2⌋ + 1 times");
    }

    @Test
    public void testEvenSizedArray() {
        int[] nums = {1, 1, 1, 1, 2, 2};
        assertEquals(1, solution.majorityElement(nums),
            "In even-sized array, majority element appears more than n/2 times");
    }

    @Test
    public void testOddSizedArray() {
        int[] nums = {1, 1, 1, 2, 2};
        assertEquals(1, solution.majorityElement(nums),
            "In odd-sized array, majority element appears more than n/2 times");
    }

    @Test
    public void testConsecutiveMajority() {
        int[] nums = {8, 8, 8, 8, 1, 2, 3};
        assertEquals(8, solution.majorityElement(nums),
            "Majority element appears consecutively");
    }

    @Test
    public void testMajorityInMiddle() {
        int[] nums = {1, 2, 5, 5, 5, 5, 5, 3, 4};
        assertEquals(5, solution.majorityElement(nums),
            "Majority element concentrated in the middle");
    }
}