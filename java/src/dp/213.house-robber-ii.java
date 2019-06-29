/*
 * @lc app=leetcode id=213 lang=java
 *
 * [213] House Robber II
 */
class Solution {
    class Solution {
        public int rob(int[] nums) {
            if(nums.length==0){
                return 0;
            }
            int[] f = {0,0};
            for(int i=1;i<nums.length;i++){
                int[] g = {0,0};
                g[0] = Math.max(f[0],f[1]);
                g[1] = nums[i]+ f[0];
                f[0] = g[0];
                f[1] = g[1];
            }
            int ret = Math.max(f[0],f[1]);
            
            f[1] = nums[0];
            f[0] = 0;
                  
             for(int i=1;i<nums.length -1;i++){
                int[] g = {0,0};
                g[0] = Math.max(f[0],f[1]);            
                g[1] = nums[i]+ f[0];
                f[0] = g[0];
                f[1] = g[1];
            }
            
            return Math.max(Math.max(f[0],f[1]),ret);
        }
    }
}

