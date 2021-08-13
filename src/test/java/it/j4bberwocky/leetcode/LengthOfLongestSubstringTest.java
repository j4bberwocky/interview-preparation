package it.j4bberwocky.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LengthOfLongestSubstringTest {

    private LengthOfLongestSubstring instance = new LengthOfLongestSubstring();

    @Test
    void test() {
        String s = "pwwkew";
        assertEquals(3, instance.lengthOfLongestSubstring(s));
    }

    @Test
    void test2() {
        String s = " ";
        assertEquals(1, instance.lengthOfLongestSubstring(s));
    }

    @Test
    void test3() {
        String s = "dvdf";
        assertEquals(3, instance.lengthOfLongestSubstring(s));
    }

    @Test
    void test4() {
        String s = "asjrgapa";
        assertEquals(6, instance.lengthOfLongestSubstring(s));
    }
    
}
