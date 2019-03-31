/*
 * @lc app=leetcode id=138 lang=java
 *
 * [138] Copy List with Random Pointer
 *
 * https://leetcode.com/problems/copy-list-with-random-pointer/description/
 *
 * algorithms
 * Medium (25.84%)
 * Total Accepted:    231.6K
 * Total Submissions: 883.4K
 * Testcase Example:  '{"$id":"1","next":{"$id":"2","next":null,"random":{"$ref":"2"},"val":2},"random":{"$ref":"2"},"val":1}'
 *
 * A linked list is given such that each node contains an additional random
 * pointer which could point to any node in the list or null.
 * 
 * Return a deep copy of the list.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * 
 * 
 * Input:
 * 
 * {"$id":"1","next":{"$id":"2","next":null,"random":{"$ref":"2"},"val":2},"random":{"$ref":"2"},"val":1}
 * 
 * Explanation:
 * Node 1's value is 1, both of its next and random pointer points to Node 2.
 * Node 2's value is 2, its next pointer points to null and its random pointer
 * points to itself.
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * You must return the copy of the given head as a reference to the cloned
 * list.
 * 
 */
/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/
class Solution {
    Map<Node,Node> nodeCache = new HashMap<Node, Node>();
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        Node copyNode = new Node(head.val,head.next,head.random);
        nodeCache.put(head,copyNode);
        if(head.next!=null){
            copyRandomList(head.next);
            copyNode.next = nodeCache.get(copyNode.next);
            copyNode.random = nodeCache.get(copyNode.random);
        }else{
            copyNode.random = nodeCache.get(copyNode.random);
        }
        return copyNode;
    }
}

