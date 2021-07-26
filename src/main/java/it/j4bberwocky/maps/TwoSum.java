package it.j4bberwocky.maps;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
		int[] output = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
				if (nums[i] + entry.getValue() == target) {
					output[0] = entry.getKey();
                    output[1] = i;
					break;
				}
			}		
			map.put(i, nums[i]);
		}
		return output;		
    }
}
