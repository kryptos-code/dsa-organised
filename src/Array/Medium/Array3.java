package Array.Medium;

import java.util.HashMap;
import java.util.Map;

/*
*   Q. Given an array of N integers, write a program to return an element
*      that occurs more than N/2 times in the given array.
*      You may consider that such an element always exists in the array.
* */
public class Array3 {

    public static void main(String[] args) {
        Integer[] arr = {1,4,3,4,4,4,4,4,5,6};
        printArray(arr);
        int n = arr.length-1;

        int mostOccuredBf = findElementBf(arr, n);
        System.out.println("Element: "+mostOccuredBf);

        int mostOccuredBtr = findElementBtr(arr, n);
        System.out.println("Element: "+mostOccuredBtr);

        int mostOccuredOp = findElementOp(arr, n);
        System.out.println("Element: "+mostOccuredOp);
    }

    // Brute force method :: Time Complexity-> O(N*N)
    public static int findElementBf(Integer[] arr, int n) {
        int count = 0;
        int element = arr[0];

        for (int i = 0; i <= n; i++) {
            count = 1;
            for (int j = i+1; j <= n; j++) {
                if(arr[i]==arr[j]){
                    ++count;
                }
            }

            if(count > n/2){
                element=arr[i];
                break;
            }
        }

        return element;
    }

    // Better Solution :: TIME COMPLEXITY: O(N*log(N)) + O(N)
    public static int findElementBtr(Integer[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int element = arr[0];

        for (int i = 0; i <= n; i++) {
            int value = 1;

            if( map.containsKey(arr[i]) ){
                value = map.get(arr[i]) + 1;
            }

            map.put(arr[i], value);
        }

        for(Map.Entry temp: map.entrySet() ){
            if((int)temp.getValue() > (arr.length/2) ){
                element = (int)temp.getKey();
                break;
            }
        }

        return element;
    }

    // Optimised Solution :: Moore's Voting Algorithm :: TIME COMPLEXITY: O(N*log(N))
    public static int findElementOp(Integer[] arr, int n) {
        int element = arr[0];
        int count = 0;

        for (int i = 0; i <= n; i++) {
            if( count == 0 ){
                element = arr[i];
                count=1;
            }else if( arr[i] == element){
                count++;
            }else if( arr[i] != element){
                count--;
            }
        }

        return element;
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
