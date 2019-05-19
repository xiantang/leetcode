/*
 * @lc app=leetcode id=199 lang=java
 *
 * [199] Binary Tree Right Side View
 *
 * https://leetcode.com/problems/binary-tree-right-side-view/description/
 *
 * algorithms
 * Medium (46.57%)
 * Total Accepted:    151.1K
 * Total Submissions: 324.4K
 * Testcase Example:  '[1,2,3,null,5,null,4]'
 *
 * Given a binary tree, imagine yourself standing on the right side of it,
 * return the values of the nodes you can see ordered from top to bottom.
 * 
 * Example:
 * 
 * 
 * Input: [1,2,3,null,5,null,4]
 * Output: [1, 3, 4]
 * Explanation:
 * 
 * ⁠  1            <---
 * ⁠/   \
 * 2     3         <---
 * ⁠\     \
 * ⁠ 5     4       <---
 * 
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    //***************************
    Map<Integer, Integer> rightmostValueAtDepth = new HashMap<Integer, Integer>();
    int max_depth = -1;
    public List<Integer> rightSideView(TreeNode root) {
        Stack<TreeNode> nodeStack = new Stack<TreeNode>();
        Stack<Integer> depthStack = new Stack<Integer>();
        nodeStack.push(root);
        depthStack.push(0);
        while(!nodeStack.isEmpty()){
            
            TreeNode node = nodeStack.pop();
            int depth = depthStack.pop();
            if(node != null){
                max_depth = Math.max(max_depth, depth);
                if(!rightmostValueAtDepth.containsKey(depth)){
                    rightmostValueAtDepth.put(depth,node.val);
                }
                nodeStack.push(node.left);
                nodeStack.push(node.right);
                depthStack.push(depth+1);
                depthStack.push(depth+1);
            }  
        }
        List<Integer> rightView = new ArrayList<Integer>();
        for(int i =0;i<=max_depth;i++){
            rightView.add(rightmostValueAtDepth.get(i));
        }
        return rightView;
    }
    //**************************************** */


    
    // use queue
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return res;
        queue.offer(root);
        while(queue.size()!=0){
            List<Integer> list = new ArrayList<>();
             
           int size= queue.size();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
                list.add(node.val);
            }
           
            if(list.size()>0){
                res.add(list.get(list.size()-1));
            }
           
        }
        return res;
    }
}

