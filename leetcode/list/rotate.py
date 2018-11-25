class Solution:
    def rotate(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: void Do not return anything, modify matrix in-place instead.
        """
        for i in range(len(matrix)):


            for j in range(i+1,len(matrix)):
                k=matrix[j][i]
                matrix[j][i]=matrix[i][j]
                matrix[i][j]=k
        for i in range(len(matrix)): #每行反转
            matrix[i].reverse()
        print(matrix)

Solution().rotate([
  [15,13, 2, 5],
  [14, 3, 4, 1],
  [12, 6, 8, 9],
  [16, 7,10,11]
])