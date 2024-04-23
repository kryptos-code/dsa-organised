package SortingAlgo;

public class BubbleSort {
    public static void main(String[] args) {
        Integer[] arr = {13, 46, 23, 52, 20, 9};
        printArray(arr);
        sortBubble(arr);
        printArray(arr);
    }

    public static void sortBubble(Integer[] arr){
        int didSwap = 0;
        for (int i = arr.length - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if(arr[j] > arr[j+1]){
                    swapValues(j, j+1, arr);
                    didSwap = 1;
                }
            }
            printArray(arr);
            if(didSwap == 0) break;
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
