package com.behl.pilotrun.programs.PilotRunV3;

import java.awt.desktop.SystemEventListener;

public class ValidSingleParanthesis {


    public static void main(String[] args) {

        String input = "()((())()";
        char[] array = input.toCharArray();
        boolean flag = false;
        int count = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if(count < 0) {
                break;
            }
            if (String.valueOf(array[i]).equals(")")) {
                count++;
            } else {
                count--;
            }
        }
        if (count == 0) {
            System.out.println("valid");
        } else {
            System.out.println("Invalid");
        }
    }
}

