package num173_BinarySearchTreeIterator;

import java.util.Stack;

public class BSTIterator {
    private Stack<TreeNode> stack = new Stack<TreeNode>();
    
    public BSTIterator(TreeNode root) {
        pushAll(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode tmpNode = stack.pop();
        pushAll(tmpNode.right);
        return tmpNode.val;
    }
    
    private void pushAll(TreeNode node) {
        for (; node != null; stack.push(node), node = node.left);
    }
}
//https://leetcode.com/problems/binary-search-tree-iterator/
/*
173. Binary Search Tree Iterator   Add to List QuestionEditorial Solution  My Submissions
Total Accepted: 73775
Total Submissions: 189538
Difficulty: Medium
Contributors: Admin
Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.

Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.

Credits:
Special thanks to @ts for adding this problem and creating all test cases.
 */
//From https://discuss.leetcode.com/topic/6575/my-solutions-in-3-languages-with-stack
//From https://discuss.leetcode.com/user/xcv58