package com.palgogo.ex1_ex50;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
    /*
    * 1. add all words in hashmap, if map are equal - its anagram
    * 2. Get first string, and check with other string,*/
    public List<List<String>> groupAnagrams(String[] strs){
        //take the first string
        List<List<String>> result = new ArrayList<>();
        if (strs.length == 1 && strs[0].isEmpty()){
             result.add(List.of(""));
            return result;
        }
        for (int i = 0; i < strs.length; i++) {
            List<String> anagramList = new ArrayList<>();
            if (!Objects.equals(strs[i], "")) {
                String word1 = strs[i];
                anagramList.add(word1);
                for (int j = i+1; j < strs.length; j++) {
                    String word2 = strs[j];
                    //check if it is anagram

                    boolean anagram = isAnagram(word1, word2);
                    //if true, put it in anagram list
                    if (anagram && !anagramList.contains(word2)) {
                        anagramList.add(word2);
                        strs[j] = "";
                    }
                    // and set null in sts
                }
                if (!anagramList.isEmpty()){

                result.add(anagramList);
                }
            }
        }

        return result;
    }

    public List<List<String>> groupAnagram2(String[] strs){
        //create a result hashmap that contains sorted anagram word as key, and list of values as values
        Map<String, List<String>> result = new HashMap<>();
        //get str in loop
        for (String currentStr : strs) {
            //get sorted literas from strs word
            String sortedString = currentStr
                    .chars()
                    .sorted()
                    .mapToObj(obj -> String.valueOf((char) obj))
                    .collect(Collectors.joining());
            //check if sorted word already in map

                //add key and empty value
                result.putIfAbsent(sortedString, new LinkedList<>());

                result.get(sortedString).add(currentStr);

        }
        return new ArrayList<>(result.values());
    }

    public boolean isAnagram(String word1, String word2) {
        if ( word2.isEmpty() || word1.length() != word2.length())
            return false;
        //put in hashmap
        Map<Character, Integer> chars = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
                chars.put(word1.charAt(i), chars.getOrDefault(word1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < word2.length(); i++) {
            char charAt = word2.charAt(i);
            if (chars.containsKey(charAt)){
                Integer charOccur = chars.get(charAt);
                if (charOccur == 1){
                    chars.remove(charAt);
                } else {
                    chars.put(charAt, charOccur - 1);
                }
            }
        }

        return chars.isEmpty();
    }
}
