package Tree;

public class BinaryTreePruning {
    public TreeNode pruneTree(TreeNode root) {
        if(root == null){
            return null;
        }
        if(root.val==0&&isPruneTree(root)){
            return null;
        }

        root.left= pruneTree(root.left);
        root.right = pruneTree(root.right);
        return root;
    }
    public boolean isPruneTree(TreeNode root){
        if(root==null){
            return true;
        }
        boolean left = isPruneTree(root.left);
        boolean right = isPruneTree(root.right);
        if(root.val == 1){
            return false;
        }
        else{
            return left&&right;
        }
    }
}
