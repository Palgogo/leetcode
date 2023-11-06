package com.palgogo.ex1_ex50.ex100_ex150.ex125;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void isPalindrome() {
        String given = "race a car";
//        String given = "A man, a plan, a canal: Panama";
        ValidPalindrome validPalindrome = new ValidPalindrome();
        boolean isPalindrome = validPalindrome.isPalindrome(given);
        assertTrue(isPalindrome);
    }
}