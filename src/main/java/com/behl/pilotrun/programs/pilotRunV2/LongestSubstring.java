package com.behl.pilotrun.programs.pilotRunV2;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

    public static void main(String[] args) {
        String input = "abcabcabcd"; // abcd

        Map<Character, Integer> visited = new HashMap<>();
        String output = "";

        for (int start = 0, end = 0; end < input.length(); end++) {
            char currChar = input.charAt(end);
            if (visited.containsKey(currChar)) {
                start = Math.max(visited.get(currChar) + 1, start);
            }
            if (output.length() < end - start + 1) {
                output = input.substring(start, end + 1);
            }
            visited.put(currChar, end);
        }
// ===========================================


        String inputString = "xyzzyzdb";
        String outputString = "";
        StringBuilder builder = null;
        for (int i = 0; i <= inputString.length() - 1; i++) {
            builder = new StringBuilder();
            for (int j = i; j <= inputString.length() - 1; j++) {
                if (builder.toString().contains(String.valueOf(inputString.charAt(j)))) {
                    break;
                } else {
                    builder.append(inputString.charAt(j));
                }
            }
            if(builder.toString().length() > outputString.length()) {
                outputString = builder.toString();
            }
        }


        System.out.println(outputString);
    }
}