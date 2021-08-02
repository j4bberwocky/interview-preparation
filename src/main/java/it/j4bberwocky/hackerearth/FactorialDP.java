package it.j4bberwocky.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FactorialDP {

    public static void main(String args[]) throws Exception {

        // Write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer number = Integer.parseInt(br.readLine());

        List<Long> input = new ArrayList<>();
        Long max = Long.MIN_VALUE;
        int i = 0;
        while (i < number) {
            Long n = Long.parseLong(br.readLine());
            input.add(n);
            max = Math.max(max, n);
            i++;
        }

        String output = evaluate(input, max);
        System.out.println(output);
    }

    public static String evaluate(List<Long> numbers, Long max) {
        Long mod = 1_000_000_007L;

        Long[] dp = new Long[max.intValue() + 1];

        for (int j = 0; j <= max; j++) {
            if (j == 0 || j == 1) {
                dp[j] = 1L;
            } else {
                dp[j] = (dp[j-1] * j) % mod;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < numbers.size(); j++) {
            sb.append(dp[numbers.get(j).intValue()]);
            if (j != numbers.size() - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

}
