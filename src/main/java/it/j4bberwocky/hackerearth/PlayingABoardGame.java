package it.j4bberwocky.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PlayingABoardGame {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        int n = Integer.parseInt(br.readLine());
        int j = 0;
        while (j < n) {
            int input = Integer.parseInt(br.readLine());
            int[] table = new int[input + 1];
            Arrays.fill(table, 0);
            table[0] = 1;
            for (int i = 3; i <= input; i++)
                table[i] += table[i - 3];
            for (int i = 5; i <= input; i++)
                table[i] += table[i - 5];
            for (int i = 10; i <= input; i++)
                table[i] += table[i - 10];
        
            System.out.println(table[input]); 
            
            j++;
         
        }
    }
    
}
