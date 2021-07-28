package it.j4bberwocky.leetcode;

import java.util.*;

public class RelativeSortArray {

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
       Map<Integer, Integer> map = new HashMap<>();
       for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], i);
       }

       Comparator<Integer> customComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                 if (map.get(o1) == null && map.get(o2) == null) {
                    return o1 - o2;
                 } else if (map.get(o1) == null) {
                    return 1;
                 } else if (map.get(o2) == null) {
                    return -1;
                 } else {
                      return map.get(o1) - map.get(o2);
                 }

            }               
       };

       List<Integer> result = new ArrayList<>();
       for (int i = 0; i < arr1.length; i++) {
            result.add(arr1[i]);
       }
       
       return result.stream()
            .sorted(customComparator)
            .mapToInt(Integer::intValue)
            .toArray();  

    }

}
