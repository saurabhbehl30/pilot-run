package com.behl.pilotrun.programs.test.sample;

public class HayStack {

    public static void main(String[] args) {

        String hayStack = "LeetCodeLeet";
        String needle = "t";

        char [] hayStackArray = hayStack.toCharArray();
        char [] needleArray = needle.toCharArray();

        String result = "";

        if(hayStackArray.length == needleArray.length ) {
            hayStack.equalsIgnoreCase(needle);
            return;
        }

        for (int i = 0; i < hayStack.length()-1 ; i ++) {  // [l , e , e, t , c , o , d ,e ]
            for(int j = 0; j < needleArray.length; j ++) { // [l , e, , e  , t]
                    if(needleArray[j] == hayStack.charAt(i + j)) {
                      result = result + needleArray[j];
                    } else  {
                        break;
                    }


            }
            if (result.length() == needleArray.length) {
                int index = hayStack.indexOf(result);
                System.out.println(index);
                break;
            } else {
                result = "";
            }

            }

        if (result.length() != needleArray.length) {
            result = "NOT_FOUND";
        }

        System.out.println(result);

        }
    }

