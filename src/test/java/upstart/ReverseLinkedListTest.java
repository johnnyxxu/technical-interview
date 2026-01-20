package upstart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    private ReverseLinkedList solution;

    @BeforeEach
    void setUp() {
        solution = new ReverseLinkedList();
    }

    // Helper method to create a linked list from an array
    private ListNode createList(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    // Helper method to convert a linked list to an array for comparison
    private int[] listToArray(ListNode head) {
        if (head == null) {
            return new int[0];
        }
        // Count nodes
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        // Convert to array
        int[] result = new int[count];
        current = head;
        for (int i = 0; i < count; i++) {
            result[i] = current.val;
            current = current.next;
        }
        return result;
    }

    // Tests for Iterative Implementation

    @Test
    void testIterative_Example1_FiveElements() {
        ListNode head = createList(new int[]{1, 2, 3, 4, 5});
        ListNode reversed = solution.reverseListIterative(head);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, listToArray(reversed),
                "Should reverse list [1,2,3,4,5] to [5,4,3,2,1]");
    }

    @Test
    void testIterative_Example2_TwoElements() {
        ListNode head = createList(new int[]{1, 2});
        ListNode reversed = solution.reverseListIterative(head);
        assertArrayEquals(new int[]{2, 1}, listToArray(reversed),
                "Should reverse list [1,2] to [2,1]");
    }

    @Test
    void testIterative_Example3_EmptyList() {
        ListNode head = createList(new int[]{});
        ListNode reversed = solution.reverseListIterative(head);
        assertArrayEquals(new int[]{}, listToArray(reversed),
                "Should handle empty list and return empty list");
    }

    @Test
    void testIterative_EdgeCase_SingleElement() {
        ListNode head = createList(new int[]{1});
        ListNode reversed = solution.reverseListIterative(head);
        assertArrayEquals(new int[]{1}, listToArray(reversed),
                "Should handle single element list correctly");
    }

    @Test
    void testIterative_EdgeCase_NullInput() {
        ListNode reversed = solution.reverseListIterative(null);
        assertNull(reversed, "Should handle null input and return null");
    }

    @Test
    void testIterative_ThreeElements() {
        ListNode head = createList(new int[]{1, 2, 3});
        ListNode reversed = solution.reverseListIterative(head);
        assertArrayEquals(new int[]{3, 2, 1}, listToArray(reversed),
                "Should reverse list [1,2,3] to [3,2,1]");
    }

    @Test
    void testIterative_LongList_TenElements() {
        ListNode head = createList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        ListNode reversed = solution.reverseListIterative(head);
        assertArrayEquals(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, listToArray(reversed),
                "Should reverse longer list correctly");
    }

    @Test
    void testIterative_WithNegativeNumbers() {
        ListNode head = createList(new int[]{-5, -2, 0, 3, 7});
        ListNode reversed = solution.reverseListIterative(head);
        assertArrayEquals(new int[]{7, 3, 0, -2, -5}, listToArray(reversed),
                "Should handle negative numbers correctly");
    }

    @Test
    void testIterative_WithDuplicates() {
        ListNode head = createList(new int[]{1, 2, 2, 3, 3, 3});
        ListNode reversed = solution.reverseListIterative(head);
        assertArrayEquals(new int[]{3, 3, 3, 2, 2, 1}, listToArray(reversed),
                "Should handle duplicate values correctly");
    }

    @Test
    void testIterative_AllSameValues() {
        ListNode head = createList(new int[]{5, 5, 5, 5});
        ListNode reversed = solution.reverseListIterative(head);
        assertArrayEquals(new int[]{5, 5, 5, 5}, listToArray(reversed),
                "Should handle list with all same values");
    }
}