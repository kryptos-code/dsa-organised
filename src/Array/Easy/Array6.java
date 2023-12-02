package Array.Easy;

/*
*   Q. Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
* */
public class Array6 {

    public static void main(String[] args) {
        Integer[] arr = {1,3,6,11,12,17};
        printArray(arr);
        int n = arr.length;
        rotateArray(arr, 2);
        printArray(arr);
    }
    public static void rotateArray(Integer[] nums, int k) {

        k=k%nums.length;
        int n = nums.length;

        reverseArr(nums, 0, n-1);
        reverseArr(nums, 0, k-1);
        reverseArr(nums, k, n-1);
    }

    public static void reverseArr(Integer[] nums, int start, int end){
        while(start < end){

            swapValues(start, end, nums);
            start++;
            end--;
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
