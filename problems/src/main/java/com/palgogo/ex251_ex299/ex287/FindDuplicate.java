package com.palgogo.ex251_ex299.ex287;

public class FindDuplicate {

    public int findDuplicate_fastslow(int[] nums) {
        int slow = 0;
        int fast = 1;

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}
