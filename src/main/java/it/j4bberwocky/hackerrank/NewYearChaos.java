package it.j4bberwocky.hackerrank;

import java.util.List;

/** See https://www.hackerrank.com/challenges/new-year-chaos */
public class NewYearChaos {

    public static String minimumBribes(List<Integer> q) {
        int counter = 0;

        int expectedFirst = 1;
        int expectedSecond = 2;
        int expectedThird = 3;

        for (int i = 0; i < q.size(); i++) {
            if (q.get(i).equals(expectedFirst)) {
                expectedFirst = expectedSecond;
                expectedSecond = expectedThird;
                expectedThird++;
            } else if (q.get(i).equals(expectedSecond)) {
                counter++;
                expectedSecond = expectedThird;
                expectedThird++;
            } else if (q.get(i).equals(expectedThird)) {
                counter += 2;
                expectedThird++;
            } else {
                return "Too chaotic";
            }
        }

        return String.valueOf(counter);
        
    }
    
}
