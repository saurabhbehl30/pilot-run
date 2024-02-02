package com.behl.pilotrun.programs.test.sample;

public class SearchInsertPosition {

    public static void main(String[] args) {



    }

    public int searchInsert(int[] nums, int target) {
        int res = 0;
        for (int i =0; i <= nums.length -1 ; i ++ ) {
            if(nums[i] == target) {
                return i;
            } else if (target > nums.length) {
                return  nums.length;
            }
        }
        return res;
    }
}
