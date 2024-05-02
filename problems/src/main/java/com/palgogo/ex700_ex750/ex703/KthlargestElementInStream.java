package com.palgogo.ex700_ex750.ex703;

import java.util.PriorityQueue;

public class KthlargestElementInStream {
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    final int k;

    KthlargestElementInStream(int k, int[] nums){
        this.k = k;
        for(int n:nums) add(n);
    }

    private int add(int val) {
        if (heap.size() < k) heap.offer(val);
        else if (heap.peek() < val) {
            heap.poll();
            heap.offer(val);
        }
        return heap.peek();
    }
}
