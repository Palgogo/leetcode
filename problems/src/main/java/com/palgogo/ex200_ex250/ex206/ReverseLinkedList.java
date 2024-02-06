package com.palgogo.ex200_ex250.ex206;

public class ReverseLinkedList {
    //iterative
    public ListNode reversedList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        ListNode currentNext = null;

        while (current != null) {
            currentNext = current.next;
            current.next = previous;
            previous = current;
            current = currentNext;
        }
        return previous;
    }

    public ListNode reverseListRecursive(ListNode head) {
        return reverse(head, null);
    }

    ListNode reverse(ListNode node, ListNode prev) {
        if (node == null) return prev;
        ListNode temp = node.next;
        node.next = prev;
        return reverse(temp, node);
    }
}

