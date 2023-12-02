package Array.Medium;

import java.util.HashMap;

/*
    Q- Two Sum : Check if a pair with given sum exists in Array
 */
public class Array1 {
    public static void main(String[] args) {
        Integer[] arr = {13, 46, 23, 52, 20, 9};
        int sum = 32;
        printArray(arr);

        System.out.println("######### USING ARRAYS ############ ");
        // Brute Force Method
        String maxValue1 = twoSumExist(arr,sum);
        System.out.println("Two Sum exist: "+maxValue1);
        Integer[] indexArray = twoSumIndex(arr,sum);
        printArray(indexArray);

        System.out.println("######### USING HASHMAPS ############ ");
        // Optimal Method
        String maxValue2 = twoSumExistHm(arr,sum);
        System.out.println("Two Sum exist: "+maxValue1);
        Integer[] indexArray2 = twoSumIndexHm(arr,sum);
        printArray(indexArray2);

    }

    // Brute Force Methods
    // Variant 1
    public static String twoSumExist(Integer[] arr,int sum){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j] == sum){
                    return "YES";
                }
            }
        }

        return "NO";
    }
    // Variant 2
    public static Integer[] twoSumIndex(Integer[] arr,int sum){
        Integer[] indexArray = new Integer[2];

        indexArray[0] = indexArray[1] = -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j] == sum){
                    indexArray[0] = i;
                    indexArray[1] = j;
                    return indexArray;
                }
            }
        }

        return indexArray;
    }


    public static void printArray(Integer[] array){
        System.out.print("Array: ");
        for (int value :
                array) {
            System.out.print(value+" ");
        }
        System.out.println();
    }


    // Optimal Method using HashMaps
    // Variant 1
    public static String twoSumExistHm(Integer[] arr,int sum){
        HashMap<Integer, Integer> mapTest = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];
            int value = sum - num;

            if(mapTest.containsKey(value)){
                return "YES";
            }else{
                mapTest.put(num,i);
            }
        }

        return "NO";
    }
    // Variant 2
    public static Integer[] twoSumIndexHm(Integer[] arr,int sum){
        Integer[] indexArray = new Integer[2];
        indexArray[0] = indexArray[1] = -1;

        HashMap<Integer, Integer> mapTest = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];
            int value = sum - num;

            if(mapTest.containsKey(value)){
                indexArray[0] = mapTest.get(value);
                indexArray[1] = i;
                return indexArray;
            }
            mapTest.put(num,i);
        }

        return indexArray;
    }



}
