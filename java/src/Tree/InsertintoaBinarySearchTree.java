package Tree;

public class InsertintoaBinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return insertInto(root,val);
    }
    public TreeNode insertInto(TreeNode root, int val) {
        if(root==null){
            return new TreeNode(val);
        }

        if (root.val<val){
            root.right = insertInto(root.right,val);
        }
        else{
            root.left = insertInto(root.left,val);
        }
        return root;
    }
}
