package Array.Easy;

/*
*   Q. Remove Duplicates in-place from Sorted Array
* */

public class Array4 {

    public static void main(String[] args) {
        Integer[] arr = {1,2,2,3,4};
        printArray(arr);
        int n = arr.length-1;

        removeDuplicates(arr, n);
        printArray(arr);
    }

    public static void removeDuplicates(Integer[] nums, int n) {

        int i=0;
        int j=1;
        while(j<=n){
            if(nums[i] != nums[j]){
                i++;
                nums[i]=nums[j];
            }
            j++;
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
