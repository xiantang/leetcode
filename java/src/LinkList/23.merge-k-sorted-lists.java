/*
 * @lc app=leetcode id=23 lang=java
 *
 * [23] Merge k Sorted Lists
 *
 * https://leetcode.com/problems/merge-k-sorted-lists/description/
 *
 * algorithms
 * Hard (33.09%)
 * Total Accepted:    359.4K
 * Total Submissions: 1.1M
 * Testcase Example:  '[[1,4,5],[1,3,4],[2,6]]'
 *
 * Merge k sorted linked lists and return it as one sorted list. Analyze and
 * describe its complexity.
 * 
 * Example:
 * 
 * 
 * Input:
 * [
 * 1->4->5,
 * 1->3->4,
 * 2->6
 * ]
 * Output: 1->1->2->3->4->4->5->6
 * 
 * 
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int nullCount = 0;
        if(lists.length == 1){
            return lists[0];
        }
        while(nullCount < lists.length-1){
            ListNode minNode = null;
            nullCount = 0;
            int index = 0;
            for(int i =0;i<lists.length;i++ ){
                if(lists[i] == null){
                    nullCount+=1;
                    continue;
                }
                if(minNode == null){
                   minNode = lists[i];
                   index = i;
                }
                if(lists[i].val <= minNode.val){
                    minNode = lists[i];
                    index = i;
                }
            }
            if(minNode == null){
                break;
            }
            ListNode node = new ListNode(minNode.val);
            
            lists[index] = minNode.next;
            cur.next = minNode;
            cur = cur.next;
        }
        return dummy.next;
        
        
    }
}

