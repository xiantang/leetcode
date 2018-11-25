class Solution(object):
    def flipAndInvertImage(self, A):
        """
        :type A: List[List[int]]
        :rtype: List[List[int]]
        """
        for row in A:
            row.reverse()
            for i in range(len(row)):
                if row[i] == 1:
                    row[i]= 0
                else:
                    row[i]=1
        return A