class Solution:
    def moveZeroes(self, nums):
        """
        :type nums: list[int]
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        while self.check(nums):
            for i in range(len(nums) - 1):
                if nums[i] == 0:
                    for j in range(i, len(nums) - 1):
                        a = nums[j + 1]
                        nums[j + 1] = nums[j]
                        nums[j] = a
        print(nums)

    def check(self, nums):
        for i in range(len(nums) - 1):
            if nums[i] == 0 and nums[i + 1] != 0:
                return True
        return False


    #AC