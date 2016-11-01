/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> closestKValues(TreeNode root, double target, int k) {
        List<Integer> res = new ArrayList<>();
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        inorder(root,target,s1,false);
        inorder(root,target,s2,true);
        while(k>0){
            if(s1.isEmpty()) res.add(s2.pop());
            else if(s2.isEmpty()) res.add(s1.pop());
            else if(Math.abs(s1.peek()-target)<Math.abs(s2.peek()-target)) res.add(s1.pop());
            else res.add(s2.pop());
            k--;
        }
        return res;
    }

    public void inorder(TreeNode root, double target, Stack<Integer> stack, boolean reverse){
        if(root==null) return;
        if(!reverse) inorder(root.left,target,stack,reverse);
        else inorder(root.right,target,stack,reverse);
        if((!reverse && root.val>target)||(reverse && root.val<=target)) return;
        stack.push(root.val);
        if(!reverse) inorder(root.right,target,stack,reverse);
        else inorder(root.left,target,stack,reverse);
    }
}