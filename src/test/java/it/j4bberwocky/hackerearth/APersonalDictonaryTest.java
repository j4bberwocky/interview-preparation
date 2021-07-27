package it.j4bberwocky.hackerearth;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class APersonalDictonaryTest {

    @Test
    void test1() {
        String[] input = new String[]{"arn", "nra", "nar"};
        String expected = "ran";
        assertEquals(expected, APersonalDictonary.solve(input));
    }
    
}
