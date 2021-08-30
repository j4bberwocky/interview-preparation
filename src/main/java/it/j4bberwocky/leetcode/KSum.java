package it.j4bberwocky.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class KSum {

    public List<List<Integer>> kSum(int[] nums, int k, int target) {
        if (nums == null || nums.length < k || k <= 0) {
            return Collections.emptyList();
        }
        
        Arrays.sort(nums);
        
        return k == 1 ? oneSum(nums, target) : kSum(nums, 0, k, target);
    }

    private List<List<Integer>> kSum(int[] nums, int fixedIndex, int k, int target) {
        List<List<Integer>> res = new ArrayList<>();
        
        if (k == 2) { // 2Sum!
            perform2Sum(res, nums, fixedIndex, nums.length - 1, target);
            return res;
        }
        
        // Not 2Sum, recurse!
        for (int i = fixedIndex; i < nums.length - k + 1; i++) { // i < nums.length - k + 1, e.g., for 4Sum, i < nums.length - 3
            if (i > fixedIndex && nums[i] == nums[i - 1]) { // Skip duplicates
                continue;
            }
            
            // Given the fixed number, solve a (K - 1)-Sum problem
            List<List<Integer>> kMinusOneSum = kSum(nums, i + 1, k - 1, target - nums[i]);
            
            // Prepend the fixed number to result of (K - 1)-Sum
            for (List<Integer> elements : kMinusOneSum) {
                elements.add(0, nums[i]); // O(1) since the inner list is a LinkedList
                log.info(elements.toString());
            }
            
            res.addAll(kMinusOneSum);
        }
        
        return res;
    }
    
    // Do a 2Sum and collect the last 2 integers
    private void perform2Sum(List<List<Integer>>res, int[] nums, int start, int end, int target) {
        while (start < end) {
            int sum = nums[start] + nums[end];
            
            if (sum == target) { // Found!
                log.info(nums[start] + " " + nums[end]);
                res.add(new LinkedList<>(Arrays.asList(nums[start++], nums[end--])));
                
                while (start < end && nums[start] == nums[start - 1]) { // Skip duplicates
                    start++;
                }
                
                while (end > start && nums[end] == nums[end + 1]) { // Skip duplicates
                    end--;
                }
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }        
    }
    
    private List<List<Integer>> oneSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && (i == 0 || nums[i] != nums[i - 1])) {
                res.add(Arrays.asList(nums[i]));
            }
        } 
        
        return res;
    }
    
}
