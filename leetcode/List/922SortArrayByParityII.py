class Solution(object):
    def sortArrayByParityII(self, A):
        """
        :type A: List[int]
        :rtype: List[int]
        """
        even = [i for i in range(0,len(A),2) if A[i]%2!=0]
        odd = [i for i in range(1,len(A),2) if A[i]%2== 0]
        for i,j in zip(even,odd):
            A[i],A[j]= A[j],A[i]
        return A