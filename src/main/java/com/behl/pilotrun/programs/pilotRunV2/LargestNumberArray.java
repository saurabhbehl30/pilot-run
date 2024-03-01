package com.behl.pilotrun.programs.pilotRunV2;

public class LargestNumberArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 33, 4, 5, 9, 56, 75};
        int max = array[0];
        for (int i = 0; i <= array.length - 1; i++) {
           if(array[i] > max) {
               max = array[i];
           }
        }
        System.out.println(max);
    }
}
