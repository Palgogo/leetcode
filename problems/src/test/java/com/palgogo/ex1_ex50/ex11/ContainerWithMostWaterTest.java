package com.palgogo.ex1_ex50.ex11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    @Test
    void maxArea() {
        //given
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = 49;
        //when
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int output = containerWithMostWater.maxArea(height);
        //then
        Assertions.assertEquals(result, output);
    }
}