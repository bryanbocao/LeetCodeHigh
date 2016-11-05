/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Iterative {
    public List<Integer> postorderTraversal(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        List<Integer> ls = new ArrayList<>();
        while(root!=null || !stack.isEmpty()){
            if(root!=null){
                stack.push(root);
                ls.add(root.val);
                root=root.right;
            }else{
                root=stack.pop().left;
            }
        }
        Collections.reverse(ls);
        return ls;
    }
}