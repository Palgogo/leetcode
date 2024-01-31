package com.palgogo.ex550_ex599.ex567;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PermutationInStringTest {

    @Test
    void checkInclusion() {
        //given
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean result = true;
        //when
        PermutationInString permutationInString = new PermutationInString();
        boolean output = permutationInString.checkInclusion(s1, s2);
        //then
        Assertions.assertEquals(result, output);
    }
}