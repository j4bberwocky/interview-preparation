package it.j4bberwocky.leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class RelativeSortArrayTest {

    @Test
    void test1() {
        int[] a = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] b = {2, 1, 4, 3, 9, 6};
        int[] expected = {2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19};
        assertArrayEquals(expected, RelativeSortArray.relativeSortArray(a, b));
    }
    
}
