package com.behl.pilotrun.programs.test.sample;

public class PermutationsOfString {
    public static void main(String[] args) {
        //For example, if given input is "123"
        // then your program should print all 6 permutations e.g.
        // "123", "132", "213", "231", "312" and "321".
        String input = "abb";
        checkForPermutations(input , "");
    }
    private static void checkForPermutations(String input, String ans) {

        if (input.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0 ; i < input.length() ; i ++ ) {
            char ch = input.charAt(i);
            String result = input.substring(0 , i) + input.substring(i +1);
            checkForPermutations(result , ans + ch);
        }
    }

    private  void permutation(String s, String s1) {


    }
}
