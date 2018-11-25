class Solution(object):
    def isMonotonic(self, A):
        """
        :type A: List[int]
        :rtype: bool
        """
        # 单调递增
        def increasing(A):
            for i in range(len(A) - 1):
                if A[i] <= A[i + 1]:
                    pass
                else:
                    return False
            return True

        # 单调递减
        def decreasing(A):
            for i in range(len(A) - 1):
                if A[i] >= A[i + 1]:
                    pass
                else:
                    return False
            return True
        # 是其中一个就返回true
        return increasing(A) or decreasing(A)
