/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//non recursive solution
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        Stack<TreeNode> stack = new Stack<>();
        if(root.left!=null){
            if(root.right==null) return false;
            stack.push(root.left);
            stack.push(root.right);
        }else if(root.right!=null) return false;
        while(!stack.isEmpty()){
            TreeNode right = stack.pop();
            TreeNode left = stack.pop();
            if(right.val!=left.val) return false;
            if(left.left!=null){
                if(right.right==null) return false;
                stack.push(left.left);
                stack.push(right.right);
            }else if(right.right!=null) return false;

            if(left.right!=null){
                if(right.left==null) return false;
                stack.push(left.right);
                stack.push(right.left);
            }else if(right.left!=null) return false;
        }
        return true;
    }
}

//dfs recursive solution
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return (root==null || dfs(root.left,root.right));
    }

    public boolean dfs(TreeNode left, TreeNode right){
        if(left==null || right==null) return left==right;
        if(left.val!=right.val) return false;
        else return dfs(left.left,right.right) && dfs(left.right,right.left);
    }
}