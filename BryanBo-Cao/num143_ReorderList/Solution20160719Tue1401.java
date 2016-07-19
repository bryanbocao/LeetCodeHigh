/**
https://leetcode.com/problems/reorder-list/
143. Reorder List  QuestionEditorial Solution  My Submissions
Total Accepted: 69378 Total Submissions: 296406 Difficulty: Medium
Given a singly linked list L: L0→L1→…→Ln-1→Ln,
reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

You must do this in-place without altering the nodes' values.

For example,
Given {1,2,3,4}, reorder it to {1,4,2,3}.
 */

package algorithms.num143_ReorderList;

import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution20160719Tue1401 {
    public void reorderList(ListNode head) {
        if (head != null && head.next != null && head.next.next != null) {
        	ListNode next = head.next, last = null, beforeLast = null;
        	while (head != null && next != null && next.next != null) {
        		beforeLast = head;
        		while (beforeLast.next.next != null) beforeLast = beforeLast.next;
        		last = beforeLast.next;
        		beforeLast.next = null;
        		head.next = last;
        		last.next = next;
        		head = next;
        		next = next.next;
        	}
        }
    }
}
//20160719Tue14:01 duration:22m10s79 TimeLimitExceeded @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao