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

public class Solution {
    public int bulbSwitch(int n) {return (int) Math.sqrt(n);}
}
//SolvedOn20160821SunAt13:54 CodingDuration:12m26s04 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 

/**
n	return
0	0
1	1
2	1
3	1
4	2
5	2
6	2
7	2
8	2
9	3
10	3
11	3
12	3
13	3
14	3
15	3
16	4
*/