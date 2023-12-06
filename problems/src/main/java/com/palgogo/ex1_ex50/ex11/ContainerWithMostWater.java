package com.palgogo.ex1_ex50.ex11;

public class ContainerWithMostWater {
    public int maxArea(int[] height){
        int result = 0;
        int left = 0;
        int right = height.length -1;
        while (left < right) {
            int containerLength = right - left;
            int area = containerLength * Math.min(height[left], height[right]);
            result = Math.max(result, area);
            if (height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}
