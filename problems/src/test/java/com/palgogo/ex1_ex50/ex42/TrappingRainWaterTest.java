package com.palgogo.ex1_ex50.ex42;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TrappingRainWaterTest {

    @Test
    void trap() {
        //given
        int[] given = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int result = 6;
        //when
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int output = trappingRainWater.trap(given);
        //then
        Assertions.assertEquals(result, output);
    }

    @Test
    void trap2() {
        //given
        int[] given = {4,2,0,3,2,5};
        int result = 9;
        //when
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int output = trappingRainWater.trap(given);
        //then
        Assertions.assertEquals(result, output);
    }
}