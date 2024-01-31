package com.palgogo.ex550_ex599.ex567;

import java.util.Arrays;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[] freq = new int[26];
        int[] freq2 = new int[26];
        //feel the frequency of letters
        for (int i = 0; i < n; i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < m; i++) {
            freq2[s2.charAt(i) - 'a']++;
            if (i >= n) {
                freq2[s2.charAt(i - n) - 'a']--;
            }
            if (Arrays.equals(freq, freq2)) {
                return true;
            }
        }
        return false;
    }
}
