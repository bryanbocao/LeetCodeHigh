/**
https://leetcode.com/problems/insert-interval/
57. Insert Interval  QuestionEditorial Solution  My Submissions
Total Accepted: 63342 Total Submissions: 257939 Difficulty: Hard
Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

You may assume that the intervals were initially sorted according to their start times.

Example 1:
Given intervals [1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9].

Example 2:
Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] in as [1,2],[3,10],[12,16].

This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].
 */
package algorithms.num057_InsertInterval;

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution20160723Sat2124 {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        if (intervals.isEmpty()) {
        	intervals.add(newInterval);
        	return intervals;
        } else {
        	int st = newInterval.start, ed = newInterval.end;
        	Iterator<Interval> it = intervals.iterator();
        	int newStart = 0, newEnd = 0;
        	int newStartI = 0, newEndI = 0;
        	boolean gotNewStart = false, gotNewEnd = false;
        	int i = 0;
        	while (it.hasNext()) {
        		Interval itv = it.next();
        		if (!gotNewStart) {
        			
            		if (itv.start <= st && st <= itv.end) {
            			newStartI = i;
            			newStart = itv.start;
            			gotNewStart = true;
            		} else if (st < itv.start) {
            			newStartI = i;
            			newStart = st;
            			gotNewStart = true;
            		}
            		
        		}
        		i++;
        		if (!gotNewEnd) {
        			newEndI = i;
        			if (it.hasNext()) {
            			if (itv.start <= ed && ed <= itv.end) {
            				newEnd = itv.end;
            				break;
            			}
        			} else {
        				if (ed < itv.start) newEnd = ed;
        				else if (ed < itv.end) newEnd = itv.end;
        				else newEnd = ed;
        			}
        			
        		}
        	}
        	if (gotNewStart) {
        		Interval itvl = new Interval(newStart, newEnd);
            	intervals.add(newStartI, itvl);
            	newStartI++; newEndI++;
            	if (newEnd > intervals.get(newStartI).start) {
            		for (int ii = newStartI; ii < newEndI; ii++) intervals.remove(newStartI);
            	}
        	} else intervals.add(newInterval);

        	return intervals;
        }
    }
}
//20160723Sat21:24 duration:49m16s01 WrongAnswerAccepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
/**
Input:
[[1,5]]
[2,3]
Output:
[[1,5],[2,3]]
Expected:
[[1,5]]

Input:
[[1,5]]
[0,0]
Output:
[[0,0]]
Expected:
[[0,0],[1,5]]

Input:
[[0,4],[7,12]]
[0,5]
Output:
[[0,5]]
Expected:
[[0,5],[7,12]]

*/