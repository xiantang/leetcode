class Solution:
    def validMountainArray(self, A):
        """
        :type A: List[int]
        :rtype: bool
        """
        if not A or len(A)==1:
            return False
        flag = 0
        isUp = False
        isDown = False
        for i in range(len(A)-1):
            if A[i+1] > A[i] and flag == 0:
                isUp = True
            elif A[i+1] < A[i] and flag == 1:
                isDown = True
                isUP = False
            elif A[i+1] < A[i] and flag == 0 and isUp== True:
                isDown = True
                flag = 1
            else:
                return False
        if(isDown is False):
            return False
        return True