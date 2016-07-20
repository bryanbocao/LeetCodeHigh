public class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int[] dp = new int[nums.length];
        int[] parent = new int[nums.length];
        List<Integer> res = new ArrayList<Integer>();
        int mx=0,mx_ind=0;
        for(int i=nums.length-1;i>=0;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[j]%nums[i]==0 && dp[i]<dp[j]+1){
                    dp[i] = dp[j]+1;
                    parent[i]=j;
                }
                if(mx<dp[i]){
                    mx=dp[i];
                    mx_ind = i;
                }
            }
        }

        for(int i=0;i<nums.length;i++){
            res.add(nums[mx_ind]);
            mx_ind = parent[mx_ind];
        }
        return res;
    }
}