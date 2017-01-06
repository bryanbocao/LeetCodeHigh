package num298_BinaryTreeLongestConsecutiveSequence;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution_FromOther {
    public int longestConsecutive(TreeNode root) {
        return (root==null)?0:Math.max(dfs(root.left, 1, root.val), dfs(root.right, 1, root.val));
    }
    
    public int dfs(TreeNode root, int count, int val){
        if(root==null) return count;
        count = (root.val - val == 1)?count+1:1;
        int left = dfs(root.left, count, root.val);
        int right = dfs(root.right, count, root.val);
        return Math.max(Math.max(left, right), count);
    }
}
//https://leetcode.com/problems/binary-tree-longest-consecutive-sequence/
/*298. Binary Tree Longest Consecutive Sequence   Add to List QuestionEditorial Solution  My Submissions
Total Accepted: 21976
Total Submissions: 55154
Difficulty: Medium
Contributors: Admin
Given a binary tree, find the length of the longest consecutive sequence path.

The path refers to any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The longest consecutive path need to be from parent to child (cannot be the reverse).

For example,
   1
    \
     3
    / \
   2   4
        \
         5
Longest consecutive sequence path is 3-4-5, so return 3.
   2
    \
     3
    / 
   2    
  / 
 1
Longest consecutive sequence path is 2-3,not3-2-1, so return 2.
*/
//From https://discuss.leetcode.com/topic/29205/simple-recursive-dfs-without-global-variable
//From https://discuss.leetcode.com/user/nightowl