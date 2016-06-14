/**
 * 237. Delete Node in a Linked List My Submissions QuestionEditorial Solution
Total Accepted: 86643 Total Submissions: 196678 Difficulty: Easy
Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.


 */

package algorithms.num237_DeleteNodeInALinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void deleteNode(ListNode node) {
    	node.val = node.next.val;
        node.next = node.next.next;
    }
}
//20160614Tue11:05 duraition:9m02s90 @BryanBo-Cao