/**
https://leetcode.com/problems/plus-one-linked-list/
Locked Question
 */
package algorithms.num369_PlusOneLinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode plusOne(ListNode head) {
        if (head == null) return new ListNode(1);
        ListNode resultLN = addOne(head);
        if (resultLN.val < 10) return resultLN;
        else {
        	ListNode ln = new ListNode(1);
        	resultLN.val -= 10;
        	ln.next = resultLN;
        	return ln;
        }
    }
    
    private static ListNode addOne(ListNode head) {
    	if (head.next == null) {
    		head.val += 1;
    		return head;
    	} else {
    		ListNode resultNext = addOne(head.next);
    		if (resultNext.val < 10) return head;
    		else {
    			resultNext.val -= 10;
    			head.val += 1;
    			return head;
    		}
    	}
    }
}
//20160808Mon22:44 CodingDuration:32m40s63 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 

