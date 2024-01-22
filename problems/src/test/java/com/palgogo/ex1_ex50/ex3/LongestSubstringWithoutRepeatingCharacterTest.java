package com.palgogo.ex1_ex50.ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharacterTest {

    @Test
    public void longestSubstringWithoutRepeatingCharacter() {
        //given
//    String input = "aawsdderwr";
        String input = "pwwkew";
        int expected = 3;
        //when
        LongestSubstringWithoutRepeatingCharacter longestSubstringWithoutRepeatingCharacter = new LongestSubstringWithoutRepeatingCharacter();
        int result = longestSubstringWithoutRepeatingCharacter.longestSubstringWithoutRepeatingCharacter(input);
        //then
        Assertions.assertEquals(expected, result);

    }
}