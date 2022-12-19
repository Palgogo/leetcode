package com.palgogo
//1480
class RunningSumof1dArray {
    fun runningSum2(nums: IntArray): IntArray {
        val size = nums.size
        println(size)
        val result = IntArray(nums.size)
        for (i in 0 until size){
            var temp:Int = 0
            for (j in 0..i){
                temp += nums[j]
            }
            result[i] = temp
        }
        println(result.joinToString { " " })
        return result
    }

    fun runningSum(nums: IntArray): IntArray {


        val result = IntArray(nums.size)
        for (i in nums.indices){
            for (j in 0..i){
                result[i] += nums[j]
            }
        }
        println(result.joinToString(" "))
        return result
    }
}

