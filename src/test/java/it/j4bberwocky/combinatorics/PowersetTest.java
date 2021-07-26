package it.j4bberwocky.combinatorics;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class PowersetTest {

    @Test
    void testPowerset() {
        Set<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        Powerset<Integer>  instance  = new Powerset<>();
        Set<Set<Integer>> powerSet = instance.powerSet(mySet);
        assertNotNull(powerSet);
        System.out.println("There are "+powerSet.size()+" subsets:");
        for (Set<Integer> s : powerSet) {
            System.out.println(s);
        }
    }

}
