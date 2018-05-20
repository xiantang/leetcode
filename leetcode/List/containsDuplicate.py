class Solution:
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        len1=len(set(nums))
        print(len1)
        len2=len(nums)
        print(len2)
        if len1!=len2:
            return True
        else:return False
print(Solution().containsDuplicate([]))