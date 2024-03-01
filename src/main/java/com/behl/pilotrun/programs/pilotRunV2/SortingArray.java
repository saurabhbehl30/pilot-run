package com.behl.pilotrun.programs.pilotRunV2;

import java.util.Arrays;

public class SortingArray {

    public static void main(String[] args) {
        int[] array = {2, 1 , 5 ,4, 3};
        int[] arrayNew = {2, 1 , 5 ,4, 3};


        for(int i = 0; i <= array.length -1 ; i ++) {
            if(array[i] > array[i+ 1]) {
                int temp = array[i];
                array[i] = array[i+1];
                array[i+ 1] = temp;

            }
        }
        System.out.println(Arrays.toString(array));
    }
}

