package Tree;

public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){
            return null;
        }
        int mid = nums.length/2;
        TreeNode root = new TreeNode(nums[mid]);
        for(int i=0;i<mid;i++){
            root = buildTree(root,nums[i]);
        }
        for(int i=mid+1;i<nums.length;i++){
            root = buildTree(root,nums[i]);
        }
        return root;
    }

    public  TreeNode buildTree(TreeNode root,int num){
        if(root==null){
            return new TreeNode(num);
        }
        if(num>root.val)
            root.right = buildTree(root.right,num);
        if(num<root.val)

            root.left = buildTree(root.left,num);
        return root;
    }

    public static void main(String[] args) {
        new ConvertSortedArraytoBinarySearchTree().sortedArrayToBST(new int[] {
                0,1,2,3,4,5
        });
    }
}
