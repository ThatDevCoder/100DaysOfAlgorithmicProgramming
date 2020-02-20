/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
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
        ListNode dummy = new ListNode(-1);
        ListNode curr =dummy;
        
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        
        int carry = 0;
        while(curr1!=null || curr2!= null || carry != 0){
            int num1 = (curr1 == null) ? 0 : curr1.val;
            int num2 = (curr2 == null) ? 0 : curr2.val;
            
            int sum = num1 + num2 +carry;
            int newnum = sum %10;
            carry = sum/10;
            
            curr.next = new ListNode(newnum);
            curr = curr.next;
            
            curr1 = (curr1==null) ? null : curr1.next;
            curr2 = (curr2==null) ? null : curr2.next;   
        }
        return dummy.next;
    }
}

