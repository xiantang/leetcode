package Tree;

import javax.swing.tree.TreeNode;

public class UnivaluedBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

        public boolean isUnivalTree(TreeNode root) {
            int value = root.val;
            return isSame(root, value);

        }

        public boolean isSame(TreeNode root, int value) {
            if (root == null) {
                return true;
            }
            if (root.val != value)
                return false;
            boolean left = isSame(root.left, value);
            boolean right = isSame(root.right, value);
            if (left == false || right == false) {
                return false;
            } else {
                return true;
            }
        }

    }
