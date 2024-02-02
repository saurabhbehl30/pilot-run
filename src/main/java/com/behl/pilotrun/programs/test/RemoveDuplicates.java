package com.behl.pilotrun.programs.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    //Array with Duplicates       : [1, 1, 2, 2, 3, 4, 5]
    //After removing duplicates   : [1, 0, 2, 0, 3, 4, 5]

    public static void main(String[] args) {
        int [] inputAInts = { 1, 1, 2, 2, 3, 4, 5 , 5};
        Set<Integer> uniqueNbrs = new HashSet<>();
        int count = 0;
        for(int i = 0; i < inputAInts.length ; i++) {
            if(!uniqueNbrs.add(inputAInts[i])) {
                inputAInts [i] = 0;
                count ++;
            }
        }

        System.out.println(Arrays.toString(inputAInts));
    }
}
