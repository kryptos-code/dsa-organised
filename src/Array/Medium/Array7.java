package Array.Medium;
/*
*   There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements.
*    Without altering the relative order of positive and negative elements, you must return an array
*    of alternately positive and negative values
* */
public class Array7 {
    public static void main(String[] args) {
        Integer[] arr = {18,-6,-5,3,-5,7,10,16,-6,-2};
        printArray(arr);
        int n = arr.length;
        orgArray(arr, n);
        printArray(arr);

        Integer[] result = orgArrayOp(arr, n);
        printArray(result);
    }

    // BruteForce Solution :: Time Complexity-O(N + N/2), Space Complexity-O(N/2 + N/2)
    public static void orgArray(Integer[] nums, int n) {
        Integer[] neg = new Integer[n/2];
        Integer[] pos = new Integer[n/2];
        int j = 0;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i]<0){
                neg[j] = nums[i];
                j++;
            } else {
                pos[k] = nums[i];
                k++;
            }
        }

        for (int i = 0; i < n/2; i++) {
            nums[2*i] = pos[i];
            nums[(2*i)+1] = neg[i];
        }

    }

    // Optimised Solution :: Time Complexity-O(N), Space Complexity-O(N)
    public static Integer[] orgArrayOp(Integer[] nums, int n) {
        Integer[] orgNums = new Integer[n];

        int posIndex = 0;
        int negIndex = 1;

        for (int i = 0; i < n; i++) {
            if(nums[i] < 0){
                orgNums[negIndex] = nums[i];
                negIndex += 2;
            } else {
                orgNums[posIndex] = nums[i];
                posIndex += 2;
            }
        }

        return orgNums;

    }

    public static int findNextNeg(Integer[] nums, int index) {
        for (int i = index+1; i < nums.length; i++) {
            if(nums[i] < 0){
                return i;
            }
        }
        return -1;
    }
    public static int findNextPos(Integer[] nums, int index) {
        for (int i = index+1; i < nums.length; i++) {
            if(nums[i] > 0){
                return i;
            }
        }
        return -1;
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
