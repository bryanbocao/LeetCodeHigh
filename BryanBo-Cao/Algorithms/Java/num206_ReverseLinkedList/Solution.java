/**
https://leetcode.com/problems/reverse-linked-list/
206. Reverse Linked List  QuestionEditorial Solution  My Submissions
Total Accepted: 132947
Total Submissions: 322537
Difficulty: Easy
Reverse a singly linked list.

click to show more hints.

Hint:
A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
package algorithms.num206_ReverseLinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head != null && head.next != null) {
        	ListNode reverseLN = reverseList(head.next), returnLN = reverseLN;
        	while (reverseLN.next != null) reverseLN = reverseLN.next;
        	reverseLN.next = head;
        	head.next = null;
        	return returnLN;
        }
        return head;
    }
}

//SolvedOn20160815Mon22:34 CodingDuration:33m51s44 Accpeted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
