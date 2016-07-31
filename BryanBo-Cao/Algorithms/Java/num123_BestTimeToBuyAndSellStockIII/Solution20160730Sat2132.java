/**
https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
123. Best Time to Buy and Sell Stock III  QuestionEditorial Solution  My Submissions
Total Accepted: 62717 Total Submissions: 231424 Difficulty: Hard
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete at most two transactions.

Note:
You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 */
package algorithms.num123_BestTimeToBuyAndSellStockIII;

public class Solution20160730Sat2132 {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len < 1) return 0;
        else {
        	int minI = -1, preI = 0, p0 = 0, p1 = 0;
        	for (int i = 1; i < len; i++) {
        		if (prices[preI] <= prices[i]) {
        			if (minI == -1) minI = preI;
        			if (i == len - 1) {
        				int p = prices[i] - prices[minI];
            			if (p > p0) p0 = p;
        			}
        		} else if (minI != -1) {
        			int p = prices[preI] - prices[minI];
        			if (p > p0) p0 = p;
        			if (p0 > p1) {
        				int t = p0;
        				p0 = p1;
        				p1 = t;
        			}
        			minI = -1;
        		}
        		preI = i;
        	}
        	return p0 + p1;
        }
    }
}
//20160730Sat21:32 duration:17m43s08 WrongAnswer @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
