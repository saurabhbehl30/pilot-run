package com.behl.pilotrun.programs.test;

public class RemoveFromFirstString {

    public static void main(String[] args) {
        String firstString = "India is great";
        String seconsString = "in";
        // output = "da s great"  ...  i and n removed all over
        StringBuilder outPut = new StringBuilder();
        for (int j = 0; j <= seconsString.toLowerCase().toCharArray().length -1; j++) {
            if(!outPut.isEmpty()) {
                firstString = outPut.toString(); // nda
                outPut = new StringBuilder();  // --- ""
            }
            for (int i = 0; i <= firstString.toLowerCase().toCharArray().length -1 ; i++) {
                if (seconsString.toLowerCase().toCharArray()[j] != firstString.toLowerCase().toCharArray()[i]) {
                    outPut.append(firstString.toCharArray()[i]);
                }
            }
        }

        System.out.println(outPut);
    }

}
