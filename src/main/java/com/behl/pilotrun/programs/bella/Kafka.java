package com.behl.pilotrun.programs.bella;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Kafka {

    private static final int age = 10;
    private String name;

    public  Kafka () {
      System.out.print("called");
    }


    public static void main(String[] args) {

        Kafka k1 = new Kafka();
        List<String> output = new ArrayList<>();
        List<String> list1 = Arrays.asList("aa", "bb", "cc");
        List<String> l2 = Arrays.asList("cc", "dd", "aa");

        // retrive aa - and put it in new list
        List<String> newList = list1.stream().filter(x -> x.equalsIgnoreCase("aa")).collect(Collectors.toList());
        List<String> newList2 = l2.stream().filter(x -> x.equalsIgnoreCase("aa")).collect(Collectors.toList());
        output.addAll(newList);
        output.addAll(newList2);
        output.forEach(x -> {
            System.out.println(x);
        });
    }
}

