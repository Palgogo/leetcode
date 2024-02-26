package com.palgogo.ex100_ex149.ex141;

import java.util.HashSet;
import java.util.Set;

public class ListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode curr = head;
        Set<ListNode> set = new HashSet<>();
        //get the listnode object, if no add with 1 integer, if yes - we have a loop
        while (curr != null) {
            if (set.contains(curr)) {
                return true;
            } else {
                set.add(curr);
                curr = curr.next;
            }
        }
        return false;
    }


}
