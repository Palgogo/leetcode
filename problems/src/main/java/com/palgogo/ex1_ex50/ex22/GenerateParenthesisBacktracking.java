package com.palgogo.ex1_ex50.ex22;

import java.util.*;

public class GenerateParenthesisBacktracking {
    public List<String> generateParenthesis(int n){
        List<String> validAnswers = new ArrayList<>();
        char[] currentString = new char[n * 2];
        recurse(n, n, 0, currentString, validAnswers);
        return validAnswers;
    }

    private void recurse(int forwardParensNeeded, int backwardParensNeeded, int currentIndex, char[] currentString, List<String> validAnswers) {
        if (forwardParensNeeded == 0 && backwardParensNeeded == 0){
            validAnswers.add(new String(currentString));
            return;
        }
        if (forwardParensNeeded > 0){
            currentString[currentIndex]  = '(';
            recurse(forwardParensNeeded - 1, backwardParensNeeded, currentIndex + 1, currentString, validAnswers);
        }
        if (backwardParensNeeded > 0 && forwardParensNeeded < backwardParensNeeded){
            currentString[currentIndex] = ')';
            recurse(forwardParensNeeded, backwardParensNeeded - 1, currentIndex + 1, currentString, validAnswers);
        }
    }
}
