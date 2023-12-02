package SortingAlgo;

public class InsertionSort {
    public static void main(String[] args) {
        Integer[] arr = {13, 46, 23, 52, 20, 9};
        printArray(arr);
        sortInsertion(arr);
        printArray(arr);
    }

    public static void sortInsertion(Integer[] arr){
        int didSwap = 0;
        for (int i = 0 ; i <= arr.length - 1; i++) {

            for (int j = i; j > 0 ; j--) {
                if(arr[j] < arr[j-1]){
                    swapValues(j, j-1, arr);
                }
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
