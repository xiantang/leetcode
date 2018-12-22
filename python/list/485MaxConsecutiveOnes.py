class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = 0
        list_of_count = []

        for i in range(len(nums)):
            if nums[i] == 1:
                count+=1
            else:
                list_of_count.append(count)
                count=0
        # 避免只有【1】的情况
        list_of_count.append(count)
        return max(list_of_count)