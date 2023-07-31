package com.palgogo.ex200_ex250;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramJTest {

    @Test
    void isAnagram() {
        String s = "fefa";
        String t = "ffea";
        ValidAnagramJ validAnagramJ = new ValidAnagramJ();
        Boolean anagram = validAnagramJ.isAnagram(s, t);
        Assertions.assertTrue(anagram);
    }
}