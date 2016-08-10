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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(root!=null){
            res.add(root.val);
            if(root.right!=null) stack.push(root.right);
            root=root.left;
            if(root==null && !stack.isEmpty()) root=stack.pop();
        }
        return res;
    }
}