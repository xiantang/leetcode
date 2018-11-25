class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: list[int]
        :type m: int
        :type nums2: list[int]
        :type n: int
        :rtype: void Do not return anything, modify nums1 in-place instead.
        """
        if nums2 == []:
            pass
        elif n == 1 and m == 0:
            nums1[0] = nums2[0]
        else:
            nums1[m:m + n] = nums2[:n]
            nums1.sort()
        print(nums1)
Solution().merge([0],0,[1],1)