/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Iterative{
    public int kthSmallest(TreeNode root, int k){
        Stack<TreeNode> stack = new Stack<TreeNode>();

        while(root!=null){
            stack.push(root);
            root=root.left;
        }

        while(k!=0){
            TreeNode node = stack.pop();
            k--;
            if(k==0) return node.val;
            TreeNode right = node.right;
            while(right!=null){
                stack.push(right);
                right=right.left;
            }
        }
        return -1;
    }
}