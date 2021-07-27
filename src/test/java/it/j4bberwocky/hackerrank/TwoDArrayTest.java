package it.j4bberwocky.hackerrank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class TwoDArrayTest {

    @Test
    void test1() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(new Integer[]{-9, -9, -9, 1, 1, 1}));
        input.add(Arrays.asList(new Integer[]{0, -9, 0, 4, 3, 2}));
        input.add(Arrays.asList(new Integer[]{-9, -9, -9, 1, 2, 3}));
        input.add(Arrays.asList(new Integer[]{0, 0, 8, 6, 6, 0}));
        input.add(Arrays.asList(new Integer[]{0, 0, 0, -2, 0, 0}));
        input.add(Arrays.asList(new Integer[]{0, 0, 1, 2, 3, 0}));

        int expected = 28;

        assertEquals(expected, TwoDArray.hourglassSum(input));
    }
    
    @Test
    void test2() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(new Integer[]{1, 1, 1, 0, 0, 0}));
        input.add(Arrays.asList(new Integer[]{0, 1, 0, 0, 0, 0}));
        input.add(Arrays.asList(new Integer[]{1, 1, 1, 0, 0, 0}));
        input.add(Arrays.asList(new Integer[]{0, 0, 2, 4, 4, 0}));
        input.add(Arrays.asList(new Integer[]{0, 0, 0, 2, 0, 0}));
        input.add(Arrays.asList(new Integer[]{0, 0, 1, 2, 4, 0}));

        int expected = 19;

        assertEquals(expected, TwoDArray.hourglassSum(input));
    }
    
    @Test
    void test3() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(new Integer[]{1, 1, 1, 0, 0, 0}));
        input.add(Arrays.asList(new Integer[]{0, 1, 0, 0, 0, 0}));
        input.add(Arrays.asList(new Integer[]{1, 1, 1, 0, 0, 0}));
        input.add(Arrays.asList(new Integer[]{0, 0, 0, 0, 0, 0}));
        input.add(Arrays.asList(new Integer[]{0, 0, 0, 0, 0, 0}));
        input.add(Arrays.asList(new Integer[]{0, 0, 0, 0, 0, 0}));

        int expected = 7;

        assertEquals(expected, TwoDArray.hourglassSum(input));
    }

    @Test
    void test4() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(new Integer[]{0, -4, -6, 0, -7, -6}));
        input.add(Arrays.asList(new Integer[]{-1, -2, -6, -8, -3, -1}));
        input.add(Arrays.asList(new Integer[]{-8, -4, -2, -8, -8, -6}));
        input.add(Arrays.asList(new Integer[]{-3, -1, -2, -5, -7, -4}));
        input.add(Arrays.asList(new Integer[]{-3, -5, -3, -6, -6, -6}));
        input.add(Arrays.asList(new Integer[]{-3, -6, 0, -8, -6, -7}));
        int expected = -19;

        assertEquals(expected, TwoDArray.hourglassSum(input));
    }
}
