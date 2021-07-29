package it.j4bberwocky.leetcode;

/** See https://leetcode.com/problems/climbing-stairs/ */
public class ClimbingStairs {
    
    private int[] memo = new int[46];
    
    public int climbStairs(int n) {
        
        if (n == 1) {
            return 1;
        }
        
        if (n == 2) {
            return 2;
        }
        
        if (memo[n] != 0) {
            return memo[n];
        } else {
            memo[n] = climbStairs(n - 1) + climbStairs(n - 2);
        }
        
        return memo[n];        
        
    }
}
