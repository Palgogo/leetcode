package com.palgogo.ex850_ex900.ex875;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KokoEatsBananasTest {

    @Test
    void minHoursSpeed() {
        //given
        int hours = 8;
        int[] piles = {3, 6, 7, 11};
        int expected = 4;
        //when
        KokoEatsBananas kokoEatsBananas = new KokoEatsBananas();
        int result = kokoEatsBananas.minEatingSpeed(piles, hours);
        //then
        Assertions.assertEquals(result, expected);

    }
}