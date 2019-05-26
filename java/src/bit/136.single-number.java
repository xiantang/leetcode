/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */
class Solution {
    public int singleNumber(int[] nums) {
        int a = 0;
        for(int i = 0;i<nums.length;i++){
            a ^= nums[i];
        }
        return a; 
    }
}

