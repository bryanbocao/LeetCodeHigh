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

import java.util.ArrayList;
import java.util.Iterator;
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
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        else {
        	ListNode thisNode = head;
        	List<Integer> ols = new ArrayList<Integer>(),
    				els = new ArrayList<Integer>();
        	boolean oddindex = true;
        	while (thisNode != null) {
        		if (oddindex) {
        			ols.add(thisNode.val);
        			thisNode = thisNode.next;
        			oddindex = false;
        		} else {
        			els.add(thisNode.val);
        			thisNode = thisNode.next;
        			oddindex = true;
        		}
        	}
        	Iterator<Integer> oit = ols.iterator(),
        			eit = els.iterator();
        	thisNode = head;
        	if (oit.hasNext()) oit.next();
        	while (oit.hasNext()) {
        		thisNode.next = new ListNode(oit.next());
        		thisNode = thisNode.next;
        	}
        	while (eit.hasNext()) {
        		thisNode.next = new ListNode(eit.next());
        		thisNode = thisNode.next;
        	}
        	return head;
        }
    }
}
//20160621Tue16:13 duration:1h18m07s11 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao
