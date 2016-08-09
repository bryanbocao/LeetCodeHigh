public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        helper(list, new ArrayList<Integer>(), 1, n, k);
        return list;
    }

    public void helper(List<List<Integer>> list, List<Integer> path, int start, int n, int k){
        if(k==0){
            list.add(new ArrayList<Integer>(path));
            return;
        }
        for(int i=start;i<=n;i++){
            path.add(i);
            helper(list,path,i+1,n,k-1);
            path.remove(path.size()-1);
        }
    }
}