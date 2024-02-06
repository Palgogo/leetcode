package com.palgogo.ex200_ex250.ex206;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode node) {
        this.val = val;
        this.next = node;
    }
}
