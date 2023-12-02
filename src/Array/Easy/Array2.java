package Array.Easy;

import java.util.Arrays;

/*
*   Q. Find Second Smallest and Largest Element in an array
* */
public class Array2 {

    public static void main(String[] args) {
        Integer[] arr = {13, 46, 23, 52, 20, 9};
        printArray(arr);

        int small = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int secLarge = Integer.MIN_VALUE;

        if( arr.length == 0 || arr.length < 2){
            System.out.println("-1");
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < small){
                secSmall = small;
                small = arr[i];
            }else if(arr[i] < secSmall && arr[i] != small){
                secSmall = arr[i];
            }

            if(arr[i] > large){
                secLarge = large;
                large = arr[i];
            }else if(arr[i] > secLarge && arr[i] != large){
                secLarge = arr[i];
            }
        }

        System.out.println("Second Large: "+secLarge);
        System.out.println("Second Small: "+secSmall);

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
