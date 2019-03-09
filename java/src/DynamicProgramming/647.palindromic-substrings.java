/*
 * @lc app=leetcode id=647 lang=java
 *
 * [647] Palindromic Substrings
 *
 * https://leetcode.com/problems/palindromic-substrings/description/
 *
 * algorithms
 * Medium (55.94%)
 * Total Accepted:    85.5K
 * Total Submissions: 152.8K
 * Testcase Example:  '"abc"'
 *
 * Given a string, your task is to count how many palindromic substrings in
 * this string.
 * 
 * The substrings with different start indexes or end indexes are counted as
 * different substrings even they consist of same characters.
 * 
 * Example 1:
 * 
 * 
 * Input: "abc"
 * Output: 3
 * Explanation: Three palindromic strings: "a", "b", "c".
 * 
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "aaa"
 * Output: 6
 * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * The input string length won't exceed 1000.
 * 
 * 
 * 
 * 
 */
class Solution {
    public int countSubstrings(String s) {
        int[] dp = new int[s.length()];
        for(int i = 1;i<s.length();i++){
            int temp = 0;
            for(int j = 0;j<i;j++){
                if(s.charAt(i) == s.charAt(j)){
                    if(isPalindrom(s.substring(j,i+1))){
                         temp++;
                    }
                }
            
                
            }
            dp[i] = dp[i-1]+temp;
        }
        return dp[dp.length-1]+dp.length;
    }
    
    public boolean isPalindrom(String sub){
        for(int i = 0;i<(sub.length())/2;i++){
            if(sub.charAt(i)!=sub.charAt(sub.length()-1-i)){
                return false;
            
            }
        }
        return true;
    }
}

