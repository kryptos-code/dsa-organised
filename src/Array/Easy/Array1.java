package Array.Easy;

import java.util.Arrays;

/*
    Q- Find the Largest element in an array
 */
public class Array1 {

    public static void main(String[] args) {
        Integer[] arr = {13, 46, 23, 52, 20, 9};
        printArray(arr);
        int maxValue1 = findLargestOp(arr);
        int maxValue2 = findLargestBf(arr);
        System.out.println("Maximum Value 1: "+maxValue1);
        System.out.println("Maximum Value 2: "+maxValue2);
    }

    // Optimal Method
    public static int findLargestOp(Integer[] array){
        int max = array[0];

        for(int value: array){
            if(value>max){
                max = value;
            }
        }

        return max;
    }


    // Brute Force Method
    public static int findLargestBf(Integer[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }
    public static void printArray(Integer[] array){
        System.out.print("Array: ");
        for (int value :
                array) {
            System.out.print(value+" ");
        }
        System.out.println();
    }
}
