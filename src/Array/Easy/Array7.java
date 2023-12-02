package Array.Easy;

/*
*   Q. You are given an array of integers, your task is to move all the zeros in the array
*      to the end of the array and move non-negative integers to the front by maintaining their order.
* */
public class Array7 {

    public static void main(String[] args) {
        Integer[] arr = {18,0,-6,0,-6,0,-5,7,10,16,-6,-2};
        printArray(arr);
        int n = arr.length;
        orgArrayOp(arr, n);
        printArray(arr);
    }

    // BruteForce Solution :: Time Complexity-O(N*N), Space Complexity-O(1)
    public static void orgArray(Integer[] nums, int n) {
        for (int i = 0; i < n; i++) {
            if(nums[i] == 0){
                for (int j = i+1; j < n; j++) {
                    swapValues(j-1, j, nums);
                }
                n-=1;
            }
        }
    }
    public static void orgArrayOp(Integer[] nums, int n) {
        int j = -1;
        for (int i = 0; i < n; i++) {
            if(nums[i] == 0){
                j=i;
                break;
            }
        }

        if(j == -1) return;

        for( int i=j+1; i<n; i++){
            if( nums[i] != 0){
                swapValues(i, j, nums);
                j++;
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
