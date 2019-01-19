package Tree;

public class LowestCommonAncestorofaBinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        int parval = root.val;
        int pval = p.val;
        int qval =q.val;
        if(pval>root.val&&qval>root.val)
            return lowestCommonAncestor(root.right,p,q);
        else if(pval<root.val&&qval<root.val)
            return lowestCommonAncestor(root.left,p,q);
        else
            return root;
    }
}