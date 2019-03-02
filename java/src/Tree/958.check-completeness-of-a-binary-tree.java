/*
 * @lc app=leetcode id=958 lang=java
 *
 * [958] Check Completeness of a Binary Tree
 *
 * https://leetcode.com/problems/check-completeness-of-a-binary-tree/description/
 *
 * algorithms
 * Medium (46.08%)
 * Total Accepted:    8.8K
 * Total Submissions: 19.1K
 * Testcase Example:  '[1,2,3,4,5,6]'
 *
 * Given a binary tree, determine if it is a complete binary tree.
 * 
 * Definition of a complete binary tree from Wikipedia:
 * In a complete binary tree every level, except possibly the last, is
 * completely filled, and all nodes in the last level are as far left as
 * possible. It can have between 1 and 2h nodes inclusive at the last level
 * h.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * 
 * 
 * Input: [1,2,3,4,5,6]
 * Output: true
 * Explanation: Every level before the last is full (ie. levels with
 * node-values {1} and {2, 3}), and all nodes in the last level ({4, 5, 6}) are
 * as far left as possible.
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * 
 * 
 * Input: [1,2,3,4,5,null,7]
 * Output: false
 * Explanation: The node with value 7 isn't as far left as possible.
 * 
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * The tree will have between 1 and 100 nodes.
 * 
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
    public boolean isCompleteTree(TreeNode root) {
        class CNode{
        TreeNode node;
        int code;
        CNode(TreeNode node, int code) {
            this.node = node;
            this.code = code;
        }
        
    }
    
    public boolean isCompleteTree(TreeNode root) {
       
        List<CNode> list = new ArrayList<>();
        list.add(new CNode(root,1));
        int i = 0;
        while(i<list.size()){
            CNode cnode = list.get(i++);
            if(cnode.node !=null){
                // 左边子节点永远是2n,右边是2n+1
                list.add(new CNode(cnode.node.left,cnode.code*2));
                 list.add(new CNode(cnode.node.right,cnode.code*2+1));
            }
        }
        return list.get(i-1).code == list.size();
    }
    }
}

