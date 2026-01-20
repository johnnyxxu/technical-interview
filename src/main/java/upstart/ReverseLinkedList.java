package upstart;

import java.util.Stack;

/**
 * LeetCode #206 - Reverse Linked List
 * Difficulty: Easy
 * Frequency: 41% in Upstart interviews
 *
 * Problem Statement:
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 *
 * Additional Details:
 * - The number of nodes in the list is in the range [0, 5000]
 *
 * Follow-up:
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 *
 * Examples:
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 *
 * Input: head = [1,2]
 * Output: [2,1]
 *
 * Input: head = []
 * Output: []
 *
 * Key Approaches:
 * 1. Iterative: Use three pointers (prev, current, next) to reverse links in-place
 *    - Time: O(n), Space: O(1)
 * 2. Recursive: Reverse the rest of the list first, then adjust current node's pointers
 *    - Time: O(n), Space: O(n) due to recursion stack
 *
 * LeetCode Link: https://leetcode.com/problems/reverse-linked-list/
 */
public class ReverseLinkedList {

    /**
     * Reverses a singly linked list iteratively.
     *
     * @param head the head of the singly linked list
     * @return the head of the reversed linked list
     */
    public ListNode reverseListIterative(ListNode head) {
        // Handle empty list edge case
        if (head == null) return null;

        // Use a stack: first in, last out (FILO)
        // Push all nodes onto the stack to reverse their order
        ListNode temp = head;
        Stack<ListNode> stack = new Stack<>();
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }

        // Pop the first node from stack - this becomes the new head
        // (originally the last node of the list)
        ListNode newHead = stack.pop();
        temp = newHead;
        ListNode next;

        // Pop remaining nodes and rebuild the list in reverse order
        while (!stack.isEmpty()) {
            next = stack.pop();
            temp.next = next;
            temp = next;
        }

        // Terminate the list by setting the last node's next to null
        temp.next = null;
        return newHead;
    }
}
