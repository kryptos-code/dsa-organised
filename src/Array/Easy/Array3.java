package Array.Easy;


/*
*   Q. Given an array of size n, write a program to check
*       if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not.
*       If the array is sorted then return True, Else return False.
* */
public class Array3 {
    public static void main(String[] args) {
        Integer[] arr = {3,4,5,1,3};
        printArray(arr);
        int n = arr.length-1;

        boolean isArrAsc = getOrder(arr, n);
        System.out.println("Array is Ascending: "+isArrAsc);

        boolean isAsc = rotatedAsc(arr);
        System.out.println("Array is Rotated Ascending: "+isAsc);
    }

    public static boolean rotatedAsc(Integer[] arr) {
        boolean result = true;
        int n = arr.length;

        boolean flag = false;

        for (int i = 1; i <= n-1; i++) {
            if(arr[i-1] > arr[i]){
                if(flag==true){
                    result = false;
                    break;
                }
                flag=true;
            }
        }

        if(flag==true){
            if(arr[0] < arr[n-1]){
                result = false;
            }
        }

        return result;
    }

    public static boolean getOrder(Integer[] arr, int n) {
        boolean result = true;

        if(n < 1){
            return true;
        }

        for (int i = 0; i <= n-1; i++) {
            if(arr[i] > arr[i+1]){
                result = false;
                break;
            }
        }

        return result;
    }

    // LeetCode Solution
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(nums[i] > nums[(i+1)%n]){
                ++count;
            }
        }

        return (count <= 1);
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
