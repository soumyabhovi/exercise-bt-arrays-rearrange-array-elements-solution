# exercise-bt-arrays-rearrange-array-elements-solution
Problem Statement: Rearrange the given sorted array
Given a sorted array of positive integers, rearrange the array alternately i.e first element should be maximum value, second minimum value, third second max, fourth second min and so on

This exercise contains a class named RearrangeArrayElements with the following methods:

+inputAcceptor() : void
    -Should accept inputs from the console 
    -Should call inputArraySizeValidator method with given array size
    -Should call inputArrayValidator method with given input array
    -Should call displayResult method with null as argument based on the validation result
    -Should call computeRearrangedArray if inputs are valid 
+inputArraySizeValidator(int) : boolean
    -Should accept input as int and validate it 
    -Should return true if given input is valid otherwise false
+inputArrayValidator(int[]) : boolean
    -Should accept input as int array and check given array is sorted or not
    -Should return true if given input is valid otherwise false
+computeRearrangedArray(int[]) : int[]
    -Should get int array as input and return rearranged array as output 
    -Should rearrange the given input array
+displayResult(int[]) : void
    -Should accept int array as input and print it
    -Should print "Give proper input" if given input array is null
Example
Sample Input:
7
1 2 3 4 5 6 7

Expected Output: 
7 1 6 2 5 3 4
Sample Input:
0 
    
Expected Output:
Give proper input
Sample Input:
1
4 
    
Expected Output:
4
Instructions
Avoid printing unnecessary values other than expected output as given in sample
Take care of whitespace/trailing whitespace
Do not change the provided class/method names unless instructed
Follow best practices while coding
