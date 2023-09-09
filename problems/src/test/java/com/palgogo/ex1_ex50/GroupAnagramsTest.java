package com.palgogo.ex1_ex50;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {

    @Test
    void groupAnagrams() {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = Arrays.asList(List.of("bat"), List.of("nat","tan"), List.of("ate","eat","tea"));
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        List<List<String>> lists = groupAnagrams.groupAnagram2(strs);
        Assertions.assertEquals(lists, result);
    }

    @Test
    void isAnagram(){
        String word1 = "bakaab";
        String word2 = "kbaaav";
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        boolean anagram = groupAnagrams.isAnagram(word1, word2);
        Assertions.assertTrue(anagram);
    }
}