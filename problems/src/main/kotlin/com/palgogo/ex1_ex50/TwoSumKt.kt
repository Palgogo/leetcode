package com.palgogo.ex1_ex50

class TwoSumKt {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in 0 until nums.size - 1) {
            for (j in i + 1 until nums.size) {
                if (target - nums[i] == nums[j]) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf(0, 0)
    }
}