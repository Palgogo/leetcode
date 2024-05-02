package com.palgogo.ex700_ex750;

import com.palgogo.ex700_ex750.ex739.DailyTemperature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DailyTemperatureTest {

    @Test
    void dailyTemperatures() {
        //given
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] answers = {1,1,4,2,1,1,0,0};
        //when
        var dailyTemperature = new DailyTemperature();
        int[] result = dailyTemperature.dailyTemperatures(temperatures);
        //then
        Assertions.assertArrayEquals(answers, result);
    }
}