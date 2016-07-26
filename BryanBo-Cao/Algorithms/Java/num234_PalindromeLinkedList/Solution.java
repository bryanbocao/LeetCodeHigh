/**
https://leetcode.com/problems/palindrome-linked-list/
234. Palindrome Linked List My Submissions QuestionEditorial Solution
Total Accepted: 54049 Total Submissions: 185908 Difficulty: Easy
Given a singly linked list, determine if it is a palindrome.

Follow up:
Could you do it in O(n) time and O(1) space?
 */
package algorithms.num234_PalindromeLinkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
    	if (head == null) return true;
    	else {
            List<Integer> ls = new ArrayList<Integer>();
            ListNode h = head;
            while (h != null) {
            	ls.add(h.val);
            	h = h.next;
            }
            int i = ls.size() - 1;
            while (head != null) {
            	if (head.val != ls.get(i--)) return false;
            	head = head.next;
            }
            return true;
    	}
    }
}
//20160629Wed16:51 duration:6m23s83 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao