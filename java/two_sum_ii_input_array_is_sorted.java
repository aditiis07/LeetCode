// ======================================
// LeetCode Problem: two sum ii input array is sorted
// Language: java
// Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
// Synced by: LinkCode
// Date: 10/9/2026, 3:14:29 pm
// ======================================


class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int right = numbers.length - 1;
        int left = 0;
        
        while(left<right){
            int sum = numbers[left] + numbers[right];
            if(sum == target) return new int[]{left+1,right+1};
            else if(sum< target) left++;
            else right--;
        }
        return new int[]{-1,-1};

    }
}