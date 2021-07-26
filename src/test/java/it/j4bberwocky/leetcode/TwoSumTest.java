package it.j4bberwocky.leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoSumTest {
    
    private TwoSum instance;

    @BeforeEach
    void instanceSetUp() {
        instance = new TwoSum();
    }

    @Test
    void test1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, instance.twoSum(nums, target));
    }
    
}
