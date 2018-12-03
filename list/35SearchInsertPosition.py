class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        # 二分查找
        def find(lo,hi):
            if lo == hi:return lo
            mid = (lo+hi)//2
            if nums[mid] == target :
                return mid
            elif nums[mid]< target:
                return find(mid+1,hi)
            else:
                return find(lo,mid)
        res = find(0,len(nums)-1)

        # 添加判断
        if nums[res] == target:
            return res
        else:
            if nums[res]>target:
                return res
            else:return res+1
if __name__ == '__main__':
    print(Solution().searchInsert([1,3],0))