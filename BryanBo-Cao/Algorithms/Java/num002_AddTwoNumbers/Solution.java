/**
https://leetcode.com/problems/add-two-numbers/
2. Add Two Numbers  QuestionEditorial Solution  My Submissions
Total Accepted: 162292 Total Submissions: 669387 Difficulty: Medium
You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 */
package algorithms.num002_AddTwoNumbers;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 if (l1 == null) return l2;
		 if (l2 == null) return l1;
		 ListNode myHead = new ListNode(-1),
		    prel1 = new ListNode(-1);
		 myHead = l1;
		 prel1.next = l1;
		 int carry = 0;
		 while (l1 != null && l2 != null) {
			 l1.val += l2.val + carry;
			 if (l1.val > 9) {
			     carry = 1;
			     l1.val -= 10;
			 } else carry = 0;
			 l1 = l1.next;
			 l2 = l2.next;
			 prel1 = prel1.next;
		 }
		 if (l1 == null && l2 == null)  {
		     if (carry == 1) {
		         ListNode newln = new ListNode(1);
			     prel1.next = newln;
		     }
		     return myHead;
		 }
		 if (l2 == null) {
			 while (carry > 0) {
				 l1.val += carry;
				 if (l1.val > 9) {
			         carry = 1;
			         l1.val -= 10;
			     } else carry = 0;
				 if (l1.next == null && carry == 1) {
				     ListNode ln1 = new ListNode(0);
				     l1.next = ln1;
				 }
				 l1 = l1.next;
			 }
		 } else if (l1 == null) {
			 prel1.next = l2;
			 while (carry > 0) {
				 l2.val += carry;
				 if (l2.val > 9) {
			         carry = 1;
			         l2.val -= 10;
			     } else carry = 0;
				 if (l2.next == null && carry == 1) {
				     ListNode ln2 = new ListNode(0);
				     l2.next = ln2;
				 }
				 l2 = l2.next;
			 }
		 }
		 return myHead;
	 }
	
}
//20160729Fri14:52 duration:28m38s96 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 

/**
Runtime Error Message:
Line 32: java.lang.NullPointerException
Last executed input:
[9,9]
[9]

Input:
[5]
[5]
Output:
[0]
Expected:
[0,1]
*/