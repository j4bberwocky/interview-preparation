package it.j4bberwocky.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DemoTaskTest {

    private DemoTask demoTask = new DemoTask();

    @Test
    void test() {
        int[] arr = {1, 3, 6, 4, 1, 2};
        assertEquals(5, demoTask.solution(arr));
    }

    @Test
    void test1() {
        int[] arr = {1, 2, 3};
        assertEquals(4, demoTask.solution(arr));
    }

    @Test
    void test2() {
        int[] arr = {-1, -3};
        assertEquals(1, demoTask.solution(arr));
    }

    @Test
    void test3() {
        int[] arr = {};
        assertEquals(1, demoTask.solution(arr));
    }

    @Test
    void test5() {
        int[] arr = {2, 3, 4};
        assertEquals(1, demoTask.solution(arr));
    }

    @Test
    void test6() {
        int[] arr = {-1, 1};
        assertEquals(2, demoTask.solution(arr));
    }

    @Test
    void test4() {
        int[] arr = {0, 1};
        assertEquals(2, demoTask.solution(arr));
    }

    @Test
    void test7() {
        int[] arr = {1, 1};
        assertEquals(2, demoTask.solution(arr));
    }

    @Test
    void test8() {
        int[] arr = {-2, -1, 12, 1};
        assertEquals(2, demoTask.solution(arr));
    }
    
}
