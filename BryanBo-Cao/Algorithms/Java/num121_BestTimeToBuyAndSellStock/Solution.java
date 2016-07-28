/**
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
121. Best Time to Buy and Sell Stock  QuestionEditorial Solution  My Submissions
Total Accepted: 116722 Total Submissions: 316269 Difficulty: Easy
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Example 1:
Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
Example 2:
Input: [7, 6, 4, 3, 1]
Output: 0

In this case, no transaction is done, i.e. max profit = 0.

 */
package algorithms.num121_BestTimeToBuyAndSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
    	int maxDiff = 0;
        if (prices.length > 1) {
        	int minI = -1, maxI = -1, pre = prices[0];
        	boolean getMin = false, getMax = false;
        	for (int i = 1; i < prices.length; i++) {
        		if (pre < prices[i]) {
        			if (!getMin || !getMax) {
        				minI = i - 1;
        				getMin = true;
        				maxI = i;
        				getMax = true;
        			} else if (prices[maxI] < prices[i]) maxI = i;
        		} else if (pre > prices[i]) {
        			if (getMin && prices[i] < prices[minI]) {
        				System.out.println("minI: " + minI + " maxI: " + maxI);
        				int diff = prices[maxI] - prices[minI];
        				if (diff > maxDiff && maxI > minI) maxDiff = diff;
        				System.out.println("maxDiff: " + maxDiff);
        				minI = i;
        				getMax = false;
        			}
        		}
        		pre = prices[i];
        	}
        	if (maxI > -1) {
        		int diff = prices[maxI] - prices[minI];
            	if (diff > maxDiff && maxI > minI) maxDiff = diff;
        	}
        	System.out.println("minI: " + minI + " maxI: " + maxI);
        }
        return maxDiff;
    }
}
//20160727Wed23:00 duration:9m33s88
//20160728Thu15:22 duration:32m35s03 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
/**
Input:
[2,4,1]
Output:
3
Expected:
2

Input:
[4,7,2,1]
Output:
5
Expected:
3
*/