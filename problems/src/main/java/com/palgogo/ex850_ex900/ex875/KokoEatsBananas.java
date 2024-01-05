package com.palgogo.ex850_ex900.ex875;

public class KokoEatsBananas {
    public int minEatingSpeed(int[] piles, int hours) {
        int left = 1;
        int right = 1;
        //find the maximum right
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        while (left < right) {
            int middle = (right + left) / 2;
            int hoursSpend = 0;

            for (int pile : piles) {
                hoursSpend += Math.ceil((double) pile / middle);
            }

            if (hoursSpend <= hours) {
                right = middle;
            } else {
                left = ++middle;
            }
        }
        return right;
    }
}
