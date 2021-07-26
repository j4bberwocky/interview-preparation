package it.j4bberwocky.hackerrank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RepeatedStringTest {

    @Test
    void test1() {
        String s = "aba";
        long n = 10L;
        long expected = 7L;
        assertEquals(expected, RepeatedString.repeatedString(s, n));
    }
    
    @Test
    void test2() {
        String s = "a";
        long n = 1000000000000L;
        long expected = 1000000000000L;
        assertEquals(expected, RepeatedString.repeatedString(s, n));
    }
}
