package com.behl.pilotrun.programs.bella;

import java.util.Arrays;

public class RotateArrayKtimes {

    public static void main(String[] args) {
        int numberOfPlacesToMove = 2;
        int[] array = {1, 2, 3, 4, 5}; // 3 4 5 1 2
        for (int i = 0; i < numberOfPlacesToMove; i++) {
            int temp = array[array.length - 1];

            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }

            array[0] = temp;
        }

        System.out.print(Arrays.toString(array));
    }
}
