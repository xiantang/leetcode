class Solution:
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        print(self.sort('dasdafqwwer'))
    def sort(self,string:str): #冒泡太慢
        string_list =[]
        for i in string:
            string_list.append(i)
        for x in range(len(string_list)-1):
            for i in range(len(string_list)-x-1):
                if string_list[i]>string_list[i+1]:
                    string_list[i],string_list[i+1]=string_list[i+1],string_list[i]
        return ''.join(string_list)


print(Solution().isAnagram('rat','car'))