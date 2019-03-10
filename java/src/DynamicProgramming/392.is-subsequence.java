/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 *
 * https://leetcode.com/problems/is-subsequence/description/
 *
 * algorithms
 * Medium (46.23%)
 * Total Accepted:    80.6K
 * Total Submissions: 174.3K
 * Testcase Example:  '"abc"\n"ahbgdc"'
 *
 * 
 * Given a string s and a string t, check if s is subsequence of t.
 * 
 * 
 * 
 * You may assume that there is only lower case English letters in both s and
 * t. t is potentially a very long (length ~= 500,000) string, and s is a short
 * string (
 * 
 * 
 * A subsequence of a string is a new string which is formed from the original
 * string by deleting some (can be none) of the characters without disturbing
 * the relative positions of the remaining characters. (ie, "ace" is a
 * subsequence of "abcde" while "aec" is not).
 * 
 * 
 * Example 1:
 * s = "abc", t = "ahbgdc"
 * 
 * 
 * Return true.
 * 
 * 
 * Example 2:
 * s = "axc", t = "ahbgdc"
 * 
 * 
 * Return false.
 * 
 * 
 * Follow up:
 * If there are lots of incoming S, say S1, S2, ... , Sk where k >= 1B, and you
 * want to check one by one to see if T has its subsequence. In this scenario,
 * how would you change your code?
 * 
 * Credits:Special thanks to @pbrother for adding this problem and creating all
 * test cases.
 */
class Solution {
    public boolean isSubsequence(String s, String t) {
        int[][] dp = new int[nums.length][nums.length];
        for(int i = 0;i<nums.length;i++){
            dp[i][i] = nums[i];
        }
        for(int j = 0;j<nums.length-1;j++){
            dp[j][j+1] = Math.max(nums[j],nums[j+1]);
        }
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum+= nums[i];
        }
        for(int l =3;l<=nums.length;l++){
            for(int i = 0;i+l-1<nums.length;i++){
                // 子数组的终点 索引
                int j = i+l-1;
                int left = Math.min(dp[i+1][j-1],dp[i+2][j])+nums[i];
                int right = Math.min(dp[i][j-2],dp[i+1][j-1])+nums[j];
                dp[i][j] = Math.max(left,right);
            }
        }
        return 2*dp[0][nums.length-1]>=sum;
    }
}

