/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {

    public List<Integer> list = new ArrayList<>();

    /** @param head The linked list's head. Note that the head is guanranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
    }

    /** Returns a random node's value. */
    public int getRandom() {
        int index = (int) (list.size()*Math.random());
        return list.get(index);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */