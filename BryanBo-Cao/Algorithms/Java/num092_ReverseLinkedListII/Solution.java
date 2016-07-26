/**
https://leetcode.com/problems/reverse-linked-list-ii/
92. Reverse Linked List II  QuestionEditorial Solution  My Submissions
Total Accepted: 76830
Total Submissions: 269264
Difficulty: Medium
Reverse a linked list from position m to n. Do it in-place and in one-pass.

For example:
Given 1->2->3->4->5->NULL, m = 2 and n = 4,

return 1->4->3->2->5->NULL.

Note:
Given m, n satisfy the following condition:
1 ≤ m ≤ n ≤ length of list.
 */
package algorithms.num092_ReverseLinkedListII;

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
    public ListNode reverseBetween(ListNode head, int m, int n) {
    	if (head == null) return null;
    	else if (m == n) return head;
    	else {
        	ListNode myHead = new ListNode(-1),
        		reverseHead = new ListNode(-1),
        		rln = new ListNode(-1);
        	myHead.next = head;
        	reverseHead.next = head;
        	Stack<ListNode> stk = new Stack<ListNode>();
        	for (int i = 0; i < n && rln != null; i++) {
        		if (i < m - 1) reverseHead = reverseHead.next;
        		else {
        			if (i == m - 1) rln = reverseHead.next;
            		stk.push(rln);
            		rln = rln.next;
        		}
        	}
        	if (!stk.isEmpty() && m == 1) myHead.next = stk.peek();
        	while (!stk.isEmpty()) {
        		reverseHead.next = stk.pop();
        		reverseHead = reverseHead.next;
        	}
        	reverseHead.next = rln;
        	return myHead.next;
        }
    }
}
//20160711Mon20:21 duration:46m44s50 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao