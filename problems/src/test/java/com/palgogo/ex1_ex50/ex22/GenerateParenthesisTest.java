package com.palgogo.ex1_ex50.ex22;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesisTest {

    @Test
    void generateParenthesis() {
        GenerateParenthesis generateParenthesis = new GenerateParenthesis();
        List<String> strings = generateParenthesis.generateParenthesis(3);
        System.out.println(strings);
    }
}