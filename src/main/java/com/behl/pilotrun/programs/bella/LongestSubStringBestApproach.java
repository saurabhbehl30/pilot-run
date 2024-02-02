package com.behl.pilotrun.programs.bella;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringBestApproach {

    public static void main(String[] args) {

        String s = "abcabcd";
        Map<Character , Integer> map = new HashMap<>();
        for (int right = 0 , left = 0; right <= s.length() -1 ;  right++) {
        char currentChar = s.charAt(right);
        if(map.containsKey(currentChar) )

        map.put(currentChar , right);
        }
    }
}
