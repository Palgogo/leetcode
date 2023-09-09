package com.palgogo.ex300_ex350.ex347;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public int[] topKFrequentElements(int[] nums, int k){

        //add nums to hashmap with keyset of frequency
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        int[] result = new int[k];
        //create priority queue, with comparing by keys

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> hashMap.get(o2) - hashMap.get(o1));
        //move keyset to the queue
        for (int i : hashMap.keySet()) {
            priorityQueue.add(i);
        }

        //get first k results as answer
        for (int i = 0; i < k; i++) {
            result[i] = priorityQueue.poll();
        }
        return result;
    }
}
