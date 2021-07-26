package it.j4bberwocky.hackerrank;

import java.util.List;

/** See https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem */
public class JumpingOnTheClouds {

    public static int solution(List<Integer> c) {
    
        if (c == null || c.isEmpty() || c.size() == 1) {
            return 0;
        }
    
        int jumpCounter = 0;
        
        int index = 0;
        while (index != c.size() - 1) {
            if (index + 2 < c.size() && c.get(index + 2) == 0) {
                index += 2;
            } else {
                index += 1;
            }
            jumpCounter++;
        }
        
        return jumpCounter;

    }
    
}
