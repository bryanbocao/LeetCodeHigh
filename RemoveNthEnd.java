/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *19. Remove Nth Node From End of List
 * @author dingwen
 */
public class RemoveNthEnd {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        ListNode head = ListNode.listNodeGenerator(arr);
        RemoveNthEnd rnd = new RemoveNthEnd();
        rnd.removeNthFromEnd(head, 4);
    }
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        
        //ListNode p2 = new ListNode(0);
        ListNode p2 = head;
        ListNode p1 = head;
        
        for(int i=0;i<n && p1!=null;i++) {
            p1=p1.next;
        }
            
        while(p1!=null && p1.next!=null) {
            p1=p1.next;
            p2=p2.next;
        }
        
        if(p1!=null) {
            p2.next = p2.next.next;
        } else if(p2==head) {
            head = head.next;
        }
       return head;
    }
}
