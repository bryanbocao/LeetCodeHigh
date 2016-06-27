package algorithms.num235_LowestCommonAncestorOfABinarySearchTree;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution20160627Mon1315 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    	if (root == null) return null;
        if (root.val == p.val || root.val == q.val) return root;
        if (root.left != null) {
        	if (root.left.val == p.val || root.left.val == q.val) return root;
        	else root.left = lowestCommonAncestor(root.left, p, q);
        }
        if (root.right != null) {
        	if (root.right.val == p.val || root.right.val == p.val) return root;
        	else root.right = lowestCommonAncestor(root.right, p, q);
        }
        return null;
    }
}
//20160627Mon13:14 duration:18m13s18 WrongAnswer @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao