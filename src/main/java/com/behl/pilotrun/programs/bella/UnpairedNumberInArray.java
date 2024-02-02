package com.behl.pilotrun.programs.bella;

import java.util.HashSet;
import java.util.Set;

public class UnpairedNumberInArray {

    public static void main(String[] args) {

        int [] arr = {1, 3, 1, 5 ,3 ,5 , 7};
        Set<Integer> nbrs = new HashSet<>();
        for( int i = 0 ; i <= arr.length -1 ; i ++) {
            if(!nbrs.add(arr[i])) {
                nbrs.remove(arr[i]);
            } else {
                nbrs.add(arr[i]);
            }
        }
        Integer output = nbrs.stream().findFirst().get();
        System.out.print(output);
    }
}
