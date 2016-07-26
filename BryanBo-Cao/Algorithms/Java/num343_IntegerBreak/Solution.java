/**
https://leetcode.com/problems/integer-break/
343. Integer Break My Submissions QuestionEditorial Solution
Total Accepted: 15598 Total Submissions: 37387 Difficulty: Medium
Given a positive integer n, break it into the sum of at least two positive integers and maximize the product of those integers. Return the maximum product you can get.

For example, given n = 2, return 1 (2 = 1 + 1); given n = 10, return 36 (10 = 3 + 3 + 4).

Note: you may assume that n is not less than 2.

Hint:

There is a simple O(n) solution to this problem.
You may check the breaking results of n ranging from 7 to 10 to discover the regularities.
 */
package algorithms.num343_IntegerBreak;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {
    public int integerBreak(int n) {
    	switch (n) {
    	case 2: return 1;
    	case 3: return 2;
    	case 4: return 4;
    	case 5: return 6;
    	default:
    		List<Integer> ls = new ArrayList<Integer>();
    		while (n >= 3) {
    			n -= 3;
    			ls.add(3);
    		}
    		if (n > 0) ls.add(n);
    		if (ls.contains(1)) {
    			ls.remove(new Integer(3));
    			ls.remove(new Integer(1));
    			ls.add(4);
    		}
    		Iterator<Integer> it = ls.iterator();
    		int mul = 1;
    		while (it.hasNext()) mul *= it.next();
    		return mul;
    	}
    }
}
//20160620Mon17:38 duration:36m18s96 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao