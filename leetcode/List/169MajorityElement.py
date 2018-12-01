class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        dic = {}
        for num in nums:
            dic[num] = dic.get(num,0)+1
        for num in nums:
            if dic[num]>len(nums)/2:
                return num