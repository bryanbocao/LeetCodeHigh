/**
https://leetcode.com/problems/partition-list/
86. Partition List  QuestionEditorial Solution  My Submissions
Total Accepted: 71455 Total Submissions: 236669 Difficulty: Medium
Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

For example,
Given 1->4->3->2->5->2 and x = 3,
return 1->2->2->4->3->5.
 */
package algorithms.num086_PartitionList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head != null && head.next != null) {
        	
        	ListNode pt = new ListNode(-1);
        	pt.next = head;
        	ListNode lNBfNextFirstBiggerLN = null;
        	boolean firstIsNotSmaller = (head.val >= x) ? true : false;
        	while (pt != null && pt.next != null) {
        		if (pt.next.val >= x) {
        			if (lNBfNextFirstBiggerLN == null) lNBfNextFirstBiggerLN = pt;
        		} else {
        			if (lNBfNextFirstBiggerLN != null) {
        				ListNode nextLN = pt.next.next;
        				pt.next.next = lNBfNextFirstBiggerLN.next;
        				lNBfNextFirstBiggerLN.next = pt.next;
        				lNBfNextFirstBiggerLN = pt.next;
        				if (firstIsNotSmaller) {
        				    head = pt.next;
        				    firstIsNotSmaller = false;
        			    }
        				pt.next = nextLN;
        				continue;
        			}
        		}
        		pt = pt.next;
        	}
        }
        return head;
    }
}
//20160718Mon18:19 duration:49m14s27 Accepted duration:7m11s06 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao