package it.j4bberwocky.algo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class SortTest {
    
    @Test
    void testMergeSort() {
        int[] unordered = {4, 23, 6, 78, 1, 54, 231, 9, 12};
        int[] ordered = {1, 4, 6, 9, 12, 23, 54, 78, 231};
        new MergeSort().sort(unordered);
        assertArrayEquals(ordered, unordered);
    }

    @Test
    void testQuickSort() {
        int[] unordered = {4, 23, 6, 78, 1, 54, 231, 9, 12};
        int[] ordered = {1, 4, 6, 9, 12, 23, 54, 78, 231};
        new QuickSort().sort(unordered, 0, unordered.length -1);
        assertArrayEquals(ordered, unordered);
    }

}
