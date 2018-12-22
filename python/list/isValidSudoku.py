class Solution:
    def isValidSudoku(self, board):
        """
        :type board: list[list[str]]
        :rtype: bool
        """
        if self.checkFirst(board) and self.checkSecond(board) and self.checkThird(board):
            return True
        else:return False
    def checkFirst(self,board):

        for i in board:
            one_to_nine = []
            for j in i:
                if j not in one_to_nine and j!='.':
                    one_to_nine.append(j)
                elif(j=='.'):
                    pass
                else:
                    return False
        return True

    def checkSecond(self,board):
        for j in range(9):
            new_list = []
            one_to_nine = []
            for i in range(len(board)):

                new_list.append(board[i][j])

            for k in new_list:
                if k not in one_to_nine and k!='.':
                    one_to_nine.append(k)
                elif(k=='.'):
                    continue
                else:
                    # print(new_list)
                    return False

        return True

    def checkThird(self,board):
        for i in range(0,9,3):
            for j in range(0,9,3):
                lis1=[]
                newlist=[]
                for k in range(j,j+3):
                    lis1.append(board[i][k])
                    lis1.append(board[i+1][k])
                    lis1.append(board[i + 2][k])
                for k in lis1:
                    if k not in newlist and k != '.':
                        newlist.append(k)
                    elif (k == '.'):
                        continue
                    else:
                        # print(new_list)
                        return False
        return True
