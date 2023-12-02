package Array.Medium;

import java.util.Arrays;

/*
*   Q. You are given an array of prices where prices[i] is the price of a given stock on an ith day.
*      You want to maximize your profit by choosing a single day to buy one stock and choosing a different\
*      day in the future to sell that stock. Return the maximum profit you can achieve from this transaction.
*      If you cannot achieve any profit, return 0
* */
public class Array6 {
    public static void main(String[] args) {
        Integer[] arr = {18,-6,-6,-5,7,10,16,-6,-2,0};
        printArray(arr);
        int n = arr.length;

        int maxStockProfit = getMaxProfit(arr, n);
        System.out.println("Maximum stocks profit: "+maxStockProfit);
    }

    // Optimal Solution :: Time Complexity-O(N), Space Complexity-O(1)
    public static int getMaxProfit(Integer[] nums, int n) {
        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i = 0; i < n; i++) {
            min = Math.min(nums[i], min);
            max = Math.max(nums[i] - min, max);
        }

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
