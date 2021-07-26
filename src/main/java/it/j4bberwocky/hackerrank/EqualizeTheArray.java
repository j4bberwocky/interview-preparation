package it.j4bberwocky.hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** See https://www.hackerrank.com/challenges/equality-in-a-array/problem */
public class EqualizeTheArray {
    
    public static int equalizeArray(List<Integer> arr) {
        
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        int max = 0;
        int sum = 0;
        for (Integer i : map.values()) {
            sum += i;
            if (i > max) {
                max = i;
            }
        }

        return sum - max;
    }

}
