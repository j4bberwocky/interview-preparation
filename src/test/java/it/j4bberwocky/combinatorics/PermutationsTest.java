package it.j4bberwocky.combinatorics;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class PermutationsTest {
    
    private Permutations instance;

    @BeforeAll
    void setUp() {
        instance = new Permutations();
    }

    @Test
    void testPermutations() {
        List<Integer> numbers = new ArrayList<>();  
        numbers.add(1);  
        numbers.add(2);  
        numbers.add(3);  
        numbers.add(4);  
        Set<List<Integer>> permutations = instance.generatePermutations(numbers);
        assertNotNull(permutations);
        instance.printPermutations(permutations);
    }

}
