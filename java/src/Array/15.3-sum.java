/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 *
 * https://leetcode.com/problems/3sum/description/
 *
 * algorithms
 * Medium (23.40%)
 * Total Accepted:    497.8K
 * Total Submissions: 2.1M
 * Testcase Example:  '[-1,0,1,2,-1,-4]'
 *
 * Given an array nums of n integers, are there elements a, b, c in nums such
 * that a + b + c = 0? Find all unique triplets in the array which gives the
 * sum of zero.
 * 
 * Note:
 * 
 * The solution set must not contain duplicate triplets.
 * 
 * Example:
 * 
 * 
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 * 
 * A solution set is:
 * [
 * ⁠ [-1, 0, 1],
 * ⁠ [-1, -1, 2]
 * ]
 * 
 * 
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>(); 
        Set<List<Integer>> set = new HashSet<>();
        for(int f = 0;f<nums.length-2;f++){
            int target = 0-nums[f];
            int l = f+1;
            int r= nums.length-1;
            while(l<r){
                if(nums[l]+nums[r]==target){
                    List<Integer> list = Arrays.asList(nums[f], nums[l], nums[r]);
                    if(set.add(list)){
                        res.add(list);
                    }
                    l++;
                    r--;
                }
                else if(nums[l]+nums[r]<target){
                    l++;
                }
                else
                    r--;
            }
        }
        return res;
    }
}

