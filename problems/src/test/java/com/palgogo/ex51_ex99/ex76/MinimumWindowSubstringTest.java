package com.palgogo.ex51_ex99.ex76;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumWindowSubstringTest {

    @Test
    void minWindow() {
        //given
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = "BANC";
        //when
        MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();
        String output = minimumWindowSubstring.minWindow(s, t);
        //then
        Assertions.assertEquals(result, output);
    }
}