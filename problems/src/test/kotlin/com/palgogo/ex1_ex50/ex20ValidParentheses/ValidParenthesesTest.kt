package com.palgogo.ex1_ex50.ex20ValidParentheses

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ValidParenthesesTest {

    @Test
    fun isValid() {
        val solution = ValidParentheses()
        val valid = solution.isValid("()[]")
        assertTrue(valid)
    }
}