/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author dingwen
 */
public class ListNode {
      public int val;
      public ListNode next;
      public ListNode(int x) { val = x; }
      
      
      public static ListNode listNodeGenerator(int[] arr) {
          ListNode head = new ListNode(arr[0]);
          ListNode ln = head;
          for(int i=1;i<arr.length;i++) {
              ln.next = new ListNode(arr[i]);
              ln = ln.next;
          }
          return head;
      }
      
      public static void iterate(ListNode ln) {
          while(ln!=null) {
              System.out.println(ln.val);
              ln=ln.next;
          }
      }
}
