package com.palgogo.ex200_ex250

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ContainsDuplicateTest{
    @Test
    fun containsDuplicate(){
        val containsDuplicate = ContainsDuplicate()
        val isHaveDuplicate = containsDuplicate.containsDuplicate(intArrayOf(1, 2, 3, 4))
        assertFalse(isHaveDuplicate)
    }

    @Test
    fun containsDuplicate_isNot(){
        val containsDuplicate = ContainsDuplicate()
        val isHaveDuplicate = containsDuplicate.containsDuplicate(intArrayOf(1, 2, 3, 4, 1))
        assertTrue(isHaveDuplicate)
    }
}