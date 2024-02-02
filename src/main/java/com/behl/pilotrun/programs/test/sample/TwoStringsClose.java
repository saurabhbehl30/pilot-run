package com.behl.pilotrun.programs.test.sample;

public class TwoStringsClose {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "bca";

        char[] s1CharArr = s1.toCharArray();
        char[] s2CharArr = s2.toCharArray();


        if (s1CharArr.length == s2CharArr.length) {
            for (int i = 0; i <= s1CharArr.length; i++) {
                for (int j = i + 1; j <= s1CharArr.length; j++) {
                    if (s1CharArr[i] == s1CharArr[j]) {

                    }
                }
            }
        }
    }
}
