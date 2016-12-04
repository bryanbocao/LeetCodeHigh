package leetCodeWeeklyContest11.problem2.num469_ConvexPolygon;

import java.util.Iterator;
import java.util.List;

public class Solution {
    public boolean isConvex(List<List<Integer>> points) {
    	if (points.size() <= 2) return false;
    	Iterator<List<Integer>> it = points.iterator();
    	List<Integer> prePoint = it.next();
    	Iterator<Integer> itPP = prePoint.iterator();
    	boolean gotPreK = false, toRight = false, toLeft = false, toUp = false, toDown = false;
    	int prePointX = itPP.next(), prePointY = itPP.next(), preK = 0;
    	while (it.hasNext()) {
    		
    		List<Integer> nextPoint = it.next();
    		Iterator<Integer> itNP = nextPoint.iterator();
    		int nextPointX = itNP.next(), nextPointY = itNP.next();
    		int diffX = nextPointX - prePointX, diffY = nextPointY - prePointY;
			if (diffX == 0) {
    			if (diffY > 0) {
    				toUp = true;
    				toDown = false;
    			} else {
    				toUp = false;
    				toDown = true;
    			}
    		} else if (diffY == 0) {
    			if (diffX > 0) {
    				toRight = true;
    				toLeft = false;
    			} else {
    				toRight = false;
    				toLeft = true;
    			}
    		}
    		if (gotPreK) {
    			if (toUp | toDown | toLeft | toDown) {
    				
    			}
    		} else {
    		}
    		prePoint = nextPoint;
    	}
    }
}
//https://leetcode.com/contest/leetcode-weekly-contest-11/problems/convex-polygon/
/*
469. Convex Polygon My SubmissionsBack To Contest
User Accepted: 0
User Tried: 1
Total Accepted: 0
Total Submissions: 1
Difficulty: Medium
Given a list of points that form a polygon when joined sequentially, find if this polygon is convex (Convex polygon definition).

Note:

There are at least 3 and at most 10,000 points.
Coordinates are in the range -10,000 to 10,000.
You may assume the polygon formed by given points is always a simple polygon (Simple polygon definition). In other words, we ensure that exactly two edges intersect at each vertex, and that edges otherwise don't intersect each other.
Example 1:

[[0,0],[0,1],[1,1],[1,0]]

Answer: True

Example 2:

[[0,0],[0,10],[5,5],[10,10],[10,0]]

Answer: False

 */
//TriedOn20161203SatNight CodingDuration:39m52s61 NotSubmitted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao
