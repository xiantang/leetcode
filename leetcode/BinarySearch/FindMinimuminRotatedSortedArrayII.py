class Solution:
    def findMin(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums)<5:return min(nums)
        hi = len(nums)-1
        while hi > 0 and nums[hi] == nums[0]:
            hi -= 1
        if hi == 0:
            return nums[hi]
        lo = 1

        def find(lo,hi):
            if lo == hi:
                return
            mid = (lo+hi)//2

            if nums[mid-1]>nums[mid]:
                return nums[mid]
            elif nums[0]>nums[mid]:
                return  find(lo, mid-1)

            else:return find(mid + 1, hi)
        return nums[0] if find(lo,hi) ==None else find(lo,hi)
if __name__ == '__main__':
    print(Solution().findMin([3,1,1,1,1]))