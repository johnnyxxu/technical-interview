package upstart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for CanPlaceFlowers solution.
 */
public class CanPlaceFlowersTest {

    private final CanPlaceFlowers solution = new CanPlaceFlowers();

    @Test
    public void testExample1_CanPlaceOne() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        assertTrue(solution.canPlaceFlowers(flowerbed, 1),
            "Should be able to plant 1 flower at index 2");
    }

    @Test
    public void testExample2_CannotPlaceTwo() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        assertFalse(solution.canPlaceFlowers(flowerbed, 2),
            "Can only plant 1 flower, not 2");
    }

    @Test
    public void testSingleEmpty_CanPlaceOne() {
        int[] flowerbed = {0};
        assertTrue(solution.canPlaceFlowers(flowerbed, 1),
            "Single empty plot can accommodate 1 flower");
    }

    @Test
    public void testSingleEmpty_CannotPlaceTwo() {
        int[] flowerbed = {0};
        assertFalse(solution.canPlaceFlowers(flowerbed, 2),
            "Single plot cannot accommodate 2 flowers");
    }

    @Test
    public void testSinglePlanted() {
        int[] flowerbed = {1};
        assertTrue(solution.canPlaceFlowers(flowerbed, 0),
            "Cannot plant any flowers, but n=0 should return true");
    }

    @Test
    public void testSinglePlanted_CannotPlaceOne() {
        int[] flowerbed = {1};
        assertFalse(solution.canPlaceFlowers(flowerbed, 1),
            "Already planted, cannot place any more");
    }

    @Test
    public void testAllEmpty() {
        int[] flowerbed = {0, 0, 0, 0, 0};
        assertTrue(solution.canPlaceFlowers(flowerbed, 3),
            "Should be able to plant at indices 0, 2, 4");
    }

    @Test
    public void testAllEmpty_TooMany() {
        int[] flowerbed = {0, 0, 0, 0, 0};
        assertFalse(solution.canPlaceFlowers(flowerbed, 4),
            "Can only plant 3 flowers with no-adjacent rule");
    }

    @Test
    public void testNEqualsZero() {
        int[] flowerbed = {1, 0, 1, 0, 1};
        assertTrue(solution.canPlaceFlowers(flowerbed, 0),
            "n=0 should always return true");
    }

    @Test
    public void testAlternating_NoSpace() {
        int[] flowerbed = {1, 0, 1, 0, 1};
        assertFalse(solution.canPlaceFlowers(flowerbed, 1),
            "No space available in alternating pattern");
    }

    @Test
    public void testCanPlaceAtStart() {
        int[] flowerbed = {0, 0, 1, 0, 0};
        assertTrue(solution.canPlaceFlowers(flowerbed, 1),
            "Can plant at index 0");
    }

    @Test
    public void testCanPlaceAtEnd() {
        int[] flowerbed = {1, 0, 0, 0, 0};
        assertTrue(solution.canPlaceFlowers(flowerbed, 2),
            "Can plant at indices 2 and 4");
    }

    @Test
    public void testTwoEmptyPlots() {
        int[] flowerbed = {0, 0};
        assertTrue(solution.canPlaceFlowers(flowerbed, 1),
            "Can plant 1 flower at index 0 or 1");
    }

    @Test
    public void testThreeEmptyPlots() {
        int[] flowerbed = {0, 0, 0};
        assertTrue(solution.canPlaceFlowers(flowerbed, 2),
            "Can plant flowers at indices 0 and 2");
    }

    @Test
    public void testFourEmptyPlots() {
        int[] flowerbed = {0, 0, 0, 0};
        assertTrue(solution.canPlaceFlowers(flowerbed, 2),
            "Can plant flowers at indices 0 and 2 (or 1 and 3)");
    }

    @Test
    public void testFlowersAtBothEnds() {
        int[] flowerbed = {1, 0, 0, 0, 0, 1};
        assertTrue(solution.canPlaceFlowers(flowerbed, 1),
            "Can plant at index 2 or 3");
    }

    @Test
    public void testLongGap() {
        int[] flowerbed = {1, 0, 0, 0, 0, 0, 0, 0, 1};
        assertTrue(solution.canPlaceFlowers(flowerbed, 3),
            "Long gap allows multiple plantings");
    }

    @Test
    public void testMultiplePlantedFlowers() {
        int[] flowerbed = {1, 0, 0, 0, 1, 0, 0, 0, 1};
        assertTrue(solution.canPlaceFlowers(flowerbed, 2),
            "Two separate gaps, each can fit one flower");
    }

    @Test
    public void testNoGaps() {
        int[] flowerbed = {1, 0, 1, 0, 1, 0, 1};
        assertFalse(solution.canPlaceFlowers(flowerbed, 1),
            "No valid positions available");
    }

    @Test
    public void testExactFit() {
        int[] flowerbed = {0, 0, 0, 0, 0, 0, 0};
        assertTrue(solution.canPlaceFlowers(flowerbed, 4),
            "Can plant exactly 4 flowers at indices 0, 2, 4, 6");
    }

    @Test
    public void testStartWithPlanted() {
        int[] flowerbed = {1, 0, 0, 0};
        assertTrue(solution.canPlaceFlowers(flowerbed, 1),
            "Can plant at index 2");
    }

    @Test
    public void testEndWithPlanted() {
        int[] flowerbed = {0, 0, 0, 1};
        assertTrue(solution.canPlaceFlowers(flowerbed, 1),
            "Can plant at index 0");
    }
}