package it.j4bberwocky.leetcode;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class KSumTest {

    //private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(KSumTest.class);

    @Test
    void test1() {
        KSum kSum = new KSum();
        int[] nums = {1,0,-1,0,-2,2};
        List<List<Integer>> result = kSum.kSum(nums, 4, 0);
        assertNotNull(result);
        print(result);
    }

    private void print (List<List<Integer>> result) {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (List<Integer> list : result) {
            sb.append("[");
            for (Integer i : list) {
                sb.append(i.toString() + " ");
            }
            sb.append("]");            
        }
        sb.append("]");
        log.info(sb.toString());
    }

}