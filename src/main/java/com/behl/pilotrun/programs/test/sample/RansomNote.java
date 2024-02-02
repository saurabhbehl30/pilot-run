package com.behl.pilotrun.programs.test.sample;

public class RansomNote {

    public static void main(String[] args) {

        String note = "aab";
        String mag = "daabc";

        mag.contains(note);



        for (char n : note.toCharArray()) {
            for (char m : mag.toCharArray()) {
                if (n == m) {

                }
            }
        }
    }


}
