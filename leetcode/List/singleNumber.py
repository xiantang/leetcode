class Solution:
    def singleNumber(self, nums1, nums2):
        """
        定一个非空整数数组，除了某个元素只出现一次以外，
        其余每个元素均出现两次。找出那个只出现了一次的元素。
        :type nums: List[int]
        :rtype: int
        """
        lis = []
        for i in nums1:
            if i in nums2:
                lis.append(i)
        return lis



print(Solution().singleNumber([1,4,32,4,1,3],
[1,1,14,5,4,2,4]))