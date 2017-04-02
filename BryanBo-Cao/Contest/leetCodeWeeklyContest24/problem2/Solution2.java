package leetCodeWeeklyContest24.problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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

public class Solution2 {
    public TreeNode convertBST(TreeNode root) {
    	if (root == null || (root.left == null && root.right == null)) return root;
        List<Integer> ls = new ArrayList<Integer>();
        traverse(root, ls);
        Collections.sort(ls);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Iterator<Integer> it = ls.iterator();
        while (it.hasNext()) System.out.println(it.next());
        int size = ls.size();
        for (int i = size - 1; i >= 0; i--) {
        	int val = ls.get(i);
        	System.out.println(val);
        	if (i == size - 1) map.put(val, val);
        	else {
        		int preVal = ls.get(i + 1), preSum = map.get(preVal);
        		System.out.println("line 27: " + val + " " + preVal);
        		if (val < preVal) map.put(val, preSum + val);
        		else map.put(val, preSum);
        	}
        }
        assignVal(root, map);
        return root;
    }
    
    private void traverse(TreeNode root, List<Integer> ls) {
    	if (root != null) {
    		ls.add(root.val);
    		if (root.left != null) traverse(root.left, ls);
    		if (root.right != null) traverse(root.right, ls);
    	}
    }
    
    private void assignVal(TreeNode root, Map<Integer, Integer> map) {
    	if (root != null) {
    		root.val = map.get(root.val);
    		if (root.left != null) assignVal(root.left, map);
    		if (root.right != null) assignVal(root.right, map);
    	}
    }
}