// ======================================
// LeetCode Problem: continuous subarray sum
// Language: java
// Link: https://leetcode.com/problems/continuous-subarray-sum/
// Synced by: LinkCode
// Date: 11/9/2026, 2:59:32 pm
// ======================================


class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer ,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        for(int i = 0 ; i <nums.length ; i++){
            sum+=nums[i];
            int rem = sum % k;
            if(map.containsKey(rem)){
                if(i - map.get(rem) >=  2){
                    return true;
                }
                
            }
            else{
                map.put(rem,i);
                    }
                                                     
            
        }
        return false;
    }
}