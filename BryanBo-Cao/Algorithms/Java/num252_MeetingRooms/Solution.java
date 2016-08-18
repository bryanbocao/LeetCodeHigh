/**
https://leetcode.com/problems/meeting-rooms/
Locked Question
 */
package algorithms.num252_MeetingRooms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public boolean canAttendMeetings(Interval[] intervals) {
        if (intervals.length > 1) {
            List<Integer> ls = new ArrayList<Integer>();
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int i = 0; i < intervals.length; i++) {
            	if (map.containsKey(intervals[i].start)) return false;
            	ls.add(intervals[i].start);
            	map.put(intervals[i].start, intervals[i].end);
            }
            Collections.sort(ls);
            Iterator<Integer> it = ls.iterator();
            int preEnd = -1;
            while (it.hasNext()) {
            	int start = it.next();
            	if (preEnd != -1 && start < preEnd) return false;
            	preEnd = map.get(start);
            }
        }
        return true;
    }
}
//SolvedOn20160818ThuAt15:13 CodingDuration:43m32s89 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
