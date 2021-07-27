package it.j4bberwocky.hackerearth;


public class AvangersAssemble {
    
    public static int solve(int[] input) {
        int minOps = 0; 
        int length = input.length;

        for (int i = 0,j = length -1; i <= j;) {
            
            if (input[i] == input[j]) {
                // If corner elements are same,
                // problem reduces arr[i+1..j-1]
                i++;
                j--;
            } else if (input[i] > input[j]) {
                // If left element is greater, then
                // we merge right two elements
                j--;
                input[j] += input[j+1] ;
                minOps++;
            } else {
                // Else we merge left two elements
                i++;
                input[i] += input[i-1];
                minOps++;
            } 
                       
        }
 
        return minOps;
    }

}
