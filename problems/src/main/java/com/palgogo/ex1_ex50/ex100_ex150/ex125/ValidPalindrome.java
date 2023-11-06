package com.palgogo.ex1_ex50.ex100_ex150.ex125;

import java.util.regex.Pattern;

public class ValidPalindrome {


    public boolean isPalindrome(String s){
        //remove all whitespaces and punctuation from the text

        String checkForPalindrome =s.replaceAll("[^0-9A-Za-z]+", "").toLowerCase();
        int rightPoint = checkForPalindrome.length() - 1;
        for (int leftPoint = 0; leftPoint < (checkForPalindrome.length())/2; leftPoint++) {
            char leftPointChar = checkForPalindrome.charAt(leftPoint);
            char rightPointChar = checkForPalindrome.charAt(rightPoint);
            if (leftPointChar != rightPointChar){
                return false;
            }
            rightPoint--;
        }
        return true;
    }
}
