package Array.Medium;

/*
*   Q. Kadane's Algorithm :: Given an integer array arr, find the contiguous sub-array (containing at least one number) which
    has the largest sum and returns its sum and prints the sub-array
* */
public class Array4 {
    public static void main(String[] args) {
        Integer[] arr = {18,-6,-6,-5,7,10,16,-6,-2,0};
        printArray(arr);
        int n = arr.length;

        int maxSubArrSum = getMaxSubArrSum(arr, n);
        System.out.println("Maximum sub-array sum: "+maxSubArrSum);

        int maxSubArrSumOp = getMaxSubArrSumOp(arr, n);
        System.out.println("Maximum sub-array sum Optimised: "+maxSubArrSumOp);
    }

    // Bruteforce => Better => Time Complexity: O(N*N)
    public static int getMaxSubArrSum(Integer[] nums, int n) {

        int sum = 0;
        int max = nums[0];

        for (int i = 0; i < n; i++) {
            sum=0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                max = Math.max(sum, max);
            }
        }

        return max;
    }

    // Kadane's Algorithm
    public static int getMaxSubArrSumOp(Integer[] nums, int n) {

        int sum = 0;
        int max = Integer.MIN_VALUE;
        // 18 -6 -6 -5 7 10 16 -6 -2 0
        for (int i = 0; i < n; i++) {
            sum += nums[i];

            if(sum > max){
                max = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }

        if( max < 0 ) return 0;

        return max;
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
