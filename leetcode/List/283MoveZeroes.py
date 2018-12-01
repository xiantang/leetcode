class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        # 定义索引
        i = 0
        # 列表长度
        length = len(nums)
        while i < length:
            if nums[i] == 0:
                # 吐出i
                zero = nums.pop(i)
                nums.append(zero)
                length -= 1
            else:
                i += 1
