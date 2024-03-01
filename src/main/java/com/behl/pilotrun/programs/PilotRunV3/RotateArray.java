package com.behl.pilotrun.programs.PilotRunV3;

import java.util.Arrays;

public class RotateArray { // rotate array by given steps

    public static void main(String[] args) {

        int[] array = {1, 4, 5, 6, 8};
        int [] newArray = new int[array.length];
        int steps = 3;
        for (int i = 0; i <= array.length - 1; i++) {
            if(i + steps >= array.length ) {
                int shift = array.length - i;
                newArray[steps - shift] = array[i];
            } else {
                newArray [i + steps] = array[i];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
