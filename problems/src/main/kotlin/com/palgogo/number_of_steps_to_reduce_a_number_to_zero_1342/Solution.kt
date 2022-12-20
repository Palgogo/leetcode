package com.palgogo.number_of_steps_to_reduce_a_number_to_zero_1342

class Solution {
    fun numberOfSteps(num: Int): Int {
        var n = num
        var counter = 0
while (n > 0){
    if (n % 2 == 0){
        n /= 2
        counter++
    }else {
        n -= 1
        counter++
    }
}
        return counter
    }
}