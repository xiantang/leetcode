/*
 * @lc app=leetcode id=662 lang=java
 *
 * [662] Maximum Width of Binary Tree
 *
 * https://leetcode.com/problems/maximum-width-of-binary-tree/description/
 *
 * algorithms
 * Medium (39.82%)
 * Total Accepted:    27.8K
 * Total Submissions: 69.8K
 * Testcase Example:  '[1,3,2,5,3,null,9]'
 *
 * Given a binary tree, write a function to get the maximum width of the given
 * tree. The width of a tree is the maximum width among all levels. The binary
 * tree has the same structure as a full binary tree, but some nodes are null.
 * 
 * The width of one level is defined as the length between the end-nodes (the
 * leftmost and right most non-null nodes in the level, where the null nodes
 * between the end-nodes are also counted into the length calculation.
 * 
 * Example 1:
 * 
 * 
 * Input: 
 * 
 * ⁠          1
 * ⁠        /   \
 * ⁠       3     2
 * ⁠      / \     \  
 * ⁠     5   3     9 
 * 
 * Output: 4
 * Explanation: The maximum width existing in the third level with the length 4
 * (5,3,null,9).
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: 
 * 
 * ⁠         1
 * ⁠        /  
 * ⁠       3    
 * ⁠      / \       
 * ⁠     5   3     
 * 
 * Output: 2
 * Explanation: The maximum width existing in the third level with the length 2
 * (5,3).
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: 
 * 
 * ⁠         1
 * ⁠        / \
 * ⁠       3   2 
 * ⁠      /        
 * ⁠     5      
 * 
 * Output: 2
 * Explanation: The maximum width existing in the second level with the length
 * 2 (3,2).
 * 
 * 
 * Example 4:
 * 
 * 
 * Input: 
 * 
 * ⁠         1
 * ⁠        / \
 * ⁠       3   2
 * ⁠      /     \  
 * ⁠     5       9 
 * ⁠    /         \
 * ⁠   6           7
 * Output: 8
 * Explanation:The maximum width existing in the fourth level with the length 8
 * (6,null,null,null,null,null,null,7).
 * 
 * 
 * 
 * 
 * Note: Answer will in the range of 32-bit signed integer.
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
    int ans;
    Map<Integer, Integer> left;
    public int widthOfBinaryTree(TreeNode root) {
        ans = 0;
        left = new HashMap<>();
        dfs(root,0,0);
        return ans;
    }
    
    public void dfs(TreeNode root,int depth,int pos){
        if(root == null){
            return;
        }
        left.computeIfAbsent(depth,x->pos);
        ans = Math.max(pos - left.get(depth) + 1,ans); 
        dfs(root.left,depth+1,pos*2);
        dfs(root.right,depth+1,pos*2+1);
    }
}

