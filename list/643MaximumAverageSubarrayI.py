class Solution:
    def findMaxAverage(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: float
        """
        min_nums = 0
        for j in range(k):
            min_nums += nums[j]

        pre_sum = min_nums

        for i in range(k, len(nums)):

            now = pre_sum + nums[i] - nums[i - k]
            if min_nums < now:
                min_nums = now
            pre_sum = now

        return min_nums / k