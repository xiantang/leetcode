class Solution:
    def longestCommonPrefix(self, strs):
        """
        :type strs: list[str]
        :rtype: str
        """
        min=''
        if len(strs)==1:
            return strs[0]
        for i in range(len(strs)):
            if len(strs[i])==1:
                min=strs[i]
            if len(strs[i-1])>=len(strs[i]):
                min=strs[i]

        str_list=[]
        for i in range(len(min)):
            str_slip=min[:i+1]
            count=0
            for j in range(len(strs)):
                if strs[j].startswith(str_slip) :
                    count+=1
            if count==len(strs):
                str_list.append(str_slip)
        max=""
        for i in range(len(str_list)):
            if len(str_list)==1:
                return str_list[0]
            if len(str_list[i-1])<len(str_list[i]):
                max=str_list[i]
        if max!="":
            return max


        else:
            return ""
print(Solution().longestCommonPrefix(["flower","flow","flight"]))