// ======================================
// LeetCode Problem: valid palindrome
// Language: java
// Link: https://leetcode.com/problems/valid-palindrome/
// Synced by: LinkCode
// Date: 27/8/2026, 7:47:44 pm
// ======================================


class Solution {
    public boolean isPalindrome(String s) {
        int left = 0 ;
        int right = s.length() -1;
        while(left<right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
                }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                 right--;
                 }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}