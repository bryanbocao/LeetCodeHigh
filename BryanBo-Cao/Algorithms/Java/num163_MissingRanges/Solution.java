package num163_MissingRanges;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> ls = new ArrayList<String>();
        if (lower < nums[0]) {
        	String lowerS = new Integer(lower).toString();
        	if (lower == nums[0] - 1) ls.add(lowerS);
        	else ls.add(lowerS + "->" + new Integer(nums[0] - 1).toString());
        } else {
        	int pre = nums[0];
        	for (int i = 1; i < nums.length; i++) {
        		if (nums[i] != pre + 1) {
        			String lowerS = new Integer(pre).toString();
        			if (nums[i] == pre + 2) ls.add(lowerS);
        			else ls.add(lowerS + "->" + new Integer(nums[i] - 1).toString());
        		}
        		pre = nums[i];
        	}
        	int lastNum = nums[nums.length - 1];
        	if (nums[nums.length - 1] < upper) {
            	String upperS = new Integer(upper).toString();
            	if (lastNum == upper - 1) ls.add(upperS);
            	else ls.add(new Integer(lastNum + 1).toString() + "->" + upperS);
        	}
        }
        return ls;
    }
}
/*
https://leetcode.com/problems/missing-ranges/
163. Missing Ranges   Add to List QuestionEditorial Solution  My Submissions
Total Accepted: 20429
Total Submissions: 70542
Difficulty: Medium
Contributors: Admin
Given a sorted integer array where the range of elements are in the inclusive range [lower, upper], return its missing ranges.

For example, given [0, 1, 3, 50, 75], lower = 0 and upper = 99, return ["2", "4->49", "51->74", "76->99"].

Hide Company Tags Google
Hide Tags Array
Hide Similar Problems (M) Summary Ranges
 */
//Result: SolvedOn20161123Wed11:57 CodingDuration:28m14s92 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao

/*
Runtime Error Message:
Line 5: java.lang.ArrayIndexOutOfBoundsException: 0
Last executed input:
[]
1
1

Input:
[0,1,3,50,75]
0
99
Output:
["1","3->49","50->74","76->99"]
Expected:
["2","4->49","51->74","76->99"]

[-1]
-2
0
Output:
["-2"]
Expected:
["-2","0"]

Input:
[1,1,1]
1
1
Output:
["2->0","2->0"]
Expected:
[]
*/