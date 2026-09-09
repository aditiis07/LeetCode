// ======================================
// LeetCode Problem: subarray sum equals k
// Language: java
// Link: https://leetcode.com/problems/subarray-sum-equals-k/
// Synced by: LinkCode
// Date: 9/9/2026, 2:06:07 pm
// ======================================


class Solution {
    public int subarraySum(int[] nums, int k) {
      int count = 0;
      for(int i = 0 ; i< nums.length ; i++){
        if(nums[i] == k) count++;
        int left  = 0 ;
        left+=nums[i];
        for(int j = i+1 ; j <nums.length ; j++){
            left+=nums[j];
            
            if(left  == k ){
                count++;
                
            }
            
        }
      }
      return count;
    }
}