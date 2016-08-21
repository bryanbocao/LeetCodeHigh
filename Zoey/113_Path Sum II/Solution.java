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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        helper(res,new ArrayList<Integer>(),root,sum);
        return res;
    }

    public void helper(List<List<Integer>> list,List<Integer> path,TreeNode node, int sum){
        if(node==null) return;
        path.add(node.val);
        if(node.left==null && node.right==null && sum==node.val){
            list.add(new ArrayList<Integer>(path));
            path.remove(path.size()-1);
            return;
        }else{
            helper(list,path,node.left,sum-node.val);
            helper(list,path,node.right,sum-node.val);
        }
        path.remove(path.size()-1);
    }
}