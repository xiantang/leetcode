/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 *
 * https://leetcode.com/problems/add-two-numbers/description/
 *
 * algorithms
 * Medium (30.58%)
 * Total Accepted:    789.7K
 * Total Submissions: 2.6M
 * Testcase Example:  '[2,4,3]\n[5,6,4]'
 *
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order and each of their nodes
 * contain a single digit. Add the two numbers and return it as a linked list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * Example:
 * 
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dumpHead = new ListNode(0);
        ListNode curr = dumpHead;
        int carry = 0;
        while(l1!=null||l2!=null){
            int x;
            int y;
            if(l1!=null)
                x = l1.val;
            else x = 0;
            if(l2!=null)
                y = l2.val;
            else y= 0;
            int sum = x+y+carry;
            carry = (sum)/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
  
        }
        if(carry == 1){
            curr.next = new ListNode(carry);
        }
        
        return dumpHead.next;
    }
}

