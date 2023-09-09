package com.palgogo.ex300_ex350.ex347;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {

    @Test
    void checkFrequentElements() {
        //given
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        //when
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        int[] result = topKFrequentElements.topKFrequentElements(nums, k);
// then
        Assertions.assertArrayEquals(new int[]{1,2}, result);
    }
}