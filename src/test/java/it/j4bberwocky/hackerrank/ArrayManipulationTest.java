package it.j4bberwocky.hackerrank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class ArrayManipulationTest {

  @Test
    void test1() {
        int n = 5;
        List<List<Integer>> operations = new ArrayList<>();
        operations.add(Arrays.asList(new Integer[]{1, 2, 100}));
        operations.add(Arrays.asList(new Integer[]{2, 5, 100}));
        operations.add(Arrays.asList(new Integer[]{3, 4, 100}));
        long expected = 200;
        assertEquals(expected, ArrayManipulation.arrayManipulation(n, operations));        
    }
    
    @Test
    void test2() {
        int n = 10;
        List<List<Integer>> operations = new ArrayList<>();
        operations.add(Arrays.asList(new Integer[]{1, 5, 3}));
        operations.add(Arrays.asList(new Integer[]{4, 8, 7}));
        operations.add(Arrays.asList(new Integer[]{6, 9, 1}));
        long expected = 10;
        assertEquals(expected, ArrayManipulation.arrayManipulation(n, operations));        
    }
    
}
