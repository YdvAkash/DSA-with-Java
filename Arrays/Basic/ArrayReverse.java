/*  Reversing an array means changing the position of each number in the array to its corresponding position from the end. For example, if a number is at position 1, its new position will be at Array.length-1, and similarly, if a number is at position 2, its new position will be at Array.length – 2, and so on.

Examples:

Input: original_array[] = {1, 2, 3} Output: array_reversed[] = {3, 2, 1}

Input: original_array[] = {4, 5, 1, 2}
Output: array_reversed[] = {2, 1, 5, 4}

Table of Content

1. Array Reverse Using an Extra Array (Non In-place):
2. Array Reverse Using a Loop (In-place):
3. Array Reverse Inbuilt Methods (Non In-place):
4. Array Reverse Recursion (In-place or Non In-place):
5. Array Reverse Stack (Non In-place): */

//                        -------  START --------

import java.util.*;
public class ArrayReverse {
    //                       1. Array Reverse Using an Extra Array (Non In-place):
    public static void  ArrayReverseWithExtraArray(int[] arr) {
        int[] ReversedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ReversedArray[i]= arr[arr.length - i - 1];
        }
        //print reversed Array
        System.out.println("Reversed Array ");
        System.out.println(Arrays.toString(ReversedArray));

    }
    public static void main(String[] args) {
        int[] originalArr = { 1, 2, 3, 4, 5 };
        ArrayReverseWithExtraArray(originalArr);       // Array Reverse Using an Extra Array (Non In-place):
        
    }
    
}


   

