/**
https://leetcode.com/problems/moving-average-from-data-stream/
Locked Question
 */
package algorithms.num346_MovingAverageFromDataStream;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {

    /** Initialize your data structure here. */
	Queue<Integer> q = null;
	int size = 0, sum = 0;
	
    public MovingAverage(int size) {
        this.q = new LinkedList<Integer>();
        this.size = size;
        this.sum = 0;
    }
    
    public double next(int val) {
        if (this.q.size() >= this.size) {
        	this.sum -= q.peek();
        	q.remove();
        }
        q.add(val);
        this.sum += val;
        return (double) sum / q.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */

//20160810Wed10:21 CodingDuration:7m03s45 Accpeted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
