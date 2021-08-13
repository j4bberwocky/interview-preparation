package it.j4bberwocky.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/** See https://leetcode.com/explore/learn/card/hash-table/187/conclusion-hash-table/1135/ */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        // Creating a set to store the last positions of occurrence
        Map<Character, Integer> seen = new HashMap<>(); 
        int maximum_length = 0;
    
        // starting the initial point of window to index 0
        int start = 0;
    
        for(int end = 0; end < s.length(); end++) {
            // Checking if we have already seen the element or not
            if(seen.containsKey(s.charAt(end))){
                // If we have seen the number, move the start pointer
                // to position after the last occurrence
                start = Math.max(start, seen.get(s.charAt(end)) + 1);
            }
        
            // Updating the last seen value of the character
            seen.put(s.charAt(end), end);
            maximum_length = Math.max(maximum_length, end-start + 1);
        }
        
        return maximum_length;
    /*
        int max = 0;
        
        if (s == null || s.length() == 0) {
            return max;
        }
        
        Set<Character> set = new HashSet<>();
        
        char[] charArray = s.toCharArray();
        
        for (int j = 0; j < charArray.length; j++) {
            max = Math.max(set.size(), max);
            set.clear();
            for (int i = j; i < charArray.length; i++) {
                if (set.contains(charArray[i])) {
                    max = Math.max(set.size(), max);
                    set.clear();                
                }
                set.add(charArray[i]);
            }
        }

        return Math.max(set.size(), max);
    */
    }
}
