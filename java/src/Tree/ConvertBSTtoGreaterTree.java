package Tree;

public class ConvertBSTtoGreaterTree {
    private int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if(root!=null){
            root.right = convertBST(root.right);
            sum += root.val;
            root.val = sum;
            root.left = convertBST(root.left);
        }
        return root;
    }
}
