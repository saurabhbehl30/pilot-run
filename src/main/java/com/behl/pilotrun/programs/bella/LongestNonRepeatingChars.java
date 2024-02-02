package com.behl.pilotrun.programs.bella;

public class LongestNonRepeatingChars {

    public static void main(String[] args) {

        String input = "abcabcabcd";
        String maxLength = "";
        for (int i = 0; i <= input.length() -1; i++) {
            StringBuilder builder = new StringBuilder();
            for (int j = i; j <= input.length() -1; j++) {
                if (builder.indexOf(String.valueOf(input.charAt(j))) != -1) {
                    break;
                } else {
                    builder.append(String.valueOf(input.charAt(j)));
                    if(builder.length() > maxLength.length()) {
                        maxLength = builder.toString();
                    }
                }
            }
        }
        System.out.println(maxLength);
    }
}


