package com.palgogo.ex200_ex250.ex238

class ProductOfArrayExceptSelfK {

    fun productOfAraay(nums:IntArray): IntArray {
        val result = IntArray(nums.size)
        var pre = 1
        var post = 1

        for (i in 0 until nums.size){
            result[i] = pre
            pre *= nums[i]
        }

        for (i in nums.size - 1 downTo 0) {
            result[i] *= post
            post *= nums[i]
        }
        return result
    }
}