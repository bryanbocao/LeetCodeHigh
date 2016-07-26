/**
https://leetcode.com/problems/rotate-list/
61. Rotate List  QuestionEditorial Solution  My Submissions
Total Accepted: 75353 Total Submissions: 323544 Difficulty: Medium
Given a list, rotate the list to the right by k places, where k is non-negative.

For example:
Given 1->2->3->4->5->NULL and k = 2,
return 4->5->1->2->3->NULL.


 */
package algorithms.num061_RotateList;

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
    public ListNode rotateRight(ListNode head, int k) {
        if (head != null && head.next != null && k > 0) {
        	ListNode ln = head, preNewHead = head;
        	int len = 0;
        	while (ln != null) {
        		len++;
        		if (ln.next == null) {
        			ln.next = head;
        			break;
        		}
        		ln = ln.next;
        	}
        	if (k >= len) k %= len;
        	int leftK = len - k;
        	for (int i = 0; i < leftK - 1; i++) preNewHead = preNewHead.next;
        	ListNode newHead = preNewHead.next;
        	preNewHead.next = null;
        	return newHead;
        }
        return head;
    }
}
//20160720Wed17:21 duration:20m24s45 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao