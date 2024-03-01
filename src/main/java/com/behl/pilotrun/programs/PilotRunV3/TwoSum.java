package com.behl.pilotrun.programs.PilotRunV3;

public class TwoSum {

    public static void main(String[] args) {

        int [] array = {1, 3, 4 ,5 ,6};

        int target =10;

        for(int i = 0 ; i <= array.length -1 ; i ++) {
            for(int j = i + 1 ; j <= array.length -1 ; j ++) {
                if(array[i] + array [j] == target) {
                    System.out.println("Number are " + array[i] + " and " + array[j]);
                    break;
                }
            }
        }
    }
}
