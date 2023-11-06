package com.palgogo.ex1_ex50.ex100_ex150.ex128;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {

    @Test
    void longestConsecutive() {
        int[] numbers = {-100,100,2,3,7,9,4};
        int actual = 3;

        LongestConsecutiveSequence consecutiveSequence = new LongestConsecutiveSequence();
        int result = consecutiveSequence.longestConsecutive(numbers);

        assertEquals(result, actual);
    }
}