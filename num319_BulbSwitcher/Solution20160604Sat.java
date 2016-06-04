/*
319. Bulb Switcher My Submissions QuestionEditorial Solution
Total Accepted: 20301 Total Submissions: 49512 Difficulty: Medium
There are n bulbs that are initially off. You first turn on all the bulbs. Then, you turn off every second bulb. On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on). For the ith round, you toggle every i bulb. For the nth round, you only toggle the last bulb. Find how many bulbs are on after n rounds.

Example:

Given n = 3. 

At first, the three bulbs are [off, off, off].
After first round, the three bulbs are [on, on, on].
After second round, the three bulbs are [on, off, on].
After third round, the three bulbs are [on, off, off]. 

So you should return 1, because there is only one bulb is on.

 */
package algorithms.num319_BulbSwitcher;

public class Solution20160604Sat {
    public int bulbSwitch(int n) {
        switch(n) {
            case 0: return 0;
            case 1: return 1;
            default:
                int[] bulbs = new int[n];
                for (int i = 1; i <= n; i++) {
                	for (int j = i - 1; j < n; j += i) {
                		bulbs[j] = (bulbs[j] == 1) ? 0 : 1;
                	}
                }
                int cnt = 0;
                for (int i : bulbs) {
                	if (bulbs[i] == 0) cnt++;
                }
                return cnt;
        }
    }
}
//20160604Sat12:20 23m42s15 @BryanBo-Cao