/*
 * @lc app=leetcode id=215 lang=java
 *
 * [215] Kth Largest Element in an Array
 *
 * https://leetcode.com/problems/kth-largest-element-in-an-array/description/
 *
 * algorithms
 * Medium (46.78%)
 * Total Accepted:    346.5K
 * Total Submissions: 740.6K
 * Testcase Example:  '[3,2,1,5,6,4]\n2'
 *
 * Find the kth largest element in an unsorted array. Note that it is the kth
 * largest element in the sorted order, not the kth distinct element.
 * 
 * Example 1:
 * 
 * 
 * Input: [3,2,1,5,6,4] and k = 2
 * Output: 5
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: [3,2,3,1,2,4,5,5,6] and k = 4
 * Output: 4
 * 
 * Note: 
 * You may assume k is always valid, 1 ≤ k ≤ array's length.
 * 
 */
class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums==null || nums.length == 0) return 0;
        int left = 0;
        int right = nums.length-1;
        while(true){
            int pos = partition(nums,left,right);
            if(pos+1 == k){
                return nums[pos];
            }
            else if(pos +1>k){
                right = pos-1;
            }else
                left = pos+1;
        }
    }
    
    private int partition(int[] nums,int left,int right){
        int pivot = nums[left];
        int l = left+1;
        int r = right;
        while(l<=r){
            if(nums[l]<pivot && nums[r]>pivot){
                swap(nums,l++,r--);
            }
            if(nums[l]>=pivot) l++;
            if(nums[r]<=pivot) r--;
        }
        swap(nums,left,r);
            return r;
    }
    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

