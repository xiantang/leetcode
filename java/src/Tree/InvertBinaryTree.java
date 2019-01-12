package Tree;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)return root;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
        return root;
    }
}
