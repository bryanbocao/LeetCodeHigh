/**
https://leetcode.com/problems/remove-linked-list-elements/
203. Remove Linked List Elements  QuestionEditorial Solution  My Submissions
Total Accepted: 74303 Total Submissions: 249982 Difficulty: Easy
Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5

Credits:
Special thanks to @mithmatt for adding this problem and creating all test cases.
 */
package algorithms.num203_RemoveLinkedListElements;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode myHead = new ListNode(-1);
        myHead.next = head; head = myHead;
        while (myHead.next != null) {
        	if (myHead.next.val == val) myHead.next = myHead.next.next;
        	else myHead = myHead.next;
        }
        return head.next;
    }
}
//20160807Sun14:41 duration:9m47s25 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
