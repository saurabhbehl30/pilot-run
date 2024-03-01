package com.behl.pilotrun.programs.pilotRunV2;

public class Anagram {

    public static void main(String[] args) {

        // anagram for

        String s1 = "cakt";
        String s2 = "aclt";
        boolean isAnagram = true;

        char myChar = 'A';
        int asciiValue = (int) myChar;
        System.out.println(asciiValue);

        if (s1.length() != s2.length()) {
            System.out.println("These are not Anagrams");
            return;
        }



        int count[] = new int[256];
        for(int i = 0; i <= s1.length() -1 ; i ++) {
            count[s1.charAt(i)] ++;
            count[s2.charAt(i)] --;
        }
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                System.out.println("These are not Anagrams");
                break;
            }
        }
        System.out.println("These are Anagrams");
    }
}

