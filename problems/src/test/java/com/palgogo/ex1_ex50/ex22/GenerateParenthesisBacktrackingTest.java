package com.palgogo.ex1_ex50.ex22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesisBacktrackingTest {

    @Test
    void generateParenthesis() {
        //given
        List<String> answer = List.of("((()))", "(()())", "(())()", "()(())", "()()()");
        //when
        GenerateParenthesisBacktracking generateParenthesisBacktracking = new GenerateParenthesisBacktracking();
        List<String> strings = generateParenthesisBacktracking.generateParenthesis(3);
        System.out.println(strings);
        Assertions.assertArrayEquals(strings.toArray(), answer.toArray());
    }
}