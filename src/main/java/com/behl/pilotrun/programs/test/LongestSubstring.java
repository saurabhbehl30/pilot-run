package com.behl.pilotrun.programs.test;

public class LongestSubstring {

    public static void main(String[] args) {

        //  Find the Longestsubstring in the input string
        //from Nithin to Everyone18:05
        //I/p - abcdefghabcde O/p - abcde
        // longest repeating

        String input = "abcdefghabcde";
        char[] inputArray = input.toCharArray();
        String ouput ="";

        // ->
        StringBuilder builder = new StringBuilder(); // we
        for (int i = 0; i < input.length(); i++) {
            int index = input.indexOf(input.charAt(i));
            int lastIndex = input.lastIndexOf(input.charAt(i));
            if(index == lastIndex)  {  //
                builder.append(inputArray[i]);
            } else {
                break;
            }
        }
        System.out.println(builder);
    }
}
