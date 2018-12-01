class Solution(object):
    def findDisappearedNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        marked = set(nums)
        return [i for i in range(1, len(nums)+1) if i not in marked]