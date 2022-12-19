package fizzBuzz_412

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzTest {


    @Test
    fun `fizzBuzz on 3`() {
        var input = 3;

        val fizzBuzz = FizzBuzz()
        val result = fizzBuzz.fizzBuzz(input)

        assertEquals(
                listOf("1", "2", "Fizz"),
                result
        )
    }
}