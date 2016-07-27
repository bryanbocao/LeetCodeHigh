/**
https://leetcode.com/problems/merge-two-sorted-lists/
21. Merge Two Sorted Lists  QuestionEditorial Solution  My Submissions
Total Accepted: 141865 Total Submissions: 390281 Difficulty: Easy
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.


 */
package algorithms.num021_MergeTwoSortedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        else if (l1 == null) return l2;
        else if (l2 == null) return l1;
        else {
        	ListNode preL1 = new ListNode(-1);
        	preL1.next = l1;
        	ListNode head = preL1;
        	while (l1 != null && l2 != null) {
        		if (l1.val < l2.val) l1 = l1.next;
        		else {
        			preL1.next = l2;
        			l2 = l2.next;
        			preL1.next.next = l1;
        		}
        		preL1 = preL1.next;
        	}
        	if (l1 == null && l2 != null) preL1.next = l2;
        	return head.next;
        }
    }
}
//20160726Tue23:19 duration:13m29s58 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 