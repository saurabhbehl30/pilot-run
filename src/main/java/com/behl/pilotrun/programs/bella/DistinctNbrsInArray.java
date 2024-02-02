package com.behl.pilotrun.programs.bella;

import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctNbrsInArray {

    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(1, 2 ,1 , 2, 3 , 4);
        Set<Integer> set = new HashSet<>();
        for(Integer i : input) {
            set.add(i);
        }

        System.out.println(set.size());
    }
}
