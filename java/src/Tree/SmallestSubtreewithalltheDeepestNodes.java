package Tree;

public class SmallestSubtreewithalltheDeepestNodes {
    private int maxDepth =-1;
    private TreeNode res;
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        res = null;
        getNode(root,0);
        return res;
    }
    private int getNode(TreeNode root,int depth){
        if(root == null){
            return depth;
        }
        int l = getNode(root.left,depth+1);
        int r = getNode(root.right,depth+1);
        if(l==r&&l>=maxDepth){
            maxDepth = l;
            res = root;
        }
        return Math.max(l,r);


    }
}
