package it.j4bberwocky.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RelativeSortArray {

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Set<Integer> orderingSet = new HashSet<>();
        for (int i = 0; i < arr2.length; i++) {
            orderingSet.add(arr2[i]);
        }
        
        int[] result = new int[arr1.length];
        Map<Integer, Integer> extraOrderingNums = new HashMap<>();
        
        int currentIndex = 0;
        for (int i = 0; i < arr2.length; i++) {
            int e = arr2[i];
            for (int j = 0; j < arr1.length; j++) {
                if (!orderingSet.contains(arr1[j])) {
                    extraOrderingNums.put(j, arr1[j]);
                } else if (arr1[j] == e) {
                    result[currentIndex] = arr1[j];
                    currentIndex++;
                }
            }
        }  
        
        List<Integer> tmpList = new ArrayList<>(extraOrderingNums.values());
        int size = tmpList.size();
        tmpList = tmpList.stream().sorted().collect(Collectors.toList());
        
        for (int i = arr1.length - size; i < arr1.length; i++) {
            int index = i - arr1.length + size ;
            result[i] = tmpList.get(index);
        }
        
        return result;
    }

}
