# Java 8 Exercise -2

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

**NOTE: ALL THE METHODS SHOULD BE IMPLEMENTED USING STREAMS API
ONLY**

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

**NOTE: ALL THE METHODS SHOULD BE IMPLEMENTED USING STREAMS API
ONLY**