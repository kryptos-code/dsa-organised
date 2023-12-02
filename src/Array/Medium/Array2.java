package Array.Medium;

import java.util.Arrays;

/*
*  Q. Sort an array of 0s, 1s and 2s
* */
public class Array2 {
    public static void main(String[] args) {
        Integer[] arr = {2, 0, 1, 2, 0, 1, 0};

        printArray(arr);
        sortArray(arr);
        printArray(arr);


    }
    // Dutch National flag algorithm.
    public static void sortArray(Integer[] array){
        int low = 0;
        int mid = 0;
        int high = array.length-1;

        while(mid <= high){

            if(array[mid] == 0){
                swapValues(low, mid, array);
                low++ ;
                mid++ ;
            }else if(array[mid] == 1){
                mid++ ;
            } else {
                swapValues(mid, high, array);
                high-- ;
            }
        }
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
}
