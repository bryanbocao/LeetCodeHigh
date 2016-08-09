package algorithms.num379_DesignPhoneDirectory;

import java.util.ArrayList;
import java.util.List;

public class PhoneDirectory20160809Tue1141 {

    /** Initialize your data structure here
        @param maxNumbers - The maximum numbers that can be stored in the phone directory. */

	List<Integer> ls;
	int maxNumbers;
	
	public PhoneDirectory20160809Tue1141(int maxNumbers) {
        this.ls = new ArrayList<Integer>();
        this.maxNumbers = maxNumbers;
        for (int i = 0; i < maxNumbers; i++) ls.add(i);
    }
    
    /** Provide a number which is not assigned to anyone.
        @return - Return an available number. Return -1 if none is available. */
    public int get() {
        if (ls.size() <= maxNumbers) {
        	int num = ls.get((int) ((maxNumbers - ls.size()) * Math.random()));
        	ls.remove(new Integer(num));
        	return num;
        }
        return -1;
    }
    
    /** Check if a number is available or not. */
    public boolean check(int number) {
        if (ls.contains(number)) return true;
        return false;
    }
    
    /** Recycle or release a number. */
    public void release(int number) {
        if (!ls.contains(number)) ls.add(number);
    }
}

/**
 * Your PhoneDirectory object will be instantiated and called as such:
 * PhoneDirectory obj = new PhoneDirectory(maxNumbers);
 * int param_1 = obj.get();
 * boolean param_2 = obj.check(number);
 * obj.release(number);
 */

//20160809Tue11:41 CodingDuration:27m03s53 TimeLimitExceeded @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
