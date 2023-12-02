package SortingAlgo;

public class SelectionSort {
    public static void main(String[] args) {
         Integer[] arr = {13, 46, 23, 52, 20, 9};
         printArray(arr);
         sortSelection(arr);
         printArray(arr);
    }

    public static void sortSelection(Integer[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i; j < arr.length; j++) {
                if(arr[j] < arr[min]) min = j;
            }

            swapValues(i, min, arr);
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
