package com.palgogo.ex150_ex200.ex167;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumIISortedArrayTest {

    @Test
    void twoSum() {
        int[] given = {2,7,11,15};
        TwoSumIISortedArray twoSumIISortedArray = new TwoSumIISortedArray();
        int[] ints = twoSumIISortedArray.twoSum(given, 9);
        assertArrayEquals(new int[]{1,2}, ints);
    }
}