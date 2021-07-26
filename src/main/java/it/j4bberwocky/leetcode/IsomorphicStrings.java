package it.j4bberwocky.leetcode;

import java.util.HashMap;
import java.util.Map;

/** See https://leetcode.com/problems/isomorphic-strings/ */
public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String key = s.substring(i, i + 1); 
            String value = t.substring(i, i + 1);
            if (map.containsKey(key) && !map.get(key).equals(value)) {
                return false;
            } else if (!map.containsKey(key) && map.containsValue(value)) {
                return false;
            } else {
                map.put(key, value);
            }
        }

        return true;
    }

}
