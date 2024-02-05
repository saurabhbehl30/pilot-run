package com.behl.pilotrun.programs.test.sample;

public class AnagramRandom {

    public static void main(String[] args) {

        String word = "silentt";
        String anagram = "listedn";

        if (word.length() != anagram.length()) {
            return;
        }
        char[] chars = word.toCharArray();
        for (char c : chars) {
            int index = anagram.indexOf(c);
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1);
            } else {
                System.out.println("Not");
            }
        }
        System.out.println("True");
    }
}
