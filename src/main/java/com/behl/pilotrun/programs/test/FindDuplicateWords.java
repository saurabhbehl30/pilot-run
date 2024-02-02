package com.behl.pilotrun.programs.test;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateWords {
    public static void main(String[] args) {
        String input = "This sentence contains two words, one and two";
        String [] inputArray = input.split("\\s+");
        Set<String> uniqueElemets = new HashSet<>();
        for(int i = 0 ; i <= inputArray.length -1 ; i ++ ) {
            if(!uniqueElemets.add(inputArray[i])) {

                System.out.println(inputArray[i]);
            }
        }
    }
}
