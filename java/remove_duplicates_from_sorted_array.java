// ======================================
// LeetCode Problem: remove duplicates from sorted array
// Language: java
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Synced by: LinkCode
// Date: 10/9/2026, 3:34:51 pm
// ======================================


class Solution {
    public int removeDuplicates(int[] nums) {
      int slow = 0 ;
    for(int fast = 1 ; fast<nums.length ; fast++){
        if(nums[fast] != nums[slow]){
            slow++;
            nums[slow] = nums[fast];
        }
    }
return slow+1;
    }
}