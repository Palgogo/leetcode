package com.palgogo.ransomNote

class RansomNote {

    fun canConstruct(magazine: String, ransomNote: String): Boolean {
        val map = mutableMapOf<Char, Int>()
        val result = (magazine.length >= ransomNote.length)

        if (result){
            for (i in magazine.indices) {
                if (map[magazine[i]] == null) {
                    map.put(magazine[i], 1)
                } else {
                    val value = map[magazine[i]]!!.plus(1)

                        map.put(magazine[i], value)

                }
            }

            for (i in ransomNote.indices) {
                if (map[ransomNote[i]] != null){
                    map[ransomNote[i]] = map[ransomNote[i]]!!.minus(1)
                    if (map[ransomNote[i]]?.equals(0) == true){
                        map.remove(ransomNote[i])
                    }
                } else return false
            }
        }
        return result
    }
}