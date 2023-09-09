package com.palgogo.ex300_ex350.ex347

import java.util.PriorityQueue

class TopKFrequentElementsK {

    fun topKFrequentElements(nums: IntArray, k: Int) : IntArray{
        val map = mutableMapOf<Int, Int>()

        //add nums to map, values are frequency
        nums.associateTo(map) { key: Int -> key to (map[key]?.let {it + 1} ?: 1) }
        val heap = PriorityQueue(Comparator<Pair<Int,Int>> {
            o1, o2 -> o2.second.compareTo(o1.second)
        })

        map.forEach {
            heap.add(it.toPair())
        }

        val result = IntArray(k){0}
        repeat(k){
            result[it] = heap.poll().first
        }
        return result

    }
}