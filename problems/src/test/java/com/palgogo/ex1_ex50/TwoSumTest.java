package com.palgogo.ex1_ex50;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum() {
        int[] nums = new int[] {1,3,5,19,4};
        int target = 7;
        TwoSumKt twoSum = new TwoSumKt();
        int[] result = twoSum.twoSum(nums, target);
        assertArrayEquals(new int[]{1,4}, result);

    }
}