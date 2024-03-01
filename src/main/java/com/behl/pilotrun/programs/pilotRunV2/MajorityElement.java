package com.behl.pilotrun.programs.pilotRunV2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MajorityElement {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 2, 2};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= array.length - 1; i++) {
            if (map.get(array[i])  != null) {
                map.put(Integer.valueOf(array[i]), map.get(array[i]) + 1);
            } else {
                map.put(Integer.valueOf(array[i]),  1);
            }
        }
        List<Integer> list = Arrays.asList(1, 1, 2, 2, 2, 2);



        map.forEach((key, value) -> {
            System.out.println("Key is " + key + " Value is " + value);
        });
    }
}
