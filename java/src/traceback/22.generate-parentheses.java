/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 *
 * https://leetcode.com/problems/generate-parentheses/description/
 *
 * algorithms
 * Medium (53.13%)
 * Total Accepted:    308.2K
 * Total Submissions: 576.3K
 * Testcase Example:  '3'
 *
 * 
 * Given n pairs of parentheses, write a function to generate all combinations
 * of well-formed parentheses.
 * 
 * 
 * 
 * For example, given n = 3, a solution set is:
 * 
 * 
 * [
 * ⁠ "((()))",
 * ⁠ "(()())",
 * ⁠ "(())()",
 * ⁠ "()(())",
 * ⁠ "()()()"
 * ]
 * 
 */
class Solution {
    List<String> res = new ArrayList<String>();
    public List<String> generateParenthesis(int n) {
        backtrack("",0,0,n);
        return res;
    }
    
    public void backtrack(String com,int open,int close,int max){
        if(max*2 == com.length()){
            res.add(com);
            return; 
        }
        if(open<max){
            backtrack(com+"(",open+1,close,max);
        }
        if(close<open){
            backtrack(com+")",open,close+1,max);
        }
        
    }
}

