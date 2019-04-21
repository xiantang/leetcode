/*
 * @lc app=leetcode id=321 lang=java
 *
 * [321] Create Maximum Number
 *
 * https://leetcode.com/problems/create-maximum-number/description/
 *
 * algorithms
 * Hard (25.24%)
 * Total Accepted:    29.6K
 * Total Submissions: 117.1K
 * Testcase Example:  '[3,4,6,5]\n[9,1,2,5,8,3]\n5'
 *
 * Given two arrays of length m and n with digits 0-9 representing two numbers.
 * Create the maximum number of length k <= m + n from digits of the two. The
 * relative order of the digits from the same array must be preserved. Return
 * an array of the k digits.
 * 
 * Note: You should try to optimize your time and space complexity.
 * 
 * Example 1:
 * 
 * 
 * Input:
 * nums1 = [3, 4, 6, 5]
 * nums2 = [9, 1, 2, 5, 8, 3]
 * k = 5
 * Output:
 * [9, 8, 6, 5, 3]
 * 
 * Example 2:
 * 
 * 
 * Input:
 * nums1 = [6, 7]
 * nums2 = [6, 0, 4]
 * k = 5
 * Output:
 * [6, 7, 6, 0, 4]
 * 
 * Example 3:
 * 
 * 
 * Input:
 * nums1 = [3, 9]
 * nums2 = [8, 9]
 * k = 3
 * Output:
 * [9, 8, 9]
 * 
 */
class Solution {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int[] best = new int[0];
        for (int i = Math.max(0, k - nums2.length); 
                 i <= Math.min(k, nums1.length); ++i)            
            best = max(best, 0, 
                       maxNumber(maxNumber(nums1, i), 
                                 maxNumber(nums2, k - i)), 0);
        return best;
    }
    
    private int[] maxNumber(int[] nums, int k) {
        int[] ans = new int[k];
        int j = 0;
        for (int i = 0; i < nums.length; ++i) {
            while (j > 0 && nums[i] > ans[j - 1] 
                && nums.length - i > k - j) --j;
            if (j < k)
                ans[j++] = nums[i];
        }        
        return ans;
    }
    
    private int[] maxNumber(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length + nums2.length];
        int s1 = 0;
        int s2 = 0;
        int index = 0;
        while (s1 != nums1.length || s2 != nums2.length)
            ans[index++] = max(nums1, s1, nums2, s2) == nums1 ? 
                           nums1[s1++] : nums2[s2++];
        return ans;
    }
    
    private int[] max(int[] nums1, int s1, int[] nums2, int s2) {
        for (int i = s1; i < nums1.length; ++i) {
            int j = s2 + i - s1;
            if (j >= nums2.length) return nums1;
            if (nums1[i] < nums2[j]) return nums2;
            if (nums1[i] > nums2[j]) return nums1;
        }
        return nums2;
    }
}

