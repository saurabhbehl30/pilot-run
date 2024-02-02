package com.behl.pilotrun.programs.pilotRunV2;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {

        int [] array = {1, 1 ,2 ,3 ,4 ,4 ,5 ,6, 7};
        int [] newArray = new int[array.length];
        int count = 1;
        newArray[0] = array[0];
        for(int i = 1; i <= array.length -1 ; i ++) {
            if(array[i] != array[i -1]) {
                newArray[count] = array[i];
                count++;
            }
        }

        System.out.println(Arrays.toString(newArray));
    }
}
