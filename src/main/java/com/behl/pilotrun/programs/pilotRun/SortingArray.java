package com.behl.pilotrun.programs.pilotRun;

import java.util.Arrays;

public class SortingArray {

    public static void main(String[] args) {

        int[] inputArray = {3, 2, 4, 1, 6, 5};
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] > inputArray[j]) {
                    int temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }

        System.out.print(Arrays.toString(inputArray));
        // using single loop

        int[] inputArray2 = {3, 2, 4, 1, 6, 5};

        System.out.println(" Using One Loop");
        for (int i = 0; i < inputArray2.length - 1; i++) {
            if (inputArray2[i] > inputArray2[i + 1]) {
                int temp = inputArray2[i];
                inputArray2[i] = inputArray2[i + 1];
                inputArray2[i + 1] = temp;
                i--;
            }
        }
        System.out.println("Original array: "
                + Arrays.toString(inputArray2));
        // using bubble sort
    }
}
