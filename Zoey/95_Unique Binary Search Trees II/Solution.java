public class Solution{
    public List<TreeNode> generateTrees(int n){
        if(n<=0) return new ArrayList<TreeNode>();
        return helper(1,n);
    }

    public List<TreeNode> helper(int start, int end){
        List<TreeNode> list = new ArrayList<TreeNode>();

        if(start>end) list.add(null);

        List<TreeNode> left,right;
        for(int i=start;i<=end;i++){
            left=helper(start,i-1);
            right=helper(i+1,end);
            for(TreeNode lnode:left){
                for(TreeNode rnode:right){
                    TreeNode root = new TreeNode(i);
                    root.left=lnode;
                    root.right=rnode;
                    list.add(root);
                }
            }
        }
        return list;
    }
}