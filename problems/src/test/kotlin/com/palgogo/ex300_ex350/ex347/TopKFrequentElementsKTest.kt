package com.palgogo.ex300_ex350.ex347

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TopKFrequentElementsKTest {

    @Test
    fun topKFrequentElements() {


        //given
        val nums = intArrayOf(1, 1, 1, 2, 2, 3)
        val k = 2

        val topKFrequentElementsK = TopKFrequentElementsK()
        val result = topKFrequentElementsK.topKFrequentElements(nums, k)

        Assertions.assertArrayEquals(intArrayOf(1,2),result)
    }
}