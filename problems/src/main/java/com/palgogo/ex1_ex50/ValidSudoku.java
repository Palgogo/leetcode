package com.palgogo.ex1_ex50;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current = board[i][j];
                if (current != '.'){
                    if (!seen.add(current + " in a row " + i )||
                    !seen.add(current + " in a column " + j) ||
                    !seen.add(current + " in a block " + i/3+ "-" + j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
