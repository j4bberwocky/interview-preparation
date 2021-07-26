package it.j4bberwocky.hackerrank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class JumpingOnTheCloudsTest {

    @Test
    void test1() {
        List<Integer> input = Arrays.asList(new Integer[]{0, 0, 0, 0, 1, 0});
        int expected = 3;
        assertEquals(expected, JumpingOnTheClouds.solution(input));
    }

    @Test
    void test2() {
        List<Integer> input = Arrays.asList(new Integer[]{0, 0, 1, 0, 0, 1, 0});
        int expected = 4;
        assertEquals(expected, JumpingOnTheClouds.solution(input));
    }

}
