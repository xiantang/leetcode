class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution(object):
    def splitListToParts(self, root, k):
        """
        :type root: ListNode
        :type k: int
        :rtype: list[ListNode]
        """
        if not root:
            return [None] * k
        len_list = 0
        # get length of linklist
        cur = root
        while root:
            len_list += 1
            root = root.next
        # we need to calculate every sub linklist length
        # and use mod to get remain length
        aver, tail = len_list // k, len_list % k
        parts = []
        if len_list <= k: # there is single node in every element of list and remain fill with `null`
            for i in range(k):
                if cur:
                    temp = cur.next
                    cur.next = None
                    parts.append(cur)
                    cur = temp

                else:
                    parts.append(None)
            return parts
        for i in range(k):
            point = cur
            for _ in range(aver - 1):
                cur = cur.next
            if tail > 0: # let every before node length +1
                tail -= 1
                cur = cur.next
            temp = cur.next
            cur.next = None
            cur = temp
            parts.append(point)
        return parts


if __name__ == '__main__':
    a = ListNode(1)
    b = ListNode(2)
    c = ListNode(3)
    d = ListNode(4)
    e = ListNode(5)
    a.next = b
    b.next = c
    c.next = d
    d.next = e
    A = Solution().splitListToParts(a, 3)
    print(1)
