package SortingAlgo;

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        Integer[] arr = {13, 46, 23, 52, 20, 9};
        printArray(arr);
        sortMerge(0, arr.length-1, arr);
        printArray(arr);
    }

    public static void sortMerge(int start, int end, Integer[] arr) {
        if(start >= end) return;
        int mid = (start+end)/2;
        sortMerge(start, mid, arr);
        sortMerge(mid+1, end, arr);
        merge(start,mid,end,arr);

    }

    public static void merge(int start, int mid, int end, Integer[] arr){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = start;
        int right = mid+1;

        while( left<=mid && right<=end){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid){
            temp.add(arr[left]);
            left++;
        }

        while (right <= end){
            temp.add(arr[right]);
            right++;
        }

        for(int i=start; i<=end; i++) {
            arr[i] = temp.get(i-start);
        }
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
