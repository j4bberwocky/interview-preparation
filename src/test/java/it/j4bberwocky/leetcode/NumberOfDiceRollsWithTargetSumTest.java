package it.j4bberwocky.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NumberOfDiceRollsWithTargetSumTest {

    private static class TestCase {
        private final int d;
        private final int f;
        private final int target;
        private final int expected;
        public TestCase(int d, int f, int target, int expected) {
            this.d = d;
            this.f = f;
            this.target = target;
            this.expected = expected;
        }
        public int getD() {
            return d;
        }
        public int getF() {
            return f;
        }
        public int getTarget() {
            return target;
        }
        public int getExpected() {
            return expected;
        }        
    }

    private static final TestCase[] TEST_CASES = {
        new TestCase(1, 6, 3, 1)
        , new TestCase(2, 6, 7, 6)
        , new TestCase(2, 5, 10, 1)
        , new TestCase(1, 2, 3, 0)
        , new TestCase(30, 30, 500, 222616187)
    };

    private NumberOfDiceRollsWithTargetSum instance = new NumberOfDiceRollsWithTargetSum();

    @Test
    void test(){
        for (int i = 0; i < TEST_CASES.length; i++) {
            assertEquals(
                TEST_CASES[i].getExpected(), 
                instance.numRollsToTarget(
                    TEST_CASES[i].getD(), 
                    TEST_CASES[i].getF(), 
                    TEST_CASES[i].getTarget()),
                "Fail test case " + i + ": d=" + TEST_CASES[i].getD() + ", f=" + TEST_CASES[i].getF() + ", target=" + TEST_CASES[i].getTarget()
            );
        }
    }
    
}
