/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 *
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
 *
 * algorithms
 * Easy (45.82%)
 * Total Accepted:    526.2K
 * Total Submissions: 1.1M
 * Testcase Example:  '[1,2,4]\n[1,3,4]'
 *
 * Merge two sorted linked lists and return it as a new list. The new list
 * should be made by splicing together the nodes of the first two lists.
 * 
 * Example:
 * 
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while(l1!=null || l2!=null){
            if(l1==null){
                cur.next = l2;
                break;
            }
            if(l2==null){
                cur.next = l1;
                break;
            }
            if(l1.val > l2.val){
                cur.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            else if(l1.val < l2.val){
                cur.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            else{
                cur.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            cur = cur.next;
        
        }
        return dummy.next;
    }
}

