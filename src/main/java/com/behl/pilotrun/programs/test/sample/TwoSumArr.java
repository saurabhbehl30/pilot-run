package com.behl.pilotrun.programs.test.sample;

public class TwoSumArr {

    public static void main(String[] args) {


    }
    private  static int[] twoSum(int[] nums, int target) {

        int [] result = new int [2];
        for(int i =0 ; i <= nums.length- 1 ; i ++ ) {
          for (int j = i + 1 ; j < nums.length -1 ; j ++ ) {
           if(nums[i] + nums [j] == target) {
            result [0] = nums [i];
            result[1]  = nums [j];
           }
          }
        }
        return null;
    }
}
