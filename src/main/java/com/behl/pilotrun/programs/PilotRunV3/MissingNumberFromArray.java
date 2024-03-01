package com.behl.pilotrun.programs.PilotRunV3;

public class MissingNumberFromArray {

    public static void main(String[] args) {

        int [] array = {1, 2 ,4 ,5 ,6};

        for(int i = 0; i <= array.length -1 ; i ++) {
            if(array[i] + 1 != array[i+1]) {
              System.out.println( 1 + array[i]);
              break;
            }
        }
    }
}
