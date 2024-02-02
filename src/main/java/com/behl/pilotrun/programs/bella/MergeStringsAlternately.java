package com.behl.pilotrun.programs.bella;

import java.util.Arrays;

public class MergeStringsAlternately {

    public static void main(String[] args) {

        String word1 = "abcde";
        String word2 = "xyz";

        StringBuilder sb = new StringBuilder();
        int min = Math.min(word1.length() , word2.length());
        for(int i=0 ; i<min ; i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if(word1.length() > min){
            sb.append(word1.substring(min,word1.length()));
        }
        if(word2.length() > min){
            sb.append(word2.substring(min,word2.length()));
        }
        System.out.println(sb.toString());
    }
}
