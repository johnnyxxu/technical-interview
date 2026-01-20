package upstart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    private MergeSortedArray solution;

    @BeforeEach
    void setUp() {
        solution = new MergeSortedArray();
    }

    @Test
    void testExample1_BothArraysNonEmpty() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        solution.merge(nums1, 3, nums2, 3);
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1,
                "Should merge [1,2,3] and [2,5,6] into [1,2,2,3,5,6]");
    }

    @Test
    void testExample2_EmptyNums2() {
        int[] nums1 = {1};
        int[] nums2 = {};
        solution.merge(nums1, 1, nums2, 0);
        assertArrayEquals(new int[]{1}, nums1,
                "Should handle empty nums2 and keep nums1 unchanged");
    }

    @Test
    void testExample3_EmptyNums1() {
        int[] nums1 = {0};
        int[] nums2 = {1};
        solution.merge(nums1, 0, nums2, 1);
        assertArrayEquals(new int[]{1}, nums1,
                "Should handle empty nums1 and copy nums2 into nums1");
    }

    @Test
    void testEdgeCase_SingleElementEach() {
        int[] nums1 = {2, 0};
        int[] nums2 = {1};
        solution.merge(nums1, 1, nums2, 1);
        assertArrayEquals(new int[]{1, 2}, nums1,
                "Should merge single element arrays correctly");
    }

    @Test
    void testEdgeCase_Nums1LargerThanNums2() {
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int[] nums2 = {1, 2, 3};
        solution.merge(nums1, 3, nums2, 3);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, nums1,
                "Should handle case where all nums1 elements are larger than nums2");
    }

    @Test
    void testEdgeCase_Nums2LargerThanNums1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {4, 5, 6};
        solution.merge(nums1, 3, nums2, 3);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, nums1,
                "Should handle case where all nums2 elements are larger than nums1");
    }

    @Test
    void testInterleaved_ElementsAlternate() {
        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int[] nums2 = {2, 4, 6};
        solution.merge(nums1, 3, nums2, 3);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, nums1,
                "Should handle interleaved elements correctly");
    }

    @Test
    void testDuplicates_SameElementsInBothArrays() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {1, 2, 3};
        solution.merge(nums1, 3, nums2, 3);
        assertArrayEquals(new int[]{1, 1, 2, 2, 3, 3}, nums1,
                "Should handle duplicate elements correctly");
    }

    @Test
    void testDuplicates_AllSameValue() {
        int[] nums1 = {2, 2, 2, 0, 0};
        int[] nums2 = {2, 2};
        solution.merge(nums1, 3, nums2, 2);
        assertArrayEquals(new int[]{2, 2, 2, 2, 2}, nums1,
                "Should handle all same values correctly");
    }

    @Test
    void testNegativeNumbers_Mixed() {
        int[] nums1 = {-3, -1, 2, 0, 0, 0};
        int[] nums2 = {-2, 0, 3};
        solution.merge(nums1, 3, nums2, 3);
        assertArrayEquals(new int[]{-3, -2, -1, 0, 2, 3}, nums1,
                "Should handle negative numbers correctly");
    }

    @Test
    void testNegativeNumbers_AllNegative() {
        int[] nums1 = {-6, -4, -2, 0, 0, 0};
        int[] nums2 = {-5, -3, -1};
        solution.merge(nums1, 3, nums2, 3);
        assertArrayEquals(new int[]{-6, -5, -4, -3, -2, -1}, nums1,
                "Should handle all negative numbers correctly");
    }

    @Test
    void testBoundary_LargeValues() {
        int[] nums1 = {1000000000, 0};
        int[] nums2 = {999999999};
        solution.merge(nums1, 1, nums2, 1);
        assertArrayEquals(new int[]{999999999, 1000000000}, nums1,
                "Should handle large positive values correctly");
    }

    @Test
    void testBoundary_SmallValues() {
        int[] nums1 = {-1000000000, 0};
        int[] nums2 = {-999999999};
        solution.merge(nums1, 1, nums2, 1);
        assertArrayEquals(new int[]{-1000000000, -999999999}, nums1,
                "Should handle large negative values correctly");
    }

    @Test
    void testLongArray_Nums1LongerThanNums2() {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 0, 0};
        int[] nums2 = {9, 10};
        solution.merge(nums1, 8, nums2, 2);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, nums1,
                "Should handle case where nums1 has many more elements than nums2");
    }

    @Test
    void testLongArray_Nums2LongerThanNums1() {
        int[] nums1 = {9, 10, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8};
        solution.merge(nums1, 2, nums2, 8);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, nums1,
                "Should handle case where nums2 has many more elements than nums1");
    }

    @Test
    void testZeros_ContainingZeros() {
        int[] nums1 = {-1, 0, 1, 0, 0, 0};
        int[] nums2 = {-2, 0, 2};
        solution.merge(nums1, 3, nums2, 3);
        assertArrayEquals(new int[]{-2, -1, 0, 0, 1, 2}, nums1,
                "Should handle arrays containing zeros correctly");
    }

    @Test
    void testPattern_ConsecutiveNumbers() {
        int[] nums1 = {1, 3, 5, 7, 0, 0, 0, 0};
        int[] nums2 = {2, 4, 6, 8};
        solution.merge(nums1, 4, nums2, 4);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, nums1,
                "Should correctly merge to form consecutive sequence");
    }

    @Test
    void testPattern_DuplicatesAtEnd() {
        int[] nums1 = {1, 2, 2, 0, 0};
        int[] nums2 = {2, 3};
        solution.merge(nums1, 3, nums2, 2);
        assertArrayEquals(new int[]{1, 2, 2, 2, 3}, nums1,
                "Should handle multiple duplicates correctly");
    }

    @Test
    void testPattern_SingleElementNums1Multiple() {
        int[] nums1 = {5, 0, 0, 0, 0};
        int[] nums2 = {1, 2, 3, 4};
        solution.merge(nums1, 1, nums2, 4);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, nums1,
                "Should handle single element in nums1 with multiple in nums2");
    }

    @Test
    void testPattern_SingleElementNums2Multiple() {
        int[] nums1 = {1, 2, 3, 4, 0};
        int[] nums2 = {5};
        solution.merge(nums1, 4, nums2, 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, nums1,
                "Should handle multiple elements in nums1 with single in nums2");
    }
}