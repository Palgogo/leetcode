package com.palgogo.ex850_ex900.ex853;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;

public class CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {
        Deque<Double> stack = new ArrayDeque<>();
        int[][] combine = new int[position.length][2];
        //fill the combine with input data
        for (int i = 0; i < position.length; i++) {
            combine[i][0] = position[i];
            combine[i][1] = speed[i];
        }
        //sort by position
        Arrays.sort(combine, Comparator.comparingInt(o -> o[0]));
        //currentTime for every cat
        for (int i = combine.length - 1; i >= 0; i--) {
            double currentTime = (double) (target - combine[i][0]) / combine[i][1];
            if (stack.isEmpty() || currentTime > stack.peek()) {
                stack.push(currentTime);
            }
        }
        return stack.size();
    }
}
