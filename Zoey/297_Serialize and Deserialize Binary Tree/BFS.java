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

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "";
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        sb.append(String.valueOf(root.val));
        sb.append(",");
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.left!=null){
                queue.offer(node.left);
                sb.append(String.valueOf(node.left.val));
                sb.append(",");
            }else{
                sb.append("null,");
            }

            if(node.right!=null){
                queue.offer(node.right);
                sb.append(String.valueOf(node.right.val));
                sb.append(",");
            }else{
                sb.append("null,");
            }
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data==null||data.length()==0) return null;
        String[] nodes = data.split(",");
        Deque<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.valueOf(nodes[0]));
        queue.offer(root);
        int index = 1;
        while(!queue.isEmpty()){
            Deque<TreeNode> level = new LinkedList<>();
            while(!queue.isEmpty()){
                TreeNode node = queue.poll();
                if(nodes[index].equals("null")) node.left = null;
                else{
                    node.left = new TreeNode(Integer.valueOf(nodes[index]));
                    level.offer(node.left);
                }
                index++;
                if(nodes[index].equals("null")) node.right = null;
                else{
                    node.right = new TreeNode(Integer.valueOf(nodes[index]));
                    level.offer(node.right);
                }
                index++;
            }
            queue = level;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));