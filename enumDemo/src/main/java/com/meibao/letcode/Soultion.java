package com.meibao.letcode;

public class Soultion {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0 && "".equals(needle)) {
            return 0;
        }

        return haystack.indexOf(needle);
    }


    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            }

        }
        for (int i = 0; i < nums.length; i++) {
            if (target < nums[i]) {
                if (i > 0) {
                    return i ;
                }
                return 0;
            }

        }
        return nums.length;
    }
}