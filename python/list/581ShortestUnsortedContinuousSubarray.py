class Solution(object):
    def findUnsortedSubarray(self, nums:list):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        m = nums[0]
        end = 0
        for i in range(1, len(nums)):
            if nums[i] >= m:
                m = nums[i]
            else:
                end = i

        m = nums[-1]
        start = len(nums) - 1
        for i in range(len(nums) - 1, -1, -1):
            if nums[i] <= m:
                m = nums[i]
            else:
                start = i

        if start == end:
            return 0

        return max(end - start + 1, 0)