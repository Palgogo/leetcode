package com.palgogo.ex1_ex50.ex21;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //iterative
        ListNode root = new ListNode();
        ListNode prev = root;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }
        prev.next = list1 != null ? list1 : list2;
        return root.next;
    }

    public ListNode mergeTwoListsRecursively(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val < list2.val) {
            list1.next = mergeTwoListsRecursively(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoListsRecursively(list1, list2.next);
            return list2;
        }

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {

    }

}
