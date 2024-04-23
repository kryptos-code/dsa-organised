package Array.Medium;

import java.util.*;

/*
*   Q. Given an array, print all the elements which are leaders.
*      A Leader is an element that is greater than all of the elements on its right side in the array
* */
public class Array9 {
    public static void main(String[] args) {
        Integer[] arr = {1,3,2};
        printArray(arr);
        int n = arr.length;
        ArrayList<Integer> leaders = findLeaders(arr, n);
        System.out.println(leaders);
    }

    public static ArrayList<Integer> findLeaders(Integer[] nums, int n){
        ArrayList<Integer> values = new ArrayList<Integer>();

        int max = nums[n-1];
        values.add(max);
        for(int i=n-2; i>=0; i--){
            if( nums[i] > max){
                max = nums[i];
                values.add(max);
            }
        }

        return values;
    }

    public static void reverseArray(int low, int high, Integer[] nums){
        int j = high-1;
        for (int i = low; i < ((high+low)/2); i++) {
            swapValues(i, j, nums);
            j--;
        }
    }

    public static void printArray(Integer[] array){
        System.out.print("Array: ");
        for (int value :
                array) {
            System.out.print(value+" ");
        }
        System.out.println();
    }

    public static void swapValues(int index1, int index2, Integer[] array){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
