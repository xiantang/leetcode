class Solution(object):
    def twoSum(self, numbers, target):
        """
        :type numbers: List[int]
        :type target: int
        :rtype: List[int]
        """
        # 使用双指针
        l, r = 0, len(numbers) - 1
        # 分别从两边开始
        while (l < r):
            if numbers[l] + numbers[r] == target:
                return [l + 1, r + 1]
            else:
                # 如果两边的比他大
                if numbers[l] + numbers[r] > target:
                    r -= 1
                else:
                    l += 1

