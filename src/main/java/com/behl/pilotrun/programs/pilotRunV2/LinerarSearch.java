package com.behl.pilotrun.programs.pilotRunV2;

public class LinerarSearch {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 7 , 10 , 14};
        // int[] arrayNew = {2, 1, 5, 4, 3};
        int outupt = 10;
        int steps = 0;
        for(int i =0; i <= array.length -1; i ++ ) {
            System.out.println("Steps :" + steps ++ );
            if(outupt == array[i]) {
                System.out.println("Position at " + i);
                break;
            }
        }
    }
}
