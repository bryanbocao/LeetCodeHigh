/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        //必须有两个
        ListNode pre=head, cur=head.next;
        while(cur!=null){
            //这里和array手法不太一样
            if(pre.val==cur.val){
                //又重复只移动CUR指针
                pre.next = cur.next;
                cur = cur.next;
            }else{
                //没有重复同时移动两个指针
                pre = cur;
                cur = cur.next;
            }
        }
        return head;
    }
}