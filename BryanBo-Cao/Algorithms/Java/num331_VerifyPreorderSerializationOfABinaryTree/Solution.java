/**
https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree/
331. Verify Preorder Serialization of a Binary Tree My Submissions QuestionEditorial Solution
Total Accepted: 14807 Total Submissions: 45786 Difficulty: Medium
One way to serialize a binary tree is to use pre-order traversal. When we encounter a non-null node, we record the node's value. If it is a null node, we record using a sentinel value such as #.

     _9_
    /   \
   3     2
  / \   / \
 4   1  #  6
/ \ / \   / \
# # # #   # #
For example, the above binary tree can be serialized to the string "9,3,4,#,#,1,#,#,2,#,6,#,#", where # represents a null node.

Given a string of comma separated values, verify whether it is a correct preorder traversal serialization of a binary tree. Find an algorithm without reconstructing the tree.

Each comma separated value in the string must be either an integer or a character '#' representing null pointer.

You may assume that the input format is always valid, for example it could never contain two consecutive commas such as "1,,3".

Example 1:
"9,3,4,#,#,1,#,#,2,#,6,#,#"
Return true

Example 2:
"1,#"
Return false

Example 3:
"9,#,#,1"
Return false
 */
package algorithms.num331_VerifyPreorderSerializationOfABinaryTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {
    public boolean isValidSerialization(String preorder) {
    	if (preorder.length() <= 1) return true;
    	else {
    		String[] ss = preorder.split(",");
            List<String> ls = new ArrayList<String>();
            for (int i = 0; i < ss.length; i++) ls.add(ss[i]);
            boolean changed = true;
            while (changed) {
            	changed = false;
            	Iterator<String> it = ls.iterator();
            	int index = 0;
            	String crr;
            	if (it.hasNext()) crr = it.next();
            	else return true;
            	while (it.hasNext()) {
            			if (!crr.equals("#") && it.hasNext()) {
                			String next = it.next();
                			if (next.equals("#")) {
                				if (it.hasNext()) {
                    				String nextnext = it.next();
                    				if (nextnext.equals("#")) {
                    					ls.remove(index + 2);
                    					ls.remove(index);
                    					changed = true;
                    				} else {
                    					crr = nextnext;
                    					index += 2;
                    				}
                				}
                			} else {
                				crr = next;
                				index++;
                			}
            			}
            			if (changed) break;
            	}
            }
            if (ls.size() == 1) {
                Iterator<String> it2 = ls.iterator();
                while (it2.hasNext()) {
                	if(it2.next().equals("#")) return true;
                }
                return false;
            } else return false;
    	}
    }
}
//20160621Tue14:45 duration:1h23m10s25 TimeLimitExceeded @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao