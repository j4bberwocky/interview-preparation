package it.j4bberwocky.combinatorics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A permutation is an act of rearranging a sequence in such a way that it has a different order.
 * For a sequence of n elements, there are n! different permutations. 
 */
public class Permutations {

    public Set<List<Integer>> generatePermutations(List<Integer> sequence) {
        Set<List<Integer>> permutations = new HashSet<>();
        permutationsInternal(sequence, permutations, 0);
        return permutations;
    }

    private void permutationsInternal(List<Integer> sequence, Set<List<Integer>> permutations, int index) {
        // check if we've reached the last element. If so, we add the sequence to the results list.
        if (index == sequence.size() - 1) {
            permutations.add(new ArrayList<>(sequence));
        }
    
        for (int i = index; i < sequence.size(); i++) {
            swap(sequence, i, index);
            permutationsInternal(sequence, permutations, index + 1);
            swap(sequence, i, index);
        }
    }

    private void swap(List<Integer> sequence, int i, int index) {
        int temp = sequence.get(index);
        sequence.set(index, sequence.get(i));
        sequence.set(i, temp);
    }   

    public void printPermutations(Set<List<Integer>> permutations) {
        System.out.println("There are " + permutations.size() + " permutations:");
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation.toString());
        }
    }
    
}
