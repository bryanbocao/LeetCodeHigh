/**
https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
82. Remove Duplicates from Sorted List II  QuestionEditorial Solution  My Submissions
Total Accepted: 77552
Total Submissions: 282951
Difficulty: Medium
Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

For example,
Given 1->2->3->3->4->4->5, return 1->2->5.
Given 1->1->1->2->3, return 2->3.
 */
package algorithms.num082_RemoveDuplicatesFromSortedListII;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
    	if (head == null) return null;
    	else {
            ListNode ln = new ListNode(-1);
            ln.next = head;
            ListNode tln = ln;
        	while (tln.next != null && tln.next.next != null) {
        		if (tln.next.val == tln.next.next.val) {
        			int sv = tln.next.val;
        			ListNode sln = tln.next;
        			while (sln != null && sln.val == sv) {
        				sln = sln.next;
        			}
        			tln.next = sln;
        		} else tln = tln.next;
        	}
        	return ln.next;
        }
    }
}
//20160711Mon10:49 duration:32m46s43 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao
