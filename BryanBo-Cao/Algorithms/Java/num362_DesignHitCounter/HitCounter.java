/**
https://leetcode.com/problems/design-hit-counter/
Locked Question
 */
package algorithms.num362_DesignHitCounter;

import java.util.LinkedList;
import java.util.Queue;

public class HitCounter {

    Queue<Integer> q = null;
    /** Initialize your data structure here. */
    public HitCounter() {
        q = new LinkedList<Integer>();
    }
    
    /** Record a hit.
        @param timestamp - The current timestamp (in seconds granularity). */
    public void hit(int timestamp) {
        q.add(timestamp);
    }
    
    /** Return the number of hits in the past 5 minutes.
        @param timestamp - The current timestamp (in seconds granularity). */
    public int getHits(int timestamp) {
        while (!q.isEmpty() && timestamp - q.peek() >= 300) q.remove();
        return q.size();
    }
}

/**
 * Your HitCounter object will be instantiated and called as such:
 * HitCounter obj = new HitCounter();
 * obj.hit(timestamp);
 * int param_2 = obj.getHits(timestamp);
 */

//20160810Wed10:37 CodingDuration:10m24s91 Accpeted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
