package com.palgogo.ex50_ex100.ex72;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchA2DmatrixTest {

    @Test
    void searchMatrix() {
        //given
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 11;
        //when
        SearchA2Dmatrix searchA2Dmatrix = new SearchA2Dmatrix();
        boolean result = searchA2Dmatrix.searchMatrix(matrix, target);
        //then
        Assertions.assertTrue(result);
    }
}