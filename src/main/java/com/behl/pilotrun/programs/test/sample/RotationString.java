package com.behl.pilotrun.programs.test.sample;

public class RotationString {

    public static void main(String[] args) {

       // s.replaceAll("[^a-zA-Z0-9]", "");


        String input1 = "racecar";
        char [] reversedInput1 = new char[input1.length()];
        int count = 0;
        for (int i = input1.toCharArray().length -1 ; i >=  0 ; i --) {
            reversedInput1 [count] = input1.toCharArray()[i];
            count ++;
        }

       if(String.valueOf(reversedInput1).equalsIgnoreCase(input1)) {
           System.out.println("mirror");
       } else {
           System.out.println("Not Mirror");
       }
    }
}
