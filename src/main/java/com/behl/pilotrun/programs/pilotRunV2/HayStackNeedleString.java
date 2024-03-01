package com.behl.pilotrun.programs.pilotRunV2;

public class HayStackNeedleString {

    public static void main(String[] args) {
        String haystack = "abcdef";
        String needle = "cd";
        int size = haystack.length();
        int len = needle.length();

        if (needle.length() == 0) {
            System.out.println("Not possible");
        }
        if (needle.length() > haystack.length()) {
            System.out.println("Not possible");
        }
      for (int i = 0; i < size - len + 1; i++) {

            int j = 0;
            int k = i;
            while (haystack.charAt(k) == needle.charAt(j)) {
                k++;
                j++;
                if (j == len)
                    System.out.println("Index is" + i);
               return;
            }

        }
    }
}
