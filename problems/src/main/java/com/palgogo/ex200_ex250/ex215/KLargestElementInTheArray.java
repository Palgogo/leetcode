package com.palgogo.ex200_ex250.ex215;

import java.util.PriorityQueue;

public class KLargestElementInTheArray {

    int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int num : nums) {
            q.add(num);

            if (q.size() > k) {
                q.poll();
            }
        }
        return q.peek();
    }
}
