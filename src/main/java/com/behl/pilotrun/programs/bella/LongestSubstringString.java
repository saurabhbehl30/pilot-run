package com.behl.pilotrun.programs.bella;

public class LongestSubstringString {

    public static void main(String[] args) {

        String string = "abcabcbb"; // answer is abcd... last 4
        String max = "";
        StringBuilder builder = null;
        for (int i = 0; i <= string.length() -1 ; i ++) {
             builder = new StringBuilder();
             builder.append(string.charAt(i));
            for (int j = i + 1  ; j <= string.length() -1 ; j ++) {
                if (string.charAt(i) != string.charAt(j)) {
                    builder.append(string.charAt(j));
                    if(j == string.length() -1 ) {
                       System.out.println(builder.toString());
                       return;
                    }
                } else {
                    if(max.length() < builder.length()) {
                       max = builder.toString();
                    }
                    break;
                }
            }
        }
        System.out.println(builder.toString());
    }
}
