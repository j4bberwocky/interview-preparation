package it.j4bberwocky.hackerrank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class NewYearChaosTest {

    @Test
    void test0() {
        List<Integer> input = Arrays.asList(new Integer[]{1, 2, 3, 5, 4, 6, 7, 8});
        String expected = "1";
        assertEquals(expected, NewYearChaos.minimumBribes(input));
    }

    @Test
    void test1() {
        List<Integer> input = Arrays.asList(new Integer[]{2, 1, 5, 3, 4});
        String expected = "3";
        assertEquals(expected, NewYearChaos.minimumBribes(input));
    }

    @Test
    void test2() {
        List<Integer> input = Arrays.asList(new Integer[]{2, 5, 1, 3, 4});
        String expected = "Too chaotic";
        assertEquals(expected, NewYearChaos.minimumBribes(input));
    }

    @Test
    void test3() {
        List<Integer> input = Arrays.asList(new Integer[]{4, 1, 2, 3});
        String expected = "Too chaotic";
        assertEquals(expected, NewYearChaos.minimumBribes(input));
    }
    
}
