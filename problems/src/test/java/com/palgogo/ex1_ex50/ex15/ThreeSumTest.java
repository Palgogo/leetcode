package com.palgogo.ex1_ex50.ex15;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    @Test
    void threeSum() {
        int[] given = new int[]{-1,0,1,2,-1,-4};
        List<Integer> miniResult1 = List.of(-1, -1, 2);
        List<Integer> miniResult2 = List.of(-1,0,1);
        LinkedList<List<Integer>> output = new LinkedList<>(List.of(miniResult1, miniResult2));
        //when
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> result = threeSum.threeSum(given);
        int[] miniResult1Array = miniResult2.stream().mapToInt(Integer::intValue).toArray();
        int[] miniOutputArray = result.get(0).stream().mapToInt(Integer::intValue).toArray();
        assertArrayEquals(miniResult1Array, miniOutputArray);


    }
}