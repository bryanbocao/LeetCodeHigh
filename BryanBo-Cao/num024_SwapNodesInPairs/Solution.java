/**
https://leetcode.com/problems/swap-nodes-in-pairs/
24. Swap Nodes in Pairs  QuestionEditorial Solution  My Submissions
Total Accepted: 109307 Total Submissions: 304149 Difficulty: Easy
Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 */
package algorithms.num024_SwapNodesInPairs;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head != null && head.next != null) {
        	ListNode pre = new ListNode(-1),
        			first = new ListNode(-1),
        			second = new ListNode(-1),
        			third = new ListNode(-1),
        			rhead = head.next;
        	pre.next = head;
        	do {
        		first = pre.next;
        		second = first.next;
        		third = second.next;
        		second.next = first;
        		first.next = third;
        		pre.next = second;
        		pre = first;
        		System.out.println(pre.val);
        	} while (pre != null && pre.next != null && pre.next.next != null);
        	return rhead;
        }
        return head;
    }
}
//20160721Thu16:24 duration:28m51s95 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 