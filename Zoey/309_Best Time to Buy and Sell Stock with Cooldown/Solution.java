public class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length==0) return 0;
        int len = prices.length;
        int[] sell = new int[len+1];
        int[] buy = new int[len+1];
        int res=0;
        sell[0] = 0;
        buy[0] = -prices[0];
        for(int i=1;i<len;i++){
            int delta = prices[i]-prices[i-1];
            sell[i] = Math.max(buy[i-1]+prices[i], sell[i-1]+delta);
            if(i>1)
                buy[i] = Math.max(sell[i-2]-prices[i], buy[i-1]-delta);
            else
                buy[i] = buy[i-1]-delta;
            if(sell[i]>res) res=sell[i];
        }
        return res;
    }
}

//Nice explaination:
//http://bookshadow.com/weblog/2015/11/24/leetcode-best-time-to-buy-and-sell-stock-with-cooldown/