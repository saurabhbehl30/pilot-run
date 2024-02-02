package com.behl.pilotrun.programs.test.sample;

import java.util.HashMap;
import java.util.Map;

public class ShortestCompletingWord {

    public static void main(String[] args) {
        String [] arr = {"step","steps","stripe","stepple"};
        shortestCompletingWord("1s3 PSt", arr);

    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {


        char [] liceChars = licensePlate.toLowerCase().toCharArray();
            Map<String , Integer> map = new HashMap<>();
            for (int i = 0 ; i <= liceChars.length -1 ; i ++) {
                for(int j = 0 ; j <= words.length -1  ; j ++) {
                    if(words[j].contains(String.valueOf(liceChars[i]))) {
                        if( map.get(words[j]) == null) {
                            map.put(words[j] ,1);
                        } else {
                            map.put(words[j], map.get(words[j]) + 1);
                        }
                    }
                }
            }



            // sstp

            // step - 3
        // steps - 4
        // stripe - 3
        //  stepple - 4


        return  null;
    }
}
