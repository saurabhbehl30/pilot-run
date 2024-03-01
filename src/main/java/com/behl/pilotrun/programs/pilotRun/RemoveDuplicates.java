package com.behl.pilotrun.programs.pilotRun;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] array = {1, 3, 4, 5, 3, 4, 2};
        int count = 0;

        for (int i = 0; i <= array.length -1 ; i++) {
            boolean flag = false;
            for (int j = 0; j < count; j++) {
                if (array[i] == array[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                array[count] = array[i];
                count++;
            }
        }

        array = Arrays.copyOf(array, count);
        System.out.println(Arrays.toString(array));
    }
}
