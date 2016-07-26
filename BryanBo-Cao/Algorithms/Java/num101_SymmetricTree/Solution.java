/**
https://leetcode.com/problems/symmetric-tree/
101. Symmetric Tree  QuestionEditorial Solution  My Submissions
Total Accepted: 116803 Total Submissions: 336318 Difficulty: Easy
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3
 */
package algorithms.num101_SymmetricTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
    public boolean isSymmetric(TreeNode root) {
    	if (root == null) return true;
    	else {
        	if (root.left == null || root.right == null) {
        		if (root.left != null && root.right == null) return false;
        		if (root.left == null && root.right != null) return false;
        		return true;
        	} else {
        		List<Integer> lls = getLeftList(root.left),
            			rls = getRightList(root.right);
        		if (lls.equals(rls)) return true;
        		else return false;
        	}
        }
    }
    
    private List<Integer> getLeftList(TreeNode tn) {
    	List<Integer> lls = new ArrayList<Integer>();
    	lls.add(tn.val);
    	if (tn.left == null) lls.add(0);
    	else lls.addAll(getLeftList(tn.left));
    	if (tn.right == null) lls.add(0);
    	else lls.addAll(getLeftList(tn.right));
    	return lls;
    }
    
    private List<Integer> getRightList(TreeNode tn) {
    	List<Integer> rls = new ArrayList<Integer>();
    	rls.add(tn.val);
    	if (tn.right == null) rls.add(0);
    	else rls.addAll(getRightList(tn.right));
    	if (tn.left == null) rls.add(0);
    	else rls.addAll(getRightList(tn.left));
    	return rls;
    }
}
//20160714Thu16:43 duration:25m50s19 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao