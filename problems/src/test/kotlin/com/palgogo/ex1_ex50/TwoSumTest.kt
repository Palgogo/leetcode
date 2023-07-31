package com.palgogo.ex1_ex50

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class TwoSumKtTestK {

    @Test
    fun twoSum() {
        val nums = intArrayOf(1, 3, 5, 19, 4)
        val target = 7
        val twoSumKt = TwoSumKt()
        val result = twoSumKt.twoSum(nums, target)
        assertArrayEquals(intArrayOf(1, 4), result)
    }
}