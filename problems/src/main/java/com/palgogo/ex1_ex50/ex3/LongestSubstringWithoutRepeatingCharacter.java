package com.palgogo.ex1_ex50.ex3;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {
    public int longestSubstringWithoutRepeatingCharacter(String s) {
        int left = 0;
        int result = 0;
//set we need, cause we have instruction to not repeat any character. right pointer we move every time,
// till the end, but left one is only for started nonrepeated string.
        Set<Character> nonRepeatedSet = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            while (nonRepeatedSet.contains(rightChar)) {
                nonRepeatedSet.remove(s.charAt(left));
                left++;
            }
            nonRepeatedSet.add(rightChar);
            result = Math.max(result, right - left + 1);
        }
        return result;
    }

    //optimized
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int result = 0;
        int[] charCount = new int[256]; // Assuming ASCII characters

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            left = Math.max(left, charCount[rightChar]);
            charCount[rightChar] = right + 1;
            result = Math.max(result, right - left + 1);
        }

        return result;

    }
}
