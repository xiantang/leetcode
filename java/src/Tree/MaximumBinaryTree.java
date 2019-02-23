package Tree;

public class MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode root = genTree(nums,0,nums.length);
        return root;
    }

    public TreeNode genTree(int[] nums,int lo,int hi){
        if (lo == hi){
            return null;
        }
        int index = findMax(nums,lo,hi);
        // int[] smaller = new int[index];
        // int[] bigger = new int[nums.length-1-index];
        // for(int i=0;i<3;i++){
        //     smaller = nums[i];
        // }
        // for(int i=index+1;i<nums.length;i++){
        //     bigger = nums[i];
        // }
        TreeNode root = new TreeNode(nums[index]);

        root.left = genTree(nums,lo,index);
        root.right = genTree(nums,index+1,hi);
        return root;
    }

    public int findMax(int[] nums,int lo,int hi){
        int max_i = lo;
        for (int i = lo; i < hi; i++) {
            if (nums[max_i] < nums[i])
                max_i = i;
        }
        return max_i;
    }   
    public static void main(String[] args) {
       int[] a =  new int[]{3,2,1,6,0,5};
        new MaximumBinaryTree().constructMaximumBinaryTree(a);
    }
}
