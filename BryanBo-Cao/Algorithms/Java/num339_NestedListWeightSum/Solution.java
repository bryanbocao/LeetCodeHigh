/**
https://leetcode.com/problems/nested-list-weight-sum/
Locked Question
 */
package algorithms.num339_NestedListWeightSum;

import java.util.Iterator;
import java.util.List;

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class Solution {
	
    public int depthSum(List<NestedInteger> nestedList) {
        if (nestedList.isEmpty()) return 0;
        return nextDepthSum(nestedList, 1);
    }
    
    private static int nextDepthSum(List<NestedInteger> nestedList, int depth) {
    	if (!nestedList.isEmpty()) {
        	int sum = 0;
        	Iterator<NestedInteger> it = nestedList.iterator();
        	while (it.hasNext()) {
        		NestedInteger ni = it.next();
        		if (ni.isInteger()) sum += depth * ni.getInteger();
        		else sum += nextDepthSum(ni.getList(), depth + 1);
        	}
        	return sum;
    	}
        return 0;
    }
}
//20160810Wed10:08 CodingDuration:29m40s66 Accpeted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
