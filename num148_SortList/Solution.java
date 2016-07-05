/**
https://leetcode.com/problems/sort-list/
148. Sort List  QuestionEditorial Solution  My Submissions
Total Accepted: 75185
Total Submissions: 294784
Difficulty: Medium
Sort a linked list in O(n log n) time using constant space complexity.
 */
package algorithms.num148_SortList;

import java.util.ArrayList;
import java.util.Collections;
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
    public ListNode sortList(ListNode head) {
        if (head == null) return null;
        else if (head.next == null) return head;
        else {
        	List<Integer> ls = new ArrayList<Integer>();
        	while (head != null) {
        		ls.add(head.val);
        		head = head.next;
        	}
        	Collections.sort(ls);
        	Iterator<Integer> it = ls.iterator();
        	ListNode headNode = new ListNode(it.next());
    		head = headNode;
        	while (it.hasNext()) {
        		ListNode nextNode = new ListNode(it.next());
        		headNode.next = nextNode;
        		headNode = nextNode;
        	}
        	return head;
        }
    }
}
//20160705Tue12:19 duration:14m48s16 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao