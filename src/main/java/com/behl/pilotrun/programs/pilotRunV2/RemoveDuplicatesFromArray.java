package com.behl.pilotrun.programs.pilotRunV2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 4, 5, 6, 6, 7};
        List<Integer> list = Arrays.asList(1, 1, 2, 3, 4, 4, 5, 6, 6, 7);
        List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());
        distinctList.forEach(System.out::println);


        int count = 1;
        for (int i = 1; i <= array.length - 1; i++) {
            if (array[i] != array[i - 1]) {
                array[count] = array[i];
                count ++;
            }
        }
        int [] newArray = Arrays.copyOf(array, count);
        System.out.println(Arrays.toString(newArray));
    }
}

