package Array.Easy;
/*
*   Q. Given an array of N integers, left rotate the array by one place.
* */
public class Array5 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        printArray(arr);
        int n = arr.length;
        rotateArray(arr, n, 0);
        printArray(arr);
    }


    public static void rotateArray(Integer[] arr, int n, int k) {
        for (int j = 0; j <= k; j++) {
            int temp = arr[0];
            for (int i = 1; i < n; i++) {
                arr[i-1] = arr[i];
            }
            arr[n-1] = temp;
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
