package com.palgogo.ex200_ex250.ex206;

import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {

    @Test
    void reverseList() {
        ListNode list = getList();

        //when
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.reversedList(list);
    }

    ListNode getList() {
        int n = 5;
        ListNode head = new ListNode(0);
        ListNode temp = head;
        for (int i = 1; i <= n; i++) {
            ListNode listNode = new ListNode(i);
            temp.next = listNode;
            temp = listNode;
        }
        return head;
    }
}