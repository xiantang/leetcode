class Solution:
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        while k!=0:
            last=nums[len(nums)-1]
            for i in range(len(nums)-1,-1,-1 ):
                nums[i]=nums[i-1]
            nums[0]=last
            k-=1
        return nums
print(Solution().rotate([1,2,3,4,5,6,7],3))