package com.palgogo.ex200_ex250.ex238;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {

    @Test
    void productOfArray() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int[] result = productOfArrayExceptSelf.productOfArray(nums);
        Assertions.assertArrayEquals(result, expected);
    }
}