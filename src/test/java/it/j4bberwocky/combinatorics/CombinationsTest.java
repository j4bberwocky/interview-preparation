package it.j4bberwocky.combinatorics;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CombinationsTest {
    

    @Test
    void testCombinations() {
        Combinations instance = new Combinations();
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);
        //input.add(6);
        List<List<Integer>> combinations = instance.combinations(input, 4);
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}
