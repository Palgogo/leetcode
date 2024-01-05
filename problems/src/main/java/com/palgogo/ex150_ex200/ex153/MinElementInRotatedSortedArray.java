package com.palgogo.ex150_ex200.ex153;

public class MinElementInRotatedSortedArray {
    public int minElement(int nums[]) {
        int left = 0;
        int right = nums.length - 1;
        int result = nums[0];

        while (left <= right) {
            int middle = (left + right) / 2;
            result = Math.min(result, middle);
            if (nums[right] < nums[middle]) {
                right = middle;
            } else {
                left = ++middle;
            }
        }
        return result;
    }
}
