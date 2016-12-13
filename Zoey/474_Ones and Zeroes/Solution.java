public class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int len = strs.length;
        int[][] nums = new int[len][2];
        int ind = 0;
        for(String s:strs){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0') nums[ind][0]++;
                else nums[ind][1]++;
            }
            ind++;
        }
        int[][] dp = new int[m+1][n+1];
        for(int[] pair:nums){
            //System.out.println(pair[0]+":"+pair[1]);
            for(int i=m;i>=0;i--){
                for(int j=n;j>=0;j--){
                    if(i>=pair[0] && j>=pair[1]) dp[i][j] = Math.max(dp[i][j], dp[i-pair[0]][j-pair[1]]+1);
                }
            }
        }
        return dp[m][n];
    }
}