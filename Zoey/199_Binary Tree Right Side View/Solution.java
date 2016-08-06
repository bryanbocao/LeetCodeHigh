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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList();
        if(root==null) return res;

        queue.offer(root);
        while(queue.size()!=0){
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode cur = queue.poll();
                if(i==0) res.add(cur.val);
                if(cur.right!=null) queue.offer(cur.right);
                if(cur.left!=null) queue.offer(cur.left);
            }
        }
        return res;
    }
}