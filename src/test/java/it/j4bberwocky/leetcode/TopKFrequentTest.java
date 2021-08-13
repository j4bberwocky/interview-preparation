package it.j4bberwocky.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TopKFrequentTest {
    
    private TopKFrequent instance = new TopKFrequent();

    @Test
    void testTopKFrequent() {
        print(instance.topKFrequent(new int[]{-1, -1}, 1));
    }

    @Test
    void testTopKFrequent2() {
        print(instance.topKFrequent(new int[]{1,1,1,2,2,3}, 2));
    }

    @Test
    void testTopKFrequent3() {
        print(instance.topKFrequent(new int[]{3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6}, 10));
    }

    private void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

}
