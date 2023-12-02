package SortingAlgo;

public class QuickSort {

    public static void main(String[] args) {
        Integer[] arr = {13, 46, 23, 52, 20, 9};
        printArray(arr);
        sortQuick(arr, 0, arr.length-1);
        printArray(arr);
    }

    public static void sortQuick(Integer[] arr, int low, int high) {
        if(low < high){
            int pIndex = pivotIndex(arr, low, high);
            sortQuick(arr, low, pIndex-1);
            sortQuick(arr, pIndex+1, high);
        }
    }

    public static int pivotIndex(Integer[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while( i<j ){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }

            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j) swapValues(i, j, arr);
        }
        swapValues(low, j, arr);
        return j;
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
