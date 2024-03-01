package com.behl.pilotrun.programs.PilotRunV3;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {

    public static void main(String[] args) {

        int [] array = {1, 1 ,2 ,3 ,4 ,4 ,5 ,6 ,6 };

        int count = 0;
        for (int i = 1; i <= array.length - 1 ; i++ ){
            if(array[i] != array[i -1]) {
                array[count] = array[i -1 ];
                count ++; // 5
            }
        }


        array[count] = array[array.length -1];
        count ++;
        array = Arrays.copyOf(array, count);
        System.out.println(Arrays.toString(array));
    }
}
