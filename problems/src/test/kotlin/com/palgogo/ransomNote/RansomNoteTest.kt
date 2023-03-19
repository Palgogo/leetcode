package com.palgogo.ransomNote

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class RansomNoteTest {

    @ParameterizedTest
    @MethodSource("dataProvider")
    fun canConstruct(magazine: String, ransomNote: String) {
        val result = RansomNote().canConstruct(magazine, ransomNote)
        Assertions.assertEquals(true, result)
    }
    companion object {
        @JvmStatic
        fun dataProvider(): List<Arguments> {
            return listOf(
                arguments("aa", "aa"),
                arguments("aab", "baa"),
                arguments("aa", "ab"),
                arguments("ab", "aa"),
            )
        }
    }
}