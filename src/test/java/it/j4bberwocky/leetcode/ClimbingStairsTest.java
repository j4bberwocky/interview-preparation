package it.j4bberwocky.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ClimbingStairsTest {

    @Test
    void testClimbingStairs1() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        int stairs = 2;
        int expected = 2;
        assertEquals(expected, climbingStairs.climbStairs(stairs));
    }

    @Test
    void testClimbingStairs2() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        int stairs = 3;
        int expected = 3;
        assertEquals(expected, climbingStairs.climbStairs(stairs));
    }

    @Test
    void testClimbingStairs3() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        int stairs = 4;
        int expected = 5;
        assertEquals(expected, climbingStairs.climbStairs(stairs));
    }
    
}
