package com.behl.pilotrun.programs.bella;

public class GreatestCommonDivisorStrings {

    public static void main(String[] args) {

        String s1 = "abcabc";
        String s2= "abab";
        StringBuilder builder = new StringBuilder();
        if(s1.length() > s2.length()) {
            for(int i = 0 ; i <= s2.length() -1 ; i ++) {
                if (s1.charAt(i) == s2.charAt(i)) {
                    builder.append(s2.charAt(i));
                } else  {
                    break;
                }
            }
        }

        System.out.println(builder.toString());
    }
}
