/**
 * 226. Invert Binary Tree My Submissions QuestionEditorial Solution
Total Accepted: 96103 Total Submissions: 208080 Difficulty: Easy
Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9
to
     4
   /   \
  7     2
 / \   / \
9   6 3   1
Trivia:
This problem was inspired by this original tweet by Max Howell:
Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t invert a binary tree on a whiteboard so fuck off.
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
package algorithms.num226_InvertBinaryTree;
public class Solution {
    public TreeNode invertTree(TreeNode root) {
    	if (root == null) return null;
    	else if (root.left != null || root.right != null) {
    		if (root.left != null) invertTree(root.left);
            if (root.right != null) invertTree(root.right);
            TreeNode tn = root.left;
            root.left = root.right;
            root.right = tn;
    	}
    	return root;
    }
}
//20160608Wed13:27 duration:18m @BryanBo-Cao