package com.palgogo.ex1_ex50

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidSudokuKTest {

    val validSudoku = arrayOf(
        charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
        charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
        charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
        charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
        charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
        charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
        charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
        charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
        charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
    )

    val notValidSudoku = arrayOf(
        charArrayOf('8','3','.','.','7','.','.','.','.'),
        charArrayOf('6','.','.','1','9','5','.','.','.'),
        charArrayOf('.','9','8','.','.','.','.','6','.'),
        charArrayOf('8','.','.','.','6','.','.','.','3'),
        charArrayOf('4','.','.','8','.','3','.','.','1'),
        charArrayOf('7','.','.','.','2','.','.','.','6'),
        charArrayOf('.','6','.','.','.','.','2','8','.'),
        charArrayOf('.','.','.','4','1','9','.','.','5'),
        charArrayOf('.','.','.','.','8','.','.','7','9')
    )


    @Test
    fun isValidSudoku() {

        assertTrue { ValidSudokuK().isValidSudoku(validSudoku) }
    }

    @Test
    fun isInvalidSudoku(){
        assertFalse { ValidSudokuK().isValidSudoku(notValidSudoku) }
    }

    @Test
    fun isValidSudokuKotlinLike() {

        assertTrue { ValidSudokuK().isValidSudokuMoreKotlinLike(validSudoku) }
    }

    @Test
    fun isInvalidSudokuKotlinLike(){
        assertFalse { ValidSudokuK().isValidSudokuMoreKotlinLike(notValidSudoku) }
    }
}