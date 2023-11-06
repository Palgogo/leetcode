package com.palgogo.ex1_ex50.ex100_ex150.ex128;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] numbers) {
        //fill the hashset
        Set<Integer> sequence = new HashSet<>();
        int longest;
        int max = 0;
        int answer = 0;
        for(int i: numbers){
            sequence.add(i);
        }
        //check the set of longest sequence
        for (int i : sequence){
            //we iterate only on first potential position from sequence, other - skip
            if (!sequence.contains(i-1)){
                longest = i;
                max = 1;
                //check if we have next in sequence
                while (sequence.contains(longest+1)){
                    max++;
                    longest++;
                }
            }
            answer = Math.max(answer, max);
        }
        return answer;
    }
}
