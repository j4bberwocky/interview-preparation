package it.j4bberwocky.hackerrank;

import java.util.List;

/** See https://www.hackerrank.com/challenges/2d-array/problem */
public class TwoDArray {
    
    public static int hourglassSum(List<List<Integer>> arr) {
        int maxHourglassSum = Integer.MIN_VALUE;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                maxHourglassSum = Math.max(maxHourglassSum, singleHourglassSum(arr, i, j));
            }
        }
        return maxHourglassSum;
    }

    private static int singleHourglassSum(List<List<Integer>> arr, int row, int col) {
        return arr.get(row-1).get(col-1) + arr.get(row-1).get(col) + 
            arr.get(row-1).get(col+1) + arr.get(row).get(col) + 
            arr.get(row+1).get(col-1) + arr.get(row+1).get(col) + arr.get(row+1).get(col+1);
    }

}
