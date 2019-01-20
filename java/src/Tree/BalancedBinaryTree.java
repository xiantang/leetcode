package Tree;

public class BalancedBinaryTree {
    private boolean isBalance;

    public boolean isBalanced(TreeNode root) {
        isBalance = true;
        get(root, 0);
        return isBalance;
    }

    public int get(TreeNode root, int height) {
        if (root == null) {
            return height;
        }
        height += 1;
        int leftH = get(root.left, height);
        int rightH = get(root.right, height);
        if (Math.abs(leftH - rightH) > 1) {
            isBalance = false;
        }
        return Math.max(leftH, rightH);
    }

}