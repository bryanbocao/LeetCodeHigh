/**
https://leetcode.com/problems/linked-list-cycle/
141. Linked List Cycle  QuestionEditorial Solution  My Submissions
Total Accepted: 117717 Total Submissions: 322956 Difficulty: Easy
Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?


 */
package algorithms.num141_LinkedListCycle;

import java.util.Set;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
    	if (head == null || head.next == null) return false;
    	else {
    		Set<ListNode> set = new HashSet<ListNode>();
            while (head != null) {
            	if (set.contains(head)) return true;
            	else set.add(head);
            	head = head.next;
            }
            return false;
    	}
        
    }
}
//20160718Tue14:14 duration:2m27s65 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao