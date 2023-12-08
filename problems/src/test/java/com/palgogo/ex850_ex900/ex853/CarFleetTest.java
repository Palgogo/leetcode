package com.palgogo.ex850_ex900.ex853;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CarFleetTest {

    @Test
    void carFleet() {
        //given target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]
        //Output: 3
        int result = 3;
        int target = 12;
        int[] position = {10, 8, 0, 5, 3};
        int[] speed = {2, 4, 1, 1, 3};
        //when
        var carFleet = new CarFleet();
        int output = carFleet.carFleet(target, position, speed);
        //then
        Assertions.assertEquals(result, output);
    }
}