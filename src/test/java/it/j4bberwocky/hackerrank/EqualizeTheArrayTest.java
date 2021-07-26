package it.j4bberwocky.hackerrank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class EqualizeTheArrayTest {

    @Test
    void test1() {
        List<Integer> input = Arrays.asList(new Integer[]{1, 2, 2, 3});
        int expected = 2;
        assertEquals(expected, EqualizeTheArray.equalizeArray(input));
    }

    @Test
    void test2() {
        List<Integer> input = Arrays.asList(new Integer[]{3, 3, 2, 1, 3});
        int expected = 2;
        assertEquals(expected, EqualizeTheArray.equalizeArray(input));
    }

    @Test
    void test3() {
        List<Integer> input = Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        int expected = 8;
        assertEquals(expected, EqualizeTheArray.equalizeArray(input));
    }

    @Test
    void test4() {
        List<Integer> input = Arrays.asList(new Integer[]{1, 2, 3, 4, 1, 6, 1, 8, 9});
        int expected = 6;
        assertEquals(expected, EqualizeTheArray.equalizeArray(input));
    }
    
}
