package com.behl.pilotrun.programs.test.sample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LexographicalString {

    public static void main(String[] args) {
        String[]  unsortedArray = {"ab" , "ca" , "ba" , "aa"};
        List<String> sortedListUsingArraysMethod = Arrays.stream(unsortedArray).sorted().toList();
        List<String> unsortedList = List.of("v , r , a , b");
       List<String> sortedListUsingJava8 = unsortedList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
       // Comparator<Employee> employeeNameComparator
             //   = Comparator.comparing(Employee::getName);
        System.out.println(sortedListUsingJava8);
        System.out.println(sortedListUsingArraysMethod);
        // correct order - aa , ab , ba , ca
        for (int i = 0 ; i <= unsortedArray.length -1 ; i ++ ) {
            for(int j = i+ 1 ; j < unsortedArray.length ; j ++) {
                if(unsortedArray[i].compareTo(unsortedArray[j]) > 0 ) {
                    String temp = "";
                    temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[j];
                    unsortedArray[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(unsortedArray));
    }
}
