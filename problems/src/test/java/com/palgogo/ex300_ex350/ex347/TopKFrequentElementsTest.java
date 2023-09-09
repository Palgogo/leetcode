package com.palgogo.ex300_ex350.ex347;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TopKFrequentElementsTest {

    @Test
    void checkFrequentElements() {
        //given
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        //when
        TopKFrequentElementsK topKFrequentElements = new TopKFrequentElementsK();
        int[] result = topKFrequentElements.topKFrequentElements(nums, k);
// then
        Assertions.assertArrayEquals(new int[]{1,2}, result);
    }
}