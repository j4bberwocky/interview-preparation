package it.j4bberwocky.combinatorics;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    // k-combination of a set S is a subset of k distinct elements from S,
    // where an order of items doesn't matter.
    // The number of k-combinations is described by the binomial coefficient.
    // n!/(k!(n-k)!)

    public List<List<Integer>> combinations(List<Integer> inputSet, int k) {
        List<List<Integer>> results = new ArrayList<>();
        combinationsInternal(inputSet, k, results, new ArrayList<>(), 0);
        return results;
    }

    private static void combinationsInternal(List<Integer> inputSet, int k, List<List<Integer>> results,
            ArrayList<Integer> accumulator, int index) {
        int needToAccumulate = k - accumulator.size();
        int canAcculumate = inputSet.size() - index;

        if (accumulator.size() == k) {
            results.add(new ArrayList<>(accumulator));
        } else if (needToAccumulate <= canAcculumate) {
            combinationsInternal(inputSet, k, results, accumulator, index + 1);
            accumulator.add(inputSet.get(index));
            combinationsInternal(inputSet, k, results, accumulator, index + 1);
            accumulator.remove(accumulator.size() - 1);
        }
    }

}
