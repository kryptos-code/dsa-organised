package Array.Medium;

/*
*   Q. Given an array Arr[] of integers, rearrange the numbers of the given
*       array into the lexicographically next greater permutation of numbers
* */
public class Array8 {

    public static void main(String[] args) {
        Integer[] arr = {2,1,5,4,3,0,0};
        printArray(arr);
        int n = arr.length;
        Integer[] arrNxt = findNextPermutation(arr, n);
        printArray(arrNxt);
    }

    public static Integer[] findNextPermutation(Integer[] nums, int n) {

        int breakPoint = findBreakPoint(nums, n);

        if(breakPoint==-1){
            // reverse whole array and return
            // Collections API can be used to reverse the array, if array is considered as List
            reverseArray(0, n, nums);
        } else{
            // find the smallest in right of the array
            int smlIndex = findSmallest(breakPoint, nums);
            // swap with the smallest
            swapValues(breakPoint, smlIndex, nums);
            // reverse the array at the right
            reverseArray(breakPoint+1, n, nums);
            // return the new array
            return nums;
        }
        return nums;
    }

    public static void reverseArray(int low, int high, Integer[] nums){
        int j = high-1;
        for (int i = low; i < ((high+low)/2); i++) {
            swapValues(i, j, nums);
            j--;
        }
    }

    public static int findBreakPoint(Integer[] nums, int n) {
        int bPoint = -1;
        for (int i = n-2; i >= 0; i--) {
            if(nums[i] < nums[i+1]){
                bPoint = i;
                break;
            }
        }
        return bPoint;
    }

    public static int findSmallest(int bPoint, Integer[] nums) {
        int smallest = -1;
        int bPointVal = nums[bPoint];
        for (int i = nums.length-1; i > bPoint; i--) {
            if( nums[i] > bPointVal) {
                smallest = i;
                break;
            }
        }
        return smallest;
    }

    public static void printArray(Integer[] array){
        System.out.print("Array: ");
        for (int value :
                array) {
            System.out.print(value+" ");
        }
        System.out.println();
    }

    public static void swapValues(int index1, int index2, Integer[] array){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
