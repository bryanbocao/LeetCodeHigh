/**
https://leetcode.com/problems/linked-list-random-node/
382. Linked List Random Node  QuestionEditorial Solution  My Submissions
Total Accepted: 1284
Total Submissions: 2613
Difficulty: Medium
Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.

Follow up:
What if the linked list is extremely large and its length is unknown to you? Could you solve this efficiently without using extra space?

Example:

// Init a singly linked list [1,2,3].
ListNode head = new ListNode(1);
head.next = new ListNode(2);
head.next.next = new ListNode(3);
Solution solution = new Solution(head);

// getRandom() should return either 1, 2, or 3 randomly. Each element should have equal probability of returning.
solution.getRandom();
 */
package algorithms.num382_LinkedListRandomNode;

import java.util.Random;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {

    /** @param head The linked list's head. Note that the head is guanranteed to be not null, so it contains at least one node. */
    ListNode head = null;
	Random random = null;
	public Solution(ListNode head) {
        this.head = head;
        this.random = new Random();
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        ListNode keptLN = null, currentLN = head;
        for (int i = 1; currentLN != null; i++) {
        	if (this.random.nextInt(i) == 0) keptLN = currentLN;
        	currentLN = currentLN.next;
        }
        return keptLN.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
//20160810Wed23:04 CodingDuration:50m24s95 Accpeted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
