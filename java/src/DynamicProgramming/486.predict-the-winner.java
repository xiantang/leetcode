/*
 * @lc app=leetcode id=486 lang=java
 *
 * [486] Predict the Winner
 *
 * https://leetcode.com/problems/predict-the-winner/description/
 *
 * algorithms
 * Medium (46.63%)
 * Total Accepted:    46.3K
 * Total Submissions: 99.3K
 * Testcase Example:  '[1,5,2]'
 *
 * Given an array of scores that are non-negative integers. Player 1 picks one
 * of the numbers from either end of the array followed by the player 2 and
 * then player 1 and so on. Each time a player picks a number, that number will
 * not be available for the next player. This continues until all the scores
 * have been chosen. The player with the maximum score wins. 
 * 
 * Given an array of scores, predict whether player 1 is the winner. You can
 * assume each player plays to maximize his score. 
 * 
 * Example 1:
 * 
 * Input: [1, 5, 2]
 * Output: False
 * Explanation: Initially, player 1 can choose between 1 and 2. If he chooses 2
 * (or 1), then player 2 can choose from 1 (or 2) and 5. If player 2 chooses 5,
 * then player 1 will be left with 1 (or 2). So, final score of player 1 is 1 +
 * 2 = 3, and player 2 is 5. Hence, player 1 will never be the winner and you
 * need to return False.
 * 
 * 
 * 
 * Example 2:
 * 
 * Input: [1, 5, 233, 7]
 * Output: True
 * Explanation: Player 1 first chooses 1. Then player 2 have to choose between
 * 5 and 7. No matter which number player 2 choose, player 1 can choose
 * 233.Finally, player 1 has more score (234) than player 2 (12), so you need
 * to return True representing player1 can win.
 * 
 * 
 * 
 * Note:
 * 
 * 1 
 * Any scores in the given array are non-negative integers and will not exceed
 * 10,000,000.
 * If the scores of both players are equal, then player 1 is still the winner.
 * 
 * 
 */
class Solution {
    public boolean PredictTheWinner(int[] nums) {
        // 区间dp问题
        int[][] dp = new int[nums.length][nums.length];
        // 记住 dp[i][j] 指的是玩家a i->j 能够得到的分数
        // 长度为1 的初始值 就是i=i 只有1个元素
        for(int i = 0;i<nums.length;i++){
            dp[i][i] = nums[i];
        }
        // 长度为2 的初始值 就是j->j+1 有2个元素
        for(int j = 0;j<nums.length-1;j++){
            dp[j][j+1] = Math.max(nums[j],nums[j+1]);
        }
        // 所有的值 
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum+= nums[i];
        }
        // 长度为3的初始值 
        // 转换方程为 
        // left = Math.min(dp[i+1][j-1],dp[i+2][j])+nums[i];
        // 就是当玩家1在这个序列中选择了左边
        // 玩家2就需要在这个剩下的序列中选择左边或者右边
        // 看那边能使玩家1获得的分数最小，通过查表
        // 同理计算右边
        // 计算左右两边的最大值 
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

