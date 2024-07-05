package com.palgogo.ex200_ex250

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ValidAnagramTest {

    @Test
    fun isAnagram() {
        assertTrue { ValidAnagram().isAnagram("cat", "tac") }
    }

    @Test
    fun isNotAnagram() {
        assertFalse() { ValidAnagram().isAnagram("cat", "tad") }
    }
}