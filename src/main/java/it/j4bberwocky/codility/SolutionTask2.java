package it.j4bberwocky.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/** See https://www.geeksforgeeks.org/size-of-the-smallest-subset-with-maximum-bitwise-or/ */
public class SolutionTask2 {
    
    public int solution(int[] A) {

        if (A == null || A.length == 0) {
            return 0;
        }

        if (A.length == 1) {
            return 1;
        }

        List<Integer> list = generateSubset(Arrays.stream(A).boxed().collect(Collectors.toList()), 0);

        int max = 0;

        for (Integer i : list) {
            max = Math.max(max, i);
        }

        return max;
    }

    private List<Integer> generateSubset(List<Integer> list, int idx) {
        
        // passo base
        if (idx == list.size()) {
            return new ArrayList<>();
        }

        // ricorsione idx + 1
        List<Integer> tmp = generateSubset(list, idx + 1);

         

        return list;
    }

    private int andOperation(List<Integer> list) {
        int and = 0;
        for (Integer i : list) {
            and &= i;
        }
        return and;
    }



}
