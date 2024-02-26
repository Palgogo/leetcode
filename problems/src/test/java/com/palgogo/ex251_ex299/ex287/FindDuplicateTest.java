package com.palgogo.ex251_ex299.ex287;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindDuplicateTest {

    @Test
    public void findDuplicate_fastSlow() {
        int[] nums = {1, 3, 4, 2, 2};
        FindDuplicate findDuplicate = new FindDuplicate();
        int duplicateFastslow = findDuplicate.findDuplicate_fastslow(nums);
        Assertions.assertEquals(2, duplicateFastslow);
    }
}