package algorithms.num230_KthSmallestElementInABST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Solution20160627Mon1342 {
    public int kthSmallest(TreeNode root, int k) {
    	if (root == null) return 0;
        List<Integer> ls = getLs(root);
        Collections.sort(ls);
        Iterator<Integer> it = ls.iterator();
        while (it.hasNext() && k-- > 0) it.next();
        return it.next();
    }
    private static List getLs(TreeNode root) {
    	List<Integer> ls = new ArrayList<Integer>();
    	ls.add(root.val);
    }
}

