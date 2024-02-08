package com.palgogo.ex1_ex50.ex33;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SearchInRotatedSortedArrayTest {

    @ParameterizedTest(name = "{index} {0} search")
    @MethodSource(value = "searchParameters")
    void search(int[] nums, int target, int result) {

        //when
        SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();
        int output = searchInRotatedSortedArray.search(nums, target);
        //then
        Assertions.assertEquals(result, output);

    }

    private static Stream<Arguments> searchParameters(){
        return Stream.of(
                Arguments.of(new int[]{4, 5, 6, 7, 0, 1, 2}, 0, 4),
                Arguments.of(new int[]{4, 5, 6, 7, 0, 1, 2}, 3, -1),
                Arguments.of(new int[]{1}, 0, -1),
                Arguments.of(new int[]{3,1}, 1, 1)
        );
    }
}