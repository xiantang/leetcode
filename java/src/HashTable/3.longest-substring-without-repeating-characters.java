/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 *
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 *
 * algorithms
 * Medium (27.94%)
 * Total Accepted:    832.8K
 * Total Submissions: 3M
 * Testcase Example:  '"abcabcbb"'
 *
 * Given a string, find the length of the longest substring without repeating
 * characters.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: "abcabcbb"
 * Output: 3 
 * Explanation: The answer is "abc", with the length of 3. 
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * 
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3. 
 * ⁠            Note that the answer must be a substring, "pwke" is a
 * subsequence and not a substring.
 * 
 * 
 * 
 * 
 */
class Solution {
    //  Brute Force
    // public int lengthOfLongestSubstring(String s) {
    //     int max = 0;
    //     for(int i = 0;i<s.length();i++){
    //         Map<String,Integer> map = new HashMap();
    //         for(int j = i;j<s.length();j++){
    //             int isin=map.getOrDefault(s.substring(j,j+1),-1);
    //             if(isin>0){
    //                 // max = Math.max(max,j-i+1);
    //                 break;
    //             }
    //             map.put(s.substring(j,j+1),1);
    //             max = Math.max(max,j-i+1);
    //         }
            
    //     }
    //     return max;
    // }
    // Sliding Window Optimized
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for(int i = 0;i<s.length();i++){
            Map<String,Integer> map = new HashMap();
            for(int j = i;j<s.length();j++){
                int isin=map.getOrDefault(s.substring(j,j+1),-1);
                if(isin>0){
                    // max = Math.max(max,j-i+1);
                    break;
                }
                map.put(s.substring(j,j+1),1);
                max = Math.max(max,j-i+1);
            }
            
        }
        return max;
    }
}

