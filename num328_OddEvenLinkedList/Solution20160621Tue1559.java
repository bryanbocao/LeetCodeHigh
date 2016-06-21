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
public class Solution20160621Tue1559 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        else {
        	if (head.next != null) {
            	ListNode thisNode = head, odd = head, even = head.next, firstNext = head.next;
            	boolean oddindex = true;
            	while (thisNode.next != null && thisNode.next.next != null) {
            		System.out.println("line 35:  even.val " + even.val);
            		System.out.println("line 36:  odd.val " + odd.val);
            		if (oddindex) {
            			thisNode = odd.next;
            			System.out.println("line 38:  thisNode.val " + thisNode.val);
            			odd.next = odd.next.next;
            			odd = odd.next;
            			oddindex = false;
            		} else {
            			thisNode = even.next;
            			System.out.println("line 45:  thisNode.val " + thisNode.val);
            			even.next = even.next.next;
            			even = even.next;
            			oddindex = true;
            		}
            		System.out.println();
            	}
            	
            	System.out.println("line 50: odd.val " + odd.val);
            	odd.next = firstNext;
            	System.out.println("line 50: odd.next.val " + odd.next.val);
            	System.out.println("line 50: head.val " + head.val);
            	System.out.println("line 50: head.next.val " + head.next.val);
            	
        	}
        	return head;
        }
    }
}
//20160621Tue15:52 duration:1h04m50s30 
