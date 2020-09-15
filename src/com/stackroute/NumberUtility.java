package com.stackroute;
/*
2. Problem 2:
        Problem Statement: Using Streams and Stream operations
        Complete the class `NumberUtility` as per the below requirement
        - Define the below methods in class `NumberUtility`:

        +getEvenNumberCount(List<Integer>) : long
        - Should take a list of integers as input
        - Should return count of even numbers
        - Should return 0, if the input list is empty or null

        +getEvenMultiplesOfThree(List<Integer>) : List<Integer>
        - Should take a list of integers as input
        - Should return a list of integers containing even multiples of 3
        - Should return empty list, if the input list is empty or null

        +getMaximumOfOddNumbers(List<Integer>) : Integer
        - Should take a list of integers as input
        - Should return maximum of odd numbers
        - Should return 0, if the input list is empty or null

        **NOTE: ALL THE METHODS SHOULD BE IMPLEMENTED USING STREAMS API ONLY**
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NumberUtility {
    //getEvenNumberCount() Method for counting even numbers
    public static long getEvenNumberCount(List<Integer> list) {
        if (list.isEmpty() || list == null)
            return 0;
        return list.stream().filter(i -> i % 2 == 0).count();
    }

    //getEvenMultiplesOfThree() Method for getting Even Multiples Of Three
    public static List<Integer> getEvenMultiplesOfThree(List<Integer> list) {
        if (list.isEmpty() || list == null)
            return Collections.emptyList();
        return list.stream().filter(i -> i % 2 == 0 && i % 3 == 0).collect(Collectors.toList());
    }

    //getMaximumOfOddNumbers() Method for getting Maximum of Odd numbers
    public static Integer getMaximumOfOddNumbers(List<Integer> list) {
        if (list.isEmpty() || list == null)
            return 0;
        return list.stream().filter(i -> i % 2 != 0).mapToInt((x) -> x).summaryStatistics().getMax();
    }

    //Main Method Driver Code
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String of integers separated by commas(,)");
        String stringInt = scanner.nextLine();
        String[] stringArray = stringInt.split(",");
        List<Integer> list = new ArrayList<>();
        for (String string : stringArray) {
            if (Integer.parseInt(string) < 0)
                System.out.println("Give proper input not negative values");
            else
                list.add(Integer.parseInt(string));
        }
        long count = getEvenNumberCount(list);
        System.out.println("Number of even counts in the list: " + count);
        List<Integer> list1 = getEvenMultiplesOfThree(list);
        System.out.println("Number of Even Multiples of Three in the list: " + list1);
        Integer maxOdd = getMaximumOfOddNumbers(list);
        System.out.println("Maximum of Odd numbers in the list: " + maxOdd);
    }
}
