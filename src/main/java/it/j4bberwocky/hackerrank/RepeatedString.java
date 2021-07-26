package it.j4bberwocky.hackerrank;

/** See https://www.hackerrank.com/challenges/repeated-string/problem */
public class RepeatedString {
    
    public static long repeatedString(String s, long n) {
        long aCounter = 0L;
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                aCounter++;
            }
        }

        aCounter = n / s.length() * aCounter;

        if (n % s.length() != 0) {
            String substring = s.substring(0, (int) (n % s.length()));
            for (char c : substring.toCharArray()) {
                if (c == 'a') {
                    aCounter++;
                }
            }
        }

        return aCounter;
    }

}
