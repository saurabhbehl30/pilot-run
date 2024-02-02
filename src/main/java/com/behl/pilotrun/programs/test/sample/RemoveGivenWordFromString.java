package com.behl.pilotrun.programs.test.sample;

public class RemoveGivenWordFromString {

    public static void main(String[] args) {

        String input = "bella";
        char removeChar = 'l'; // output - bea
        for(char c : input.toCharArray()) {
            if(c == removeChar) {
                int i = input.indexOf(removeChar);
                input = input.substring(0, i) + input.substring(i + 1);
            }
        }
        System.out.println(input);
    }
}
