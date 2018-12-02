class Solution(object):
    def maximumProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        if nums[0] >= 0:
            return nums[-2] * nums[-1] * nums[-3]
        elif nums[1] < 0:
            return max(nums[-2] * nums[-1] * nums[-3], nums[0] * nums[1] * nums[-1])
        else:
            return nums[-2] * nums[-1] * nums[-3]
