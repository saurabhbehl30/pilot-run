package com.behl.pilotrun.programs.pilotRunV2;

import com.behl.pilotrun.programs.test.sample.Person;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Questions {
    public static void main(String[] args) {

        // Given a list of integers, filter out the even numbers and calculate their sum using Java 8 Streams.
        // Given a list of strings, convert each string to uppercase and concatenate them using Java 8 Streams.
        // Given a list of strings, group them by their length using Java 8 Streams.
        // Given a list of integers, find the maximum element using Java 8 Streams.
        // Given a list of persons, filter out those who are older than 30 and collect their names into a list using Java 8 Streams.
        // Given a list of integers, calculate the sum of the squares of all odd numbers using Java 8 Streams.
        // Given a list of strings, count the number of strings starting with the letter 'A' using Java 8 Streams.
        // Given a list of integers, find the squares of all even numbers using Java 8 Streams.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> words = Arrays.asList("cat", "dog", "elephant", "lion", "tiger");

        List<Person> persons = Arrays.asList(new Person("Alice", 25), new Person("Bob", 35), new Person("harlie", 28), new Person("ADavid", 40));

        boolean flag = numbers.stream().allMatch(x -> x % 2 == 0); // returns boolean for the condition

        numbers.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());   //reverse list and get first 3 elements

        List<Integer> sortedNbrs = Arrays.asList(1, 2, 3, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> reveredSOrted = sortedNbrs.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(reveredSOrted);

        Set<Integer> setOfNbrs = new HashSet<>();
        Optional<Integer> firstNbr = numbers.stream().filter(((Function<Set<Integer>, Predicate<Integer>>) setOfNbrs1 -> x -> !setOfNbrs1.add(x)).apply(setOfNbrs)).findFirst();

        Comparator<Person> personComparator = Comparator.comparing(Person::getName);  // sorting on basis of alphabetic order
        List<Person> sortedPerson = persons.stream().sorted(personComparator).collect(Collectors.toList());
        // System.out.println(sortedPerson);

        int sum = numbers.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum();
        //System.out.println(sum);

        words.stream().map(x -> x.length()).forEach(x -> {  // print length of each string in list
            //  System.out.println("length is " + x);
        });

        String result = words.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(" ,"));
        // System.out.println(result);


        Map<Integer, List<String>> list = words.stream().collect(Collectors.groupingBy(x -> x.length()));
        System.out.println(list);

        OptionalInt max = numbers.stream().mapToInt(x -> x).max();
        System.out.println(max.getAsInt());

        List<String> namesOf30Plus = persons.stream().filter(x -> x.getAge() > 30).map(x -> x.getName()).collect(Collectors.toList());
        System.out.println(namesOf30Plus);

        Integer sumOfOdd = numbers.stream().filter(x -> x % 2 != 0).mapToInt(x -> x).sum();
        System.out.println(sumOfOdd);

        long countOfSuchWords = words.stream().filter(x -> x.startsWith("c") || x.startsWith("t")).count();
        System.out.println(countOfSuchWords);


        // Given a list of words, group them by their starting letter using Java 8 Streams.
        // Given a list of integers, remove duplicates and create a new list using Java 8 Streams.
        // Given two lists of strings, concatenate them into a single list using Java 8 Streams.
        // Given a list of integers, partition them into even and odd numbers using Java 8 Streams.
        // Given a list of integers, calculate the sum of the squares of numbers until the sum reaches a value greater than 100 using Java 8 Streams.

        List<Integer> duplicatesNumbers = Arrays.asList(1, 1, 1, 2, 3, 3, 4, 5, 6, 17);

        List<Integer> newList = duplicatesNumbers.stream().distinct().collect(Collectors.toList());
        System.out.println(newList);

        List<String> firstString = Arrays.asList("ac", " vc");
        List<String> cn = Stream.concat(firstString.stream(), words.stream()).collect(Collectors.toList());


        Map<Boolean, List<Integer>> partitionedNumbers = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));  // partion for even odd

        numbers.stream().mapToInt(x -> x * x).takeWhile(x -> x > 100).sum(); /// take while


        List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList(7, 8, 9));

        List<Integer> flattenedList = listOfLists.stream().flatMap(x -> x.stream()).collect(Collectors.toList());

        System.out.println("Flattened List: " + flattenedList);

        String wordLongest = words.stream().max(Comparator.comparing(x -> x.length())).get();
        System.out.println(wordLongest);


        double averageLength = words.stream().filter(s -> "aeiou".contains(String.valueOf(s.charAt(0)).toLowerCase())).mapToInt(String::length).average().orElse(0.0);

    }
}
