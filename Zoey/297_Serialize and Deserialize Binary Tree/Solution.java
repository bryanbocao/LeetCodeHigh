/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    private String nan = "null";
    private String spliter = ",";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        helper(root,sb);
        return sb.toString();
    }

    public void helper(TreeNode node,StringBuilder sb){
        if(node==null) sb.append(nan).append(spliter);
        else{
            sb.append(node.val).append(spliter);
            helper(node.left,sb);
            helper(node.right,sb);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Deque<String> res = new LinkedList<String>();
        res.addAll(Arrays.asList(data.split(spliter)));
        return buildTree(res);
    }

    public TreeNode buildTree(Deque<String> nodes){
        String val = nodes.remove();
        if(val.equals("null")) return null;
        TreeNode node = new TreeNode(Integer.valueOf(val));
        node.left=buildTree(nodes);
        node.right=buildTree(nodes);
        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));