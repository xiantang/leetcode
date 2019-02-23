package Tree;

public class LongestUnivaluePath {
    int ans ;
    public int longestUnivaluePath(TreeNode root) {
        ans  = 0;
        arrowLength(root);
        return ans;
    }

    public int arrowLength(TreeNode root){
        if(root == null)
            return 0;
        int left = arrowLength(root.left);
        int right =  arrowLength(root.right);
        int al = 0;
        int ar = 0;
        if(root.left!=null && root.left.val == root.val){
            al = left+1;
        }
        if(root.right!=null && root.right.val == root.val){
            ar = right+1;
        }
        ans = Math.max(ans,al+ar);
        return Math.max(al,ar);
    }
}
