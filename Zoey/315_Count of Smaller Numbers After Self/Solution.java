public class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if(nums==null||nums.length==0) return res;
        int len = nums.length;
        int[] dis = new int[len];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        //find the min
        for(int i=0;i<len;i++)
            min = Math.min(nums[i],min);
        //find max distance and initialize dis[]
        for(int i=0;i<len;i++){
            dis[i] = nums[i]-min+1; //avoid 0 element
            max = Math.max(max, dis[i]);
        }
        int[] tree = new int[max+1]; //不明白!!
        for(int i=len-1;i>=0;i--){
            res.add(0,get(tree,dis[i]-1));
            update(tree,dis[i]);
        }
        return res;
    }

    //这其实是求sum for loop都要倒着来
    public int get(int[] tree, int ind){
        int res = 0;
        for(int i=ind;i>0;i-=i&(-i)){
            res+=tree[i];
        }
        return res;
    }

    public void update(int[] tree, int ind){
        for(int i=ind;i<tree.length;i+=i&(-i)){
            tree[i]++;
        }
    }
}