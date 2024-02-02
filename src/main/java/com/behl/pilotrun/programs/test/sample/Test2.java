package com.behl.pilotrun.programs.test.sample;

public class Test2 {

    public static void main(String[] args) {

        String input = "Happy Birthday To You";

        StringBuilder builder = new StringBuilder();
        String[] list = input.split(" ");
        // TODO Auto-generated method stub

        for (int i= list.length - 1; i >= 0 ; i --) {

            builder.append(list[i]);


        }

        System.out.print(builder);
    }

    }

