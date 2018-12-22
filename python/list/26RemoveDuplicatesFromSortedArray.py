class Solution:
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        a = set()
        for i in range(len(nums)):
            a.add(nums[i])
        return list(a)


if __name__ == '__main__':
    Solution().removeDuplicates([1,1,2])