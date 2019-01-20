package Tree;

public class SubtreeofAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null){
            return false;
        }
        if(equals(s,t)){
            return true;
        }
        boolean left = isSubtree(s.left,t);
        boolean right = isSubtree(s.right,t);
        System.out.println(left);
        return left||right;
    }
    public boolean equals(TreeNode x,TreeNode y)
    {
        if(x==null && y==null)
            return true;
        if(x==null || y==null)
            return false;
        return x.val==y.val && equals(x.left,y.left) && equals(x.right,y.right);
    }
}
