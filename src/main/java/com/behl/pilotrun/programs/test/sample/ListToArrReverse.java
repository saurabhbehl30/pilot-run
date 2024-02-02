package com.behl.pilotrun.programs.test.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrReverse {

    public static void main(String[] args) {

        List<Integer> arraysList = Arrays.asList(4, 3, 2, 1);

        List<Integer> list = new ArrayList<>();
        Integer[] arrs = arraysList.toArray(new Integer[0]);
        for (int i = arrs.length -1 ; i >= 0; i--) {
            list.add(arrs[i]);
        }
        System.out.println("Result.reverseArray()" + list);
    }
}
