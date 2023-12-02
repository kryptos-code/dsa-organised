package SortingAlgo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Recursion_1 {

    // Default and Constant Values
    static int constValue = 0;
    public static void main(String[] args) {
        // Printing count from 1 to 3
        counter(25);
        System.out.println();
        // Printing name N number of times
        displayName(1, 10);
        System.out.println();
        // Printing count from given value to 1
        reverseCounter(25);
        System.out.println();

        // Printing Sum of First N numbers
        System.out.println("Sum of first 10 numbers is "+sumOut(1,10));

        // Printing Factorial of N
        System.out.println("Factorial of 4 is "+factorial(4));

        // Reversing an array
        Integer[] arr = {5,4,3,2,1};
        printArray(arr);
        reverseArray(0, arr);
        printArray(arr);
        // Reversing using collections framework
        Collections.reverse(Arrays.asList(arr));
        printArray(arr);


        // Checking string is Palindrome or not
        String str = "ABCCBA";
        String str1 = "ABCDBA";

        boolean isPalindrome = checkPalindrome(0, str.toUpperCase());
        System.out.println("Given string is palindrome: "+isPalindrome);

        // Printing fibonacci series up-to Nth term
        printFibonacci(0, 1, 3);
    }

    // Function to print fibonacci series
    public static void printFibonacci(int init, int wellBefore, int last) {

        if(last == 1 && init != 0)
            return;

        if(last == 0 || (last == 1 && init == 0)) {
            System.out.print(last);
            return;
        }

        if(last < 0) {
            System.out.print("Invalid Input");
            return;
        }

        int sum = init + wellBefore;

        if( sum == 1){
            System.out.print("0 1 ");
        }

        System.out.print(sum + " ");

        printFibonacci(wellBefore, sum, last-=1);
    }

    // Function to check String is palindrome of not
    public static boolean checkPalindrome(int init, String str) {

        if(str.charAt(init) != str.charAt(str.length()-1-init)){
            return false;
        }

        if(init == (str.length()/2) - 1)
            return true;

        return checkPalindrome(init+1, str);
    }

    // Function to reverse an array
    public static void reverseArray(int initial, Integer[] array){
        int arrLength = array.length;

        if(initial >= array.length/2)
            return;

        swapValues(initial, arrLength-1-initial, array);

        reverseArray(initial+1, array);
    }

    public static void swapValues(int index1, int index2, Integer[] array){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void printArray(Integer[] array){
        System.out.print("Array: ");
        for (int value :
                array) {
            System.out.print(value+" ");
        }
        System.out.println();
    }



    // Function to Find factorial of N
    public static int factorial(int value){
    int minValue = 1;

        if(value < minValue){
            return minValue;
        }

        return value * factorial(value-1);
    }

    // Function to SUM out first N numbers
    public static int sumOut(int sum, int value){

        if(sum >= value){
            return sum;
        }

        return sum + sumOut(sum+1, value);
    }

    // Function to return the count from 1 to given value
    public static int counter(int value){
        constValue += 1;

        if(constValue > value){
            return 0;
        }

        System.out.print(constValue+" ");
        return counter(value);
    }

    public static int displayName(int counter, int calls){
        if(counter > calls)
            return 0;

        System.out.println("Counter:"+counter+" | Name: Shoaib");
        return displayName(counter+1, calls);

    }

    // Function to return the count from given value to 1
    public static int reverseCounter(int value){
        constValue = 1;

        if(value < constValue ){
            return 0;
        }

        System.out.print(value+" ");
        return reverseCounter(value-1);
    }
}