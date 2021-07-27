package it.j4bberwocky.hackerearth;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AvangersAssembleTest {

    @Test
    void test1() {
        int[] input = new int[]{3, 2, 4, 4, 5};
        int expected = 1;
        assertEquals(expected, AvangersAssemble.solve(input));
    }

    @Test
    void test2() {
        int[] input = new int[]{7, 4, 1, 4, 7};
        int expected = 0;
        assertEquals(expected, AvangersAssemble.solve(input));
    }

    @Test
    void test3() {
        int[] input = new int[]{1, 4, 5, 9, 1};
        int expected = 1;
        assertEquals(expected, AvangersAssemble.solve(input));
    }
    
}
