package SortingAlgo;

public class InsertionSortRecursion {
    public static void main(String[] args) {
        Integer[] arr = {13, 46, 23, 52, 20, 9};
        int n = arr.length;
        printArray(arr);
        sortInsertionRec(arr,0);
        printArray(arr);
    }

    public static void sortInsertionRec(Integer[] arr, int n) {
        if(n==arr.length) {
            return;
        }

        int j=n;
        while(j > 0 && arr[j-1] > arr[j]){
            swapValues(j, j-1, arr);
            j--;
        }

        sortInsertionRec(arr, n+1);
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
