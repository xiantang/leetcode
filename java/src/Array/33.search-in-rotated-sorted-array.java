/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 *
 * https://leetcode.com/problems/search-in-rotated-sorted-array/description/
 *
 * algorithms
 * Medium (32.63%)
 * Total Accepted:    381.9K
 * Total Submissions: 1.2M
 * Testcase Example:  '[4,5,6,7,0,1,2]\n0'
 *
 * Suppose an array sorted in ascending order is rotated at some pivot unknown
 * to you beforehand.
 * 
 * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
 * 
 * You are given a target value to search. If found in the array return its
 * index, otherwise return -1.
 * 
 * You may assume no duplicate exists in the array.
 * 
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 * 
 */
class Solution {
    public int search(int[] nums, int target) {
        if (A.length == 0) return -1;
        int L = 0, R = A.length-1;
        //
        if (target < A[L] && target > A[R]) return -1;
        while(L<R){
            int M = (L + R)/2;
            if(A[M]<=A[R]){
                if(target >A[M] && target <= A[R]){
                    L = M+1;
                }
                else{
                    R = M;
                }
            }
            else{
                if(target <= A[M] && target>= A[L]){
                    R = M;
                }
                else{
                    L = M+1;
                }
                
            }
        }
        if (A[L] == target) return L;
        else return -1;
    }
}

