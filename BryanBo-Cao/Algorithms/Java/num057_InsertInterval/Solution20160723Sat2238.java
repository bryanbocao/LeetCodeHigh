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
public class Solution20160723Sat2238 {
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
        		if (!gotNewStart && !gotNewEnd) {
        			if (st < itv.start && ed < itv.start) {
        				Interval interval = new Interval(st, ed);
        				intervals.add(0, interval);
        				System.out.println("line 46");
        				return intervals;
        			}
        		}
        		if (!gotNewStart) {
        			System.out.println("got new start");
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
        		if (!gotNewEnd) {
        			System.out.println("got new end");
        			if (it.hasNext()) {
            			if (itv.start <= ed && ed <= itv.end) {
            				newEnd = itv.end;
            				newEndI = i;
            				break;
            			} else if (ed < itv.start) {
        					if (gotNewStart) newEndI = i - 1;
        					else newEndI = i;
        					break;
            			}
        			} else {
        				newEndI = i;
        				if (ed < itv.start) {
        					newEnd = ed;
        					if (gotNewStart) newEndI = i - 1;
        					break;
        				} else if (itv.start <= ed && ed <= itv.end) {
        					newEnd = itv.end;
        				} else if (ed <= itv.end) {
        					newEnd = itv.end;
        				} else {
        					newEnd = ed;
        				}
        			}
        		}
        		i++;
        	}
        	if (gotNewStart) {
        		Interval itvl = new Interval(newStart, newEnd);
            	intervals.add(newStartI, itvl);
            	newStartI++; newEndI++;
            	System.out.println("line 95 newStartI: " + newStartI);
            	System.out.println("line 95 newEndI: " + newEndI);
            	if (newEnd > intervals.get(newStartI).start) {
            		for (int ii = newStartI; ii <= newEndI; ii++) intervals.remove(newStartI);
            	}
        	} else {
        		System.out.println("line 101 newStartI: " + newStartI);
            	System.out.println("line 101 newEndI: " + newEndI);
        		intervals.add(newInterval);
        	}

        	return intervals;
        }
    }
}
//20160723Sat22:37 duration:1h26m32s05 WrongAnswerAccepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
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

Input:
[[1,5]]
[0,1]
Output:
[[0,1],[1,5]]
Expected:
[[0,5]]

Input:
[[0,3],[6,8],[9,12]]
[0,4]
Output:
[[0,4],[9,12]]
Expected:
[[0,4],[6,8],[9,12]]

Input:
[[0,4],[7,12]]
[0,5]
Output:
[[0,0],[0,4],[7,12]]
Expected:
[[0,5],[7,12]]

*/