package it.j4bberwocky.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTask2Test {

    private SolutionTask2 instance = new SolutionTask2();

    @Test
    void test1() {
        int[] input = {13, 7, 2, 8, 3};
        assertEquals(3, instance.solution(input));
    }

    @Test
    void test2() {
        int[] input = {1, 2, 4, 8};
        assertEquals(3, instance.solution(input));
    }

    @Test
    void test3() {
        int[] input = {16, 16};
        assertEquals(2, instance.solution(input));
    }


}
