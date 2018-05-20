class Solution:
    def myAtoi(self, str):
        """
        :type str: str
        :rtype: int
        """
        if len(str)==0:
            return 0
        new=''

        for i in range(len(str)):
            if str[i]!=' ':
                new=new+str[i]
        if new=='':
            return 0
        if new.isdigit():
            return self.check(int(new))

        if new.startswith('+'):
            digit=''
            for i in range(len(new)-1):
                if new[i].isdigit():
                   digit+=new[i]
            return self.check(digit)
        if new.startswith('-'):
            digi=''
            for i in range(len(new)-1):
                if new[i].isdigit():
                    digi+=new[i]
            if digi=='':
                return 0
            return self.check(-int(digi))

        elif new[0].isdigit()==False:
            return 0

        else:
            digi = ''
            for i in range(len(new)-1):
                if new[i].isdigit() and new[i+1].isdigit():
                    digi+=new[i]
                elif new[i].isdigit() and (new[i+1].isdigit()==False):
                    digi+=new[i]
                    return self.check(int(digi))
    def check(self,digi):
        if digi=="":
            return 0
        if digi>pow(2,31)-1 :
            return pow(2,31)-1
        elif  digi<-pow(2,31):
            return -pow(2,31)
        else:
            return digi
print(Solution().myAtoi("     +004500"))