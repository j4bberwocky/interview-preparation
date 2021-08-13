package it.j4bberwocky.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTaskTest {
    
    private SolutionTask instance = new SolutionTask();

    @Test
    void test1() {
        String[] input = {"co", "dil", "ity"};
        assertEquals(5, instance.solution(input));
    }

    @Test
    void test2() {
        String[] input = {"abc", "yyy", "def", "csv"};
        assertEquals(6, instance.solution(input));
    }

    @Test
    void test3() {
        String[] input = {"potato", "kayak", "banana", "racecar"};
        assertEquals(0, instance.solution(input));
    }

    @Test
    void test4() {
        String[] input = {"eva", "jqw", "tyn", "jan"};
        assertEquals(9, instance.solution(input));
    }
}
