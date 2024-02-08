package com.palgogo.ex1_ex50

class ValidSudokuK {
    fun isValidSudoku(board : Array<CharArray>) : Boolean {
        val seen = HashSet<String>()
        for (i in 0 until 9) {
            for (j in 0 until 9){
               val current:Char = board[i][j]
                if (current != '.'){
                    if (!seen.add("$current in a row $i") ||
                        !seen.add("$current in a column $j") ||
                        !seen.add("$current in a block ${i/3}-${j/3}")){
                        return false
                    }
                }
            }
        }
        return true
    }

    fun isValidSudokuMoreKotlinLike(board: Array<CharArray>) : Boolean{
        val seen = HashSet<String>();
        repeat(9) { i ->
            repeat(9) { j ->
                val current: Char = board[i][j]
                if (current != '.'){
                    val row = "$current in a row $i"
                    val column = "$current in a column $j"
                    val block = "$current in a block ${i/3}-${j/3}"

                    if (row in seen || column in seen || block in seen){
                        return false
                    }
                    seen += row
                    seen += column
                    seen += block
                }
            }
        }
        return true
    }

}