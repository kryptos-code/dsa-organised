package SortingAlgo;

import java.util.HashMap;
import java.util.Map;

public class Hashing_2 {
    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};

        HashMap<Integer, Integer> freqMap= new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            int freq = 0;

            if(freqMap.containsKey(value))
                freq = freqMap.get(value);
            freq++;
            freqMap.put(value, freq);
        }

        // Printing frequency of elements in Array
        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        // Print the highest freq and lowest frequency elements in java
        int maxFreq = Integer.MIN_VALUE;
        int maxKey = 0;
        int minFreq = Integer.MAX_VALUE;
        int minKey = 0;

        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            if(maxFreq < entry.getValue()) {
                maxFreq = entry.getValue();
                maxKey = entry.getKey();
            }

            if(minFreq > entry.getValue()){
                minFreq = entry.getValue();
                minKey = entry.getKey();
            }
        }

        System.out.println("Max freq key:"+ maxKey +" :: Min freq key:"+minKey);


    }
}
