package com.behl.pilotrun.programs.pilotRunV2;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String string = "abcabckd";
        char [] chars = string.toCharArray();

        for (int i = 0 ; i <= chars.length -1 ; i ++) {
            int firstIndex = string.indexOf(chars[i]);
            int lastIndex = string.lastIndexOf(chars[i]);
            if(firstIndex == lastIndex) {
                System.out.println("First non repeating is " + chars[i]);
                return ;
            }
        }
    }
}
