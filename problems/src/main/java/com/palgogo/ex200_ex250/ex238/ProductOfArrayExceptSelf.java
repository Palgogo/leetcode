package com.palgogo.ex200_ex250.ex238;


import java.util.*;

public class ProductOfArrayExceptSelf {
    public int[] productOfArray(int[] nums){
        int[] result = new int[nums.length];
        int pre = 1, post = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = pre;
            pre *= nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= post;
            post *= nums[i];
        }
        return result;
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        arr.sort(Integer::compareTo);
        int totalSum = 0;
        for(int i = 0; i < 5; i++){
            int current = arr.get(i);
            totalSum += current;
        }
        System.out.print(totalSum - arr.get(0)+ " ");
        System.out.print(totalSum - arr.get(4));
    }
}
