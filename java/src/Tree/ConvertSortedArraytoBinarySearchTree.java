package Tree;

public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {

        TreeNode root = null;

        root = buildTree(null,nums,0,nums.length);

        return root;
    }


    public  TreeNode buildTree(TreeNode root,int[] nums,int low,int hi){
        if(low >=hi ){
            return null;
        }
        int midIndex = (low + hi)/2;
        int  mid= nums[midIndex];
        if(root == null){
            root = new TreeNode(mid);
        }
        // root.val = mid;
        root.left = buildTree(root.left,nums,low,midIndex);
        root.right = buildTree(root.right,nums,midIndex+1,hi);
        return root;
    }

    public static void main(String[] args) {
        new ConvertSortedArraytoBinarySearchTree().sortedArrayToBST(new int[] {-10,-3,0,5,9
        });
    }
}
