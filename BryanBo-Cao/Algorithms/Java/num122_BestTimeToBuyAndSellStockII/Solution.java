/**
https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
122. Best Time to Buy and Sell Stock II  QuestionEditorial Solution  My Submissions
Total Accepted: 96855 Total Submissions: 222752 Difficulty: Medium
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 */
package algorithms.num122_BestTimeToBuyAndSellStockII;

public class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len < 2) return 0;
        else {
        	int minI = -1, preI = 0, p = 0, sumP = 0;
        	for (int i = 1; i < len; i++) {
        		if (prices[preI] <= prices[i]) {
        			if (minI == -1) minI = preI;
        			if (i == len - 1) sumP += (prices[i] - prices[minI]);
        		} else if (minI != -1) {
        			sumP += (prices[preI] - prices[minI]);
        			minI = -1;
        		}
        		preI = i;
        	}
        	return sumP;
        }
    }
}
//20160730Sat18:26 duration:26m38s84 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
