/*
 * @lc app=leetcode id=117 lang=java
 *
 * [117] Populating Next Right Pointers in Each Node II
 */
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Solution {
    public Node connect(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        if (root==null){
            return root;
        }
        while(queue.size()!=0){
            int size = queue.size();
            Node pre = null;
            for(int i = 0;i<size;i++){
                if(i==0){
                    pre = queue.poll();
                    if(pre.left!=null){
                        queue.offer(pre.left);
                    }
                    if(pre.right!=null){
                        queue.offer(pre.right);
                    }
                }
                else{
                    Node node = queue.poll();
                    pre.next = node;
                    pre = node;
                    if(pre.left!=null){
                        queue.offer(pre.left);
                    }
                    if(pre.right!=null){
                        queue.offer(pre.right);
                    }
                }
                
                
            }
        }
        return root;
    }
}

