package com.palgogo.ex150_ex200.ex138;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomNumber {
    //first copy value as node in map values,
    // then go throw map again and set new links
    public Node copyListWithRandom(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node cur = head;
        while (cur != null) {
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }

        cur = head;
        while (cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }

        return map.get(head);
    }
}
