class Solution(object):
    def isToeplitzMatrix(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: bool
        """
        # 获得宽度
        width = len(matrix)
        # 获得高度
        heigh = len(matrix[0])

        for i in range(width - 1):
            for j in range(heigh - 1):
                # 判断当前和下一个是否相同
                if matrix[i][j] != matrix[i + 1][j + 1]:
                    return False
        else:
            return True
