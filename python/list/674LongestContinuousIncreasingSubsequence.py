class Solution(object):
    def findLengthOfLCIS(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) == 0:
            return 0
        res = 0
        count = 1
        pre = nums[0]
        for i in range(1, len(nums)):
            if pre >= nums[i]:
                res = count if count > res else res
                count = 1
            else:
                count += 1
            pre = nums[i]
        res = count if count > res else res
        return res
