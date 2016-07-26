/**
https://leetcode.com/problems/remove-nth-node-from-end-of-list/
19. Remove Nth Node From End of List  QuestionEditorial Solution  My Submissions
Total Accepted: 120667 Total Submissions: 396233 Difficulty: Easy
Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.
 */
package algorithms.num019_RemoveNthNodeFromEndOfList;

import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head != null) {
        	if (head.next == null) {
        		if (n == 1) return null;
        		else return head;
        	} else {
        		ListNode ls = new ListNode(-1);
        		ls.next = head;
        		int cnt = 0;
        		while (ls != null) {
        			ls = ls.next;
        			cnt++;
        		}
        		if (cnt - 1 == n) head = head.next;
        		else {
            		ListNode pre = new ListNode(-1);
            		pre.next = head;
            		for (int i = 0; i < cnt - n - 1; i++) pre = pre.next;
            		pre.next = pre.next.next;
        		}
        	}
        }
        return head;
    }
}
//20160725Mon18:17 duration:20m41s47 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
/**
Input:
[1,2]
2
Output:
[1,2]
Expected:
[2]
*/