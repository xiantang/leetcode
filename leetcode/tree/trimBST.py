class Solution(object):
    def trimBST(self, root, L, R):
        """
        :type root: TreeNode
        :type L: int
        :type R: int
        :rtype: TreeNode
        """
        if not root:
            return root
        if root.val<L:
            return self.trimBST(root.right,L,R)
        if root.val < R:
            return self.trimBST(root.left, L, R)
        root.left=self.trimBST(root.left,L,R)
        root.right=self.trimBST(root.right,L,R)
        return root