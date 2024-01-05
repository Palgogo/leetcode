package com.palgogo.ex150_ex200.ex153;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinElementInRotatedSortedArrayTest {

    @Test
    void minElement() {
        //given
        int[] nums = {3, 4, 5, 1, 2};
        int expected = 1;
        //when
        MinElementInRotatedSortedArray minElementInRotatedSortedArray = new MinElementInRotatedSortedArray();
        int result = minElementInRotatedSortedArray.minElement(nums);
        //then
        Assertions.assertEquals(expected, result);
    }
}