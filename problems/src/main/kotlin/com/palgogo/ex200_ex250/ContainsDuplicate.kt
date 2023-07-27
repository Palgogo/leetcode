package com.palgogo.ex200_ex250

class ContainsDuplicate {
    fun containsDuplicate(num: IntArray) : Boolean{
            val array = num.asList().toSet()

            println(array)
            return array.size < num.size
    }
}