package SortingAlgo;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        Integer[] arr = {13, 46, 23, 52, 20, 9};
        int n = arr.length;
        printArray(arr);
        sortBubbleRec(arr,n);
        printArray(arr);
    }

    public static void sortBubbleRec(Integer[] arr, int n) {
        if(n==1) {
            return;
        }

        int didSwap = 0;
        for(int j=0; j<=n-2; j++) {
            if(arr[j] > arr[j+1]){
                swapValues(j, j+1, arr);
                didSwap = 1;
            }
        }

        if (didSwap == 0) return;

        sortBubbleRec(arr, n-1);
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
