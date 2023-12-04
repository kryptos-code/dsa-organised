package Array.Easy;
/*
*   Q. Given an array, and an element num the task is to find if num is present in the given array or not.
*      If present print the index of the element or print -1
* */
public class Array8 {
    public static void main(String[] args) {
        Integer[] arr = {18,-6,-5,3,-5,7,10,16,-6,-2};
        printArray(arr);
        int n = 10;
        int index = findIndex(arr, n);
        System.out.println("Index out: "+index);
    }

    // BruteForce Solution :: Time Complexity-O(N), Space Complexity-O(1)
    public static int findIndex(Integer[] nums, int n) {
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == n){
                index=i;
                break;
            }
        }
        return index;
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
