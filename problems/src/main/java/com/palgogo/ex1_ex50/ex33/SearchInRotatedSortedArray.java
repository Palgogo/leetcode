package com.palgogo.ex1_ex50.ex33;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && nums[mid] >= target){
                right = --mid;
            } else {
                left = ++mid;
            }
            } else {
                if (nums[right] >= target && nums[mid] <= target) {
                    left = ++mid;
                } else {
                    right = --mid;
                }
            }
        }
        return -1;
    }
}
