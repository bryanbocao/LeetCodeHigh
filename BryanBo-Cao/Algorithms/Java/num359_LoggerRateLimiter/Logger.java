/**
https://leetcode.com/problems/logger-rate-limiter/
Locked Question
 */
package algorithms.num359_LoggerRateLimiter;

import java.util.HashMap;
import java.util.Map;

public class Logger {

    /** Initialize your data structure here. */
	Map<String, Integer> map = null;
    public Logger() {
		this.map = new HashMap<String, Integer>();
    }
    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if (this.map.containsKey(message)) if (timestamp - this.map.get(message) < 10) return false;
        else map.put(message, timestamp);
        return true;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
//20160810Wed23:34 CodingDuration:17m04s71 Accpeted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
