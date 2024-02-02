package com.behl.pilotrun.programs.test.sample;

public class Palindrome {

    public static void main(String[] args) {

        //"121" is a palindrome... 123 is not
        String input = "aabbaa";
        char [] inChars = input.toCharArray();
        StringBuilder builder = new StringBuilder(input.length());
        for(int i = inChars.length -1 ; i >= 0 ; i -- ) {
            builder.append(inChars[i]);
        }
        if(input.equalsIgnoreCase(builder.toString())) {
         System.out.println("Is a Palindrom");
        }
    }
}
