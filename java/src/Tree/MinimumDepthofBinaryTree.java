package Tree;

public class MinimumDepthofBinaryTree {

    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }

        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(left == 0 || right == 0){
            return left+right+1;
        }
        else
            return Math.min(left,right)+1;
    }

}
