package it.j4bberwocky.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        return firstSolution(nums, k);
    }

    public int[] firstSolution(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        Map<Integer, List<Integer>> map2 = new HashMap<>();
        
        map.forEach((key, val) -> {
            if (map2.containsKey(val)) {
                map2.get(val).add(key);
            } else {
                List<Integer> l = new ArrayList<>();
                l.add(key);
                map2.put(val, l);
            }
        });

        map2.forEach((key, val) -> {           
            System.out.println("k: " + key);
            val.forEach(v -> System.out.println("\t" + v));
        });
        
        List<Integer> result = map2.keySet().stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        
        int[] array = new int[k];
        int i = 0;
        int i2 = 0;
        while (i < k) {
            List<Integer> l = map2.get(result.get(i2));
            for (int j = 0; j < l.size(); j++) {
                array[i] = l.get(j);
                i++;
            }   
            i2++;         
        }
        
        return array;
    }

}
