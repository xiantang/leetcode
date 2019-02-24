package Tree;

import java.util.Arrays;

public class ConstructBinaryTreefromPreorderandPostorderTraversal {
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        if (pre.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        if(pre.length == 1){
            return root;
        }
        int indexPost = 0;
        for(int i=0;i<post.length;i++){
            if (post[i] == pre[1]){
                indexPost = i+1;
            }
        }

        root.left = constructFromPrePost(Arrays.copyOfRange(pre,1,indexPost+1),Arrays.copyOfRange(post,0,indexPost));
        root.right = constructFromPrePost(Arrays.copyOfRange(pre,1+indexPost,pre.length),Arrays.copyOfRange(post,indexPost,pre.length));
        return root;

    }


}
