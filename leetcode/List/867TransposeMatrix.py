class Solution(object):
    def transpose(self, A):
        """
        :type A: List[List[int]]
        :rtype: List[List[int]]
        """
        sub = []
        for i in range(len(A[0])):
            new = []
            for j in range(len(A)):
                new.append(A[j][i])
            sub.append(new)
        return sub

