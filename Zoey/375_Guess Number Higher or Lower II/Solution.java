/*
Very nice solution from
https://www.hrwhisper.me/leetcode-guess-number-higher-lower-ii/
 */


public class Solution{
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n+1][n+1];
        for(int[] row:dp) Arrays.fill(row,Integer.MAX_VALUE);
        return helper(dp,1,n);
    }

    public int helper(int[][] dp,int start,int end){
        if(start>=end) return 0;
        if(dp[start][end]!=Integer.MAX_VALUE) return dp[start][end];
        //dp[start][end]=Integer.MAX_VALUE;
        for(int i=start;i<=end;i++){
            dp[start][end] = Math.min(dp[start][end],i+Math.max(helper(dp,start,i-1),helper(dp,i+1,end)));
        }
        return dp[start][end];
    }
}