package upstart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for CountElements solution.
 */
public class CountElementsTest {

    private final CountElements solution = new CountElements();

    @Test
    public void testExample1_ConsecutiveSequence() {
        int[] arr = {1, 2, 3};
        assertEquals(2, solution.countElements(arr),
            "Should count 1 and 2 (since 2 and 3 exist)");
    }

    @Test
    public void testExample2_WithDuplicates() {
        int[] arr = {1, 1, 2};
        assertEquals(2, solution.countElements(arr),
            "Each 1 should be counted separately because 2 exists");
    }

    @Test
    public void testExample3_NoConsecutivePairs() {
        int[] arr = {1, 1, 3, 3, 5, 5, 7, 7};
        assertEquals(0, solution.countElements(arr),
            "No consecutive pairs exist");
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        assertEquals(0, solution.countElements(arr),
            "Empty array should return 0");
    }

    @Test
    public void testSingleElement() {
        int[] arr = {1};
        assertEquals(0, solution.countElements(arr),
            "Single element has no pairs");
    }

    @Test
    public void testAllConsecutive() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(4, solution.countElements(arr),
            "All except 5 have their successor");
    }

    @Test
    public void testMultipleDuplicatesWithSuccessor() {
        int[] arr = {5, 5, 5, 6};
        assertEquals(3, solution.countElements(arr),
            "All three 5s should be counted since 6 exists");
    }

    @Test
    public void testNegativeNumbers() {
        int[] arr = {-2, -1, 0, 1};
        assertEquals(3, solution.countElements(arr),
            "Should work with negative numbers");
    }

    @Test
    public void testMixedWithGaps() {
        int[] arr = {1, 3, 2, 3, 5, 0};
        assertEquals(3, solution.countElements(arr),
            "Should count: 0(has 1), 1(has 2), 2(has 3). Two 3s don't count.");
    }

    @Test
    public void testLargeGaps() {
        int[] arr = {1, 100, 200};
        assertEquals(0, solution.countElements(arr),
            "Large gaps mean no consecutive pairs");
    }

    @Test
    public void testAllSameNumber() {
        int[] arr = {7, 7, 7, 7};
        assertEquals(0, solution.countElements(arr),
            "All same number with no successor");
    }

    @Test
    public void testNullArray() {
        int[] arr = null;
        assertEquals(0, solution.countElements(arr),
            "Null array should return 0");
    }
}