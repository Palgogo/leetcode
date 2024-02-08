package com.palgogo.ex1_ex50.ex19;

public class RemoveNodeFromEndList {
    //Using Two Pointer Approach:
    //         Take a pointer second and put it at (n+1)th position from the beginning
//         Take pointer first and move it forward till second reaches Last Node and second.next points to null
//         At that point we would have reached the (n-1)th node from the end using the pointer first
//         Unlink or Skip that node
    public ListNode removeNthFromEnd(ListNode head, int n){
        if (head == null || head.next == null) return null;

        ListNode tmp = new ListNode(0);
        tmp.next = head;
        ListNode first = tmp;
        ListNode second = tmp;

        while (n > 0){
            second = second.next;
            n--;
        }

        while (second.next != null) {
            first = first.next;
            second = second.next;
        }
        //delete node
        first.next = first.next.next;
        return tmp.next;
    }
}
