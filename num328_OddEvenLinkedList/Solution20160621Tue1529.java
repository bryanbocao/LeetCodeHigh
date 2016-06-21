/**
https://leetcode.com/problems/odd-even-linked-list/
328. Odd Even Linked List My Submissions QuestionEditorial Solution
Total Accepted: 34747 Total Submissions: 88894 Difficulty: Medium
Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.

You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.

Example:
Given 1->2->3->4->5->NULL,
return 1->3->5->2->4->NULL.

Note:
The relative order inside both the even and odd groups should remain as it was in the input. 
The first node is considered odd, the second node even and so on ...
 */
package algorithms.num328_OddEvenLinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution20160621Tue1529 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        else {
        	if (head.next != null) {
            	ListNode thisNode = head, firstNext = head.next;
            	System.out.println("Line 33, firstNext: " + firstNext.val);
            	while (thisNode.next != null && thisNode.next.next != null) {
            		thisNode.next = thisNode.next.next;
            		thisNode = thisNode.next;
            		System.out.println("line 36: " + thisNode.val);
            	}
            	System.out.println("line 39: thisNode.val " + thisNode.val);
            	
            	thisNode.next = firstNext;
            	
            	System.out.println("Line 41, thisnode: " + thisNode.val);
            	while (thisNode.next != null && thisNode.next.next != null) {
            		thisNode.next = thisNode.next.next;
            		thisNode = thisNode.next;
//            		System.out.println("line 42" + thisNode.val);
            	}
        	}
        	return head;
        }
    }
}
