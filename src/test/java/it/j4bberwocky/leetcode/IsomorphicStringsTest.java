package it.j4bberwocky.leetcode;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IsomorphicStringsTest {
    
    private IsomorphicStrings instance;

    @BeforeEach
    void instanceSetUp() {
        instance = new IsomorphicStrings();
    }

    @Test
    void test1() {
        String s = "egg";
        String t = "add";
        assertTrue(instance.isIsomorphic(s, t));
    }

    @Test
    void test2() {
        String s = "foo";
        String t = "bar";
        assertTrue(!instance.isIsomorphic(s, t));
    }

    @Test
    void test4() {
        String s = "badc";
        String t = "baba";
        assertTrue(!instance.isIsomorphic(s, t));
    }

    @Test
    void test3() {
        String s = "paper";
        String t = "title";
        assertTrue(instance.isIsomorphic(s, t));
    }
}
