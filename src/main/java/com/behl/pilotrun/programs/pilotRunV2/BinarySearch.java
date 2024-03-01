package com.behl.pilotrun.programs.pilotRunV2;

public class BinarySearch {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 7 , 10 , 14};
       // int[] arrayNew = {2, 1, 5, 4, 3};
        int outupt = 10;
        int steps = 0;
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            System.out.println("Steps :" + steps ++ );
            int mid = (left + right) / 2;
            if (array[mid] == outupt) {
                System.out.println("Position at" +  mid);
                break;
            } else if (array[mid] < outupt) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }
}
         //7
//l ...5.. m ......r

