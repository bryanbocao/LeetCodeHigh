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
        if(head==null) return true;
        ListNode slow=head,fast=head;
        Stack<Integer> stack = new Stack<>();
        stack.push(head.val);
        boolean odd=false;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            stack.push(slow.val);
            fast=fast.next.next;
            if(fast.next==null) odd=true;
        }
        if(odd) stack.pop();
        while(slow.next!=null){
            slow=slow.next;
            if(stack.pop()!=slow.val) return false;
        }
        return true;
    }
}