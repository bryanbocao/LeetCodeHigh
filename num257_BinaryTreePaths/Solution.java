/**
https://leetcode.com/problems/binary-tree-paths/
257. Binary Tree Paths My Submissions QuestionEditorial Solution
Total Accepted: 53534 Total Submissions: 179812 Difficulty: Easy
Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]
 */
package algorithms.num257_BinaryTreePaths;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.tree.TreeNode;

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
    public List<String> binaryTreePaths(TreeNode root) {
    	List<String> ls = new ArrayList<String>();
        if (root == null) return ls;
        else {
        	if (root.left == null && root.right == null) ls.add(String.valueOf(root.val));
        	if (root.left != null) {
        		List<String> lsl = binaryTreePaths(root.left);
        		Iterator<String> it = lsl.iterator();
        		while (it.hasNext()) ls.add(new String(root.val + "->" + it.next()));
        	}
        	if (root.right != null) {
        		List<String> lsr = binaryTreePaths(root.right);
        		Iterator<String> it = lsr.iterator();
        		while (it.hasNext()) ls.add(new String(root.val + "->" + it.next()));
        	}
        	return ls;
        }
    }
}
//20160629Wed16:35 duration:24m36s21 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao