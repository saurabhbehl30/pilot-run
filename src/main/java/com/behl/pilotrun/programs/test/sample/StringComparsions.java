package com.behl.pilotrun.programs.test.sample;

import com.behl.pilotrun.programs.test.sample.Person;

public class StringComparsions {

    public static void main(String[] args) {


        String string1 = "Geeksforgeeks";
        String string2 = "Practice";
        String string3 = "Geeks";
        String string4 = "Geeks";
        String string5 = "geeks";

        Person p1  = new Person("a", 1);
        Person p2 = new Person("a" , 1);

        System.out.println(p1.equals(p2));

        // Comparing for String 1 != String 2
        System.out.println("Comparing " + string1 + " and "
                + string2 + " : "
                + string1.equals(string2));

        // Comparing for String 3 = String 4
        System.out.println("Comparing " + string3 + " and "
                + string4 + " : "
                + string3.equals(string4));

        // Comparing for String 4 != String 5
        System.out.println("Comparing " + string4 + " and "
                + string5 + " : "
                + string4.equals(string5));

        // Comparing for String 1 != String 4
        System.out.println("Comparing " + string1 + " and "
                + string4 + " : "
                + string1.equals(string4));
    }
}
