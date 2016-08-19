/**
https://leetcode.com/problems/nested-list-weight-sum-ii/
Locked Question
 */
package algorithms.num364_NestedListWeightSumII;
/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class Solution {
    public int depthSumInverse(List<NestedInteger> nestedList) {
    	int maxDepth = getMaxDepth(nestedList, 1);
        return getDepthSumInverse(nestedList, maxDepth);
    }
    
    private static int getMaxDepth(List<NestedInteger> nestedList, int depth) {
    	Iterator<NestedInteger> it = nestedList.iterator();
    	int maxDepth = depth, tDepth = 0;
    	while (it.hasNext()) {
    		NestedInteger ni = it.next();
    		if (!ni.isInteger()) {
    			tDepth = getMaxDepth(ni.getList(), depth + 1);
    			if (tDepth > maxDepth) maxDepth = tDepth;
    		} 
    	}
    	return maxDepth;
    }
    
    private static int getDepthSumInverse(List<NestedInteger> nestedList, int depth) {
    	int sum = 0;
    	Iterator<NestedInteger> it = nestedList.iterator();
    	while (it.hasNext()) {
    		NestedInteger ni = it.next();
         	if (ni.isInteger()) sum += depth * ni.getInteger();
         	else sum += getDepthSumInverse(ni.getList(), depth - 1);
        }
    	return sum;
    }
}
//SolvedOn20160819FriAt10:12 CodingDuration:around38m Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
