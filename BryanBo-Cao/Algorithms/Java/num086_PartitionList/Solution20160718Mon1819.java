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
public class Solution20160718Mon1819 {
    public ListNode partition(ListNode head, int x) {
        if (head != null && head.next != null) {
        	
        	ListNode pt = new ListNode(-1);
        	pt.next = head;
        	ListNode lNBfNextFirstBiggerLN = null;
        	boolean firstIsNotSmaller = (head.val >= x) ? true : false;
        	while (pt != null && pt.next != null) {
        		System.out.println();
        		System.out.println("pt.val: " + pt.val);
        		if (lNBfNextFirstBiggerLN != null) System.out.println("lNBfNextFirstBiggerLN: " + lNBfNextFirstBiggerLN.val);
        		if (pt.next.val >= x) {
        			if (lNBfNextFirstBiggerLN == null) lNBfNextFirstBiggerLN = pt;
        		} else {
        			if (lNBfNextFirstBiggerLN != null) {
        				System.out.println("line 27 before operation:");
        				
        				ListNode myLN = head;
                		while (myLN != null) {
                			System.out.print(myLN.val + " ");
                			myLN = myLN.next;
                		}
                		System.out.println();
        				
        				ListNode nextLN = pt.next.next;
        				pt.next.next = lNBfNextFirstBiggerLN.next;
        				lNBfNextFirstBiggerLN.next = pt.next;
        				lNBfNextFirstBiggerLN = pt.next;
        				if (firstIsNotSmaller) head = pt.next;
        				pt.next = nextLN;
        				
        				System.out.println("line 43 after operation:");
        				
        				ListNode myLN2 = head;
                		while (myLN2 != null) {
                			System.out.print(myLN2.val + " ");
                			myLN2 = myLN2.next;
                		}
                		System.out.println();
        				
        				continue;
        			}
        		}
        		pt = pt.next;
        		
        		ListNode myLN = head;
        		while (myLN != null) {
        			System.out.print(myLN.val + " ");
        			myLN = myLN.next;
        		}
        		System.out.println();
        	}
        }
        return head;
    }
}
//20160718Mon18:19 duration:49m14s27 Accepted duration:7m11s06 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao