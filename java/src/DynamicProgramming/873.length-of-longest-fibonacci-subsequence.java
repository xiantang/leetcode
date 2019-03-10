/*
 * @lc app=leetcode id=873 lang=java
 *
 * [873] Length of Longest Fibonacci Subsequence
 *
 * https://leetcode.com/problems/length-of-longest-fibonacci-subsequence/description/
 *
 * algorithms
 * Medium (45.53%)
 * Total Accepted:    12.6K
 * Total Submissions: 27.5K
 * Testcase Example:  '[1,2,3,4,5,6,7,8]'
 *
 * A sequence X_1, X_2, ..., X_n is fibonacci-like if:
 * 
 * 
 * n >= 3
 * X_i + X_{i+1} = X_{i+2} for all i + 2 <= n
 * 
 * 
 * Given a strictly increasing array A of positive integers forming a sequence,
 * find the length of the longest fibonacci-like subsequence of A.  If one does
 * not exist, return 0.
 * 
 * (Recall that a subsequence is derived from another sequence A by deleting
 * any number of elements (including none) from A, without changing the order
 * of the remaining elements.  For example, [3, 5, 8] is a subsequence of [3,
 * 4, 5, 6, 7, 8].)
 * 
 * 
 * 
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: [1,2,3,4,5,6,7,8]
 * Output: 5
 * Explanation:
 * The longest subsequence that is fibonacci-like: [1,2,3,5,8].
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: [1,3,7,11,12,14,18]
 * Output: 3
 * Explanation:
 * The longest subsequence that is fibonacci-like:
 * [1,11,12], [3,11,14] or [7,11,18].
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * 3 <= A.length <= 1000
 * 1 <= A[0] < A[1] < ... < A[A.length - 1] <= 10^9
 * (The time limit has been reduced by 50% for submissions in Java, C, and
 * C++.)
 * 
 * 
 */
class Solution {
    public int lenLongestFibSubseq(int[] A) {
        int[][] dp = new int[A.length][A.length];
        for(int i= 0;i<dp.length;i++){
            for(int j= 0;j<dp.length;j++){
                dp[i][j] =2;
            }
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.length;i++){
            map.put(A[i],i);
        }
        int ans = 0;
        int n = A.length;
        for(int j=0;j<n;++j){
            for(int k = j+1;k<n;++k){
                if(A[k] - A[j] > A[j]){
                    dp[j][k] = 2;
                }
                else{
                   int target = A[k]-A[j];
                    int i = map.getOrDefault(target,-1);
                    if(i!=j&&i!=-1){
                        dp[j][k] = dp[i][j]+1;
                        ans = Math.max(ans,dp[j][k]);
                    } 
                }
                
            }
        }
        return ans >= 3? ans : 0;
    }
}

