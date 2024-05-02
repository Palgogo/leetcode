package com.palgogo.ex700_ex750.ex739;

import java.util.ArrayDeque;
import java.util.Deque;

public class DailyTemperature {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[temperatures.length];
        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                result[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return result;
    }
}
