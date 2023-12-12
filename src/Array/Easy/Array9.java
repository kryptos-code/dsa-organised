package Array.Easy;

import java.util.ArrayList;
import java.util.List;

/*
*   Q. Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.
* */
public class Array9 {

    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4,5};
        Integer[] arr2 = {2,3,4,4,5};

        printArray(arr1);
        printArray(arr2);

        ArrayList<Integer> arrNxt = findUnion(arr1, arr2);
        System.out.println(arrNxt.toString());
    }

    public static ArrayList<Integer> findUnion(Integer[] nums1, Integer[] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        int i = 0;
        int j = 0;

        ArrayList<Integer> union = new ArrayList<>();

        while( i < n && j < m){
            if(nums1[i] <= nums2[j]){
                if(union.size()==0 || union.get(union.size()-1) != nums1[i]){
                    union.add(nums1[i]);
                }
                i++;
            }else{
                if(union.size()==0 || union.get(union.size()-1) != nums2[j]){
                    union.add(nums2[j]);
                }
                j++;
            }
        }

        while(i<n){
            if(union.get(union.size() -1 ) != nums1[i]){
                union.add(nums1[i]);
            }
            i++;
        }

        while(j<m){
            if(union.get(union.size() -1 ) != nums2[j]){
                union.add(nums2[j]);
            }
            j++;
        }

        return union;
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
