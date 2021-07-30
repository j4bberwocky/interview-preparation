package it.j4bberwocky.hackerrank;

import java.util.List;

/** See https://www.hackerrank.com/challenges/crush/problem */
public class ArrayManipulation {

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        
        long[] array = new long[n+1];
        
        for (List<Integer> q : queries) {
            int a = q.get(0).intValue();
            int b = q.get(1).intValue();
            int k = q.get(2).intValue();
            array[a - 1] += k;
            array[b] -= k;
        }

        long sum = 0;
        long max = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
            max = Math.max(max, sum);
        }
        return max;
    }

}
