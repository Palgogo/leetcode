package com.palgogo.ex200_ex250

class ValidAnagram {
    fun isAnagram(s:String, t:String) : Boolean {
        //set s in hashmap
        val map = s.groupingBy { it }.eachCount().toMutableMap()
        //remove from map if we find it

        t.forEach { character ->
            map[character]?.let { count ->
                when {
                    count > 1 -> map[character] = count - 1
                    else -> map.remove(character)
                }
            } ?: return false
        }

        return map.isEmpty()
    }
}