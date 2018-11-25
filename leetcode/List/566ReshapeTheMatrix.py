class Solution(object):
    def matrixReshape(self, nums, r, c):
        """
        :type nums: List[List[int]]
        :type r: int
        :type c: int
        :rtype: List[List[int]]
        """
        new_list = []
        # 将所有的读到一个列表中
        for num in nums:
            new_list += num
        out = []
        # 计算c的长度
        len_sub = len(new_list) / r
        # 如果不能就返回原来
        if len_sub != c:
            return nums

        for i in range(0, len(new_list), int(len_sub)):
            out.append(new_list[i:i + len_sub])

        return out