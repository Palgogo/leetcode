package com.palgogo.ex400_ex449;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestRepeatingCharacterReplacementTest {

    @Test
    void characterReplacement() {
        //given
        String s = "AABABBA";
        int k = 2;
        int result = 4;
        //when
        var longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();
        int output = longestRepeatingCharacterReplacement.characterReplacement(s, k);
        //then
        Assertions.assertEquals(result, output);
    }
}