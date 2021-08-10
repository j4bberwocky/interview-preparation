package it.j4bberwocky.codility;

import java.util.Arrays;

public class DemoTask {
    
    public int solution(int[] A) {

        if (A == null || A.length == 0) {
            return 1;
        }

        Arrays.sort(A);

        if (A[0] > 1 || A[A.length-1] <= 0) {
            return 1;
        }

        for (int i = 1; i < A.length; i++) {            
            if (A[i-1] > 0 && A[i] - A[i-1] > 1) {
                return A[i-1] + 1;
            }            
        }

        return A[A.length-1] + 1;
    }

}
