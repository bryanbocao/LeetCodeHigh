package leetCodeWeeklyContest11.problem2.num469_ConvexPolygon;

import java.util.List;

public class SolutionFromOther {
	public boolean isConvex(List<List<Integer>> points) {
		if (points.size() == 3)
			return true;

		points.add(points.get(0));
		points.add(points.get(1));

		int i = 0, sign = 0;
		List<Integer> p1 = null, p2 = null;
		for (List<Integer> p : points) {
			if (i == 0)
				p2 = p;
			else if (i == 1)
				p1 = p;
			else {
				int curr = getArea(p2, p1, p);
				if (sign == 0 || sign == curr) {
					sign = curr;
				} else if (curr != 0) {
					return false;
				}
				p2 = p1;
				p1 = p;
			}

			i++;
		}

		return true;
	}

	private int getArea(List<Integer> a, List<Integer> b, List<Integer> c) {
		int area = (a.get(0) * b.get(1) + a.get(1) * c.get(0) + b.get(0) * c.get(1) - a.get(0) * c.get(1)
				- a.get(1) * b.get(0) - b.get(1) * c.get(0));

		if (area != 0)
			return area / Math.abs(area);
		return 0;
	}
}
// from https://leetcode.com/forestschao/
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