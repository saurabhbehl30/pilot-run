package com.behl.pilotrun.programs.test.sample;

public class LengthofLastWord {

    public static void main(String[] args) {

        String input = " ab bc jv knefweeg ";

        String[] str = input.trim().split("\\s");

        int length = str[str.length- 1].length();

        System.out.println(length);
    }
}
