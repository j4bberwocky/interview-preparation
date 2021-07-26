package it.j4bberwocky.leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    
    public boolean isHappy(int n) {     
        Set<Integer> set = new HashSet<>();
        
        while (!set.contains(n)) {
            if (n == 1) {
                return true;
            }   
            set.add(n);
            n = sumOfTheSquaresOfDigits(n);
        }
        return false;
    }
    
    public int sumOfTheSquaresOfDigits(int n) {
        int retval = 0;
        String s = String.valueOf(n);
        for (char i : s.toCharArray()) {
            int val = i - '0';
            retval += val*val;
        }
        return retval;
    }

}
