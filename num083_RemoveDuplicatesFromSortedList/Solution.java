/**
https://leetcode.com/problems/remove-duplicates-from-sorted-list/
83. Remove Duplicates from Sorted List  QuestionEditorial Solution  My Submissions
Total Accepted: 126070 Total Submissions: 337505 Difficulty: Easy
Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
 */
package algorithms.num083_RemoveDuplicatesFromSortedList;

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
    	ListNode ln = head;
    	while (ln != null) {
    		if (ln.val == ln.next.val) ln.next = ln.next.next;
    		ln = ln.next;
    	}
    	return head;
    }
}
//20160711Mon10:13 duration:16m02s86 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao
