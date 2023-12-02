package SortingAlgo;

import java.util.HashMap;

public class Hashing_1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2};
        int[] query = {1, 3, 4, 2, 10};

        HashMap<Integer, Integer> counterMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(counterMap.containsKey(arr[i])){
                counterMap.put(arr[i], counterMap.get(arr[i]) + 1);
            }else{
                counterMap.put(arr[i], 1);
            }
        }

        for(int i=0; i< query.length; i++){

            if(counterMap.containsKey(query[i])){
                System.out.print(query[i]+" : "+counterMap.get(query[i]));
            }else{
                System.out.print(query[i]+" : 0");
            }
            System.out.println();
        }
    }
}
