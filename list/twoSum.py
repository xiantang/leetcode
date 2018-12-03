class Solution:
    def twoSum(self, nums, target):
        """
        :type nums: list[int]
        :type target: int
        :rtype: list[int]
        """
        for  i in range(len(nums)-1):
            for j in range(i+1,len(nums)):#最后是关掉的
                if  nums[i] + nums[j] ==target:
                    return [i,j]

print(Solution().twoSum([3,2,4],6))