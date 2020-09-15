package com.stackroute;
/*
1. Program 1 :
        Problem Statement: Find a comma separated string format for a given list of
        integers. String format is each element should be preceded by "even" if the number is
        even, and preceded by "odd" if the number is odd

        **Given a list of integers, find a comma separated string format for a given list of
        integers using Streams **
        **This exercise contains a class named StringFormat with the following method:**

        +findStringFormat(List<Integer>) : String
        - Should accept list of integers as input and return String
        - Should find the comma separated string format for on a given list of integers
        - Should return "Give proper input not empty list" if list is empty
        - Should return "Give proper input not negative values" if list contains negative
        values

        Example
        Sample Input:
        [101,44]
        Expected Output:
        odd101,even44

        Sample Input:
        [4,24,-4]
        Expected Output:
        Give proper input not negative values

        Sample Input:
        []
        Expected Output:
        Give proper input not empty list

        **NOTE: ALL THE METHODS SHOULD BE IMPLEMENTED USING STREAMS API ONLY**
*/

import java.util.*;
import java.util.stream.Collectors;

public class StringFormat {
    //Method
    public static String findStringFormat(List<Integer> list) {
        if (list.isEmpty())
            return "Give proper input not empty list";
        Object[] objArr = list.toArray();
        String[] strArr = Arrays.stream(objArr)
                .map(Object::toString)
                .toArray(String[]::new);
        String evenNos = Arrays.stream(strArr)
                .filter(number -> Integer.parseInt(number) % 2 == 0)
                .collect(Collectors.joining(","));
        String oddNos = Arrays.stream(strArr)
                .filter(number -> Integer.parseInt(number) % 2 != 0)
                .collect(Collectors.joining(","));
        String[] evenArr = evenNos.split(",");
        String[] oddArr = oddNos.split(",");
        String even = "", odd = "";
        for (int i = 0; i < evenArr.length || i < oddArr.length; i++) {
            even = "even" + evenArr[i] + ",";
            odd = "odd" + oddArr[i] + ",";
        }
        return even + odd;
    }

    //Main Method Driver Code
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String of integers separated by commas(,)");
        String stringInt = scanner.nextLine();
        String[] stringArray = stringInt.split(",");
        List<Integer> listInt = new ArrayList<>();
        for (String string : stringArray) {
            if (Integer.parseInt(string) < 0)
                System.out.println("Give proper input not negative values");
            else
                listInt.add(Integer.parseInt(string));
        }
        String result = findStringFormat(listInt);
        System.out.println(result);
        System.out.println("Empty List Test Case");
        result = findStringFormat(Collections.emptyList());
        System.out.println(result);
    }
}
