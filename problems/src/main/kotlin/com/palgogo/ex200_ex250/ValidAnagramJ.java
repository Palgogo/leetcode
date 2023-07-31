package com.palgogo.ex200_ex250;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class ValidAnagramJ {
    public Boolean isAnagram(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> sMap = new HashMap<>();
        // add characters in map
        IntStream.range(0, s.length()).forEach(i -> {
            char currentChar = s.charAt(i);
            sMap.put(currentChar,
                    sMap.getOrDefault(currentChar, 0) + 1);
        });
        // remove from t
        IntStream.range(0, t.length()).forEach(i -> {
            char currentChar = t.charAt(i);
            if (sMap.containsKey(currentChar)) {
                Integer charNumber = sMap.get(currentChar);
                if (charNumber == 1){
                    sMap.remove(currentChar);
                } else {
                    sMap.put(currentChar, charNumber - 1);
                }
            }

        });
        return sMap.isEmpty();
    }
}
