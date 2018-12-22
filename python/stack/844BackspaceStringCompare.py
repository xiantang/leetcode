import collections

class Solution(object):
    def backspaceCompare(self, S, T):
        """
        :type S: str
        :type T: str
        :rtype: bool
        """
        s_str = self.get_char(S)
        t_str = self.get_char(T)

        return s_str == t_str


    def get_char(self,str_list):
        i = len(str_list) - 1
        stack = []
        backpace = 0
        while i>=0:
            if str_list[i] == "#":
                backpace +=1
            elif str_list[i] != "#":
                if backpace == 0 :
                    stack.append(str_list[i])
                else:
                    backpace-=1
            i-=1
        return stack



if __name__ == '__main__':
    S = "bxj##tw"
    T = "bxo#j##tw"
    print(Solution().backspaceCompare(S,T))