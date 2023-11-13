package com.palgogo.ex150_ex200.ex167;

public class TwoSumIISortedArray {
    public int[] twoSum(int[] numbers, int target) {

        int[] result = new int[2];
        for (int j = 0; j < numbers.length - 1; j++) {
            int left = j;
            for (int i = j+1; i < numbers.length; i++) {
                if (target - numbers[left] == numbers[i]) {
                    result[0] = left+1;
                    result[1] = i+1;
                    return result;
                }
            }
        }
        return new int[]{0,0};
    }

    public int[] twosumII(int[] numbers, int target){
        int leftPointer = 0;
        int rightPointer = numbers.length - 1;
        int leftNum, rightNum;

        while (leftPointer < rightPointer){
            leftNum = numbers[leftPointer];
            rightNum = numbers[rightPointer];
             if (leftNum + rightNum == target) break;
            if (leftNum + rightNum < target){
                leftPointer++;
                continue;
            }
            rightPointer--;
        }
        return new int[] {leftPointer + 1, rightPointer + 1};
    }
}
