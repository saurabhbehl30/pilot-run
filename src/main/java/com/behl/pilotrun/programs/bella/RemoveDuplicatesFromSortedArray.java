package com.behl.pilotrun.programs.bella;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int [] array = {1,1,2,2,3,3,4};
        int count = 1;
        for (int i= 1; i <= array.length - 1 ; i ++ ) {
            if (array[i] != array[i - 1]) {
                array[count] = array[i];
                count++;
            }
        }

        int[] ss = Arrays.copyOf(array, count);
        System.out.println(Arrays.toString(ss));
    }
}
