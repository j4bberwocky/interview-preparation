package it.j4bberwocky.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SolutionTask {

    public int solution(String[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }

        if (A.length == 1) {
            return A[0].length();
        }

        List<String> list = generateStringsWithUniqueCharacters(Arrays.asList(A), 0);

        int maxLength = 0;
        for (String s : list) {
            maxLength = Math.max(maxLength, s.length());
        }
        return maxLength;
    }

    public List<String> generateStringsWithUniqueCharacters(List<String> list, int idx) {
        List<String> end = new ArrayList<>();
        end.add("");

        // passo base della ricorsione
        if (idx == list.size())
            return end;

        // ricorsione i + 1
        List<String> tmp = generateStringsWithUniqueCharacters(list, idx + 1);

        // lista con stringhe da testare
        List<String> retList = new ArrayList<>(tmp);

        for (int i = 0; i < tmp.size(); i++) {
            String testString = tmp.get(i) + list.get(idx);

            if (checkStringWithUniqueCharacters(testString)) {
                retList.add(testString);
            }
        }
        return retList;
    }

    public boolean checkStringWithUniqueCharacters(String s) {
        Set<Character> a = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (a.contains(c)) {
                return false;
            }
            a.add(c);
        }
        return true;
    }

}
