package com.behl.pilotrun.programs.test.sample;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {

        // output = j as j is first non repeating char
        String string = "geeksgeeksj";
        int index = -1;
        char fnc = ' ';
        if (string.length() == 0) {
            System.out.println("EMPTY STRING");
        }
        for (char i : string.toCharArray()) {
            if (string.indexOf(i) == string.lastIndexOf(i)) {
                fnc = i;
                break;
            } else {
                index += 1;
            }
        }
        if (index == string.length() - 1) {
            System.out.println("All characters are repeating");
        } else {
            System.out.println("First non-repeating character is " + fnc);
        }
    }
}

