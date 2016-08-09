/**
https://leetcode.com/problems/design-phone-directory/
Locked Question
 */
package algorithms.num379_DesignPhoneDirectory;

public class PhoneDirectory {
	
    /** Initialize your data structure here
        @param maxNumbers - The maximum numbers that can be stored in the phone directory. */

	boolean[] pd;
	int storedNumber;
	
	public PhoneDirectory(int maxNumbers) {
        this.pd = new boolean[maxNumbers];
        this.storedNumber = 0;
    }
    
    /** Provide a number which is not assigned to anyone.
        @return - Return an available number. Return -1 if none is available. */
    public int get() {
    	System.out.println(storedNumber);
    	System.out.println(pd.length);
    	if (storedNumber < pd.length) {
    		int num = (int) ((pd.length - storedNumber) * Math.random());
    		while (pd[num]) {
    			num++;
    			if (num >= pd.length) num %= pd.length; 
    		}
    		pd[num] = true;
    		storedNumber++;
    		return num;
    	}
    	return -1;
    }
    
    /** Check if a number is available or not. */
    public boolean check(int number) {
        if (pd[number]) return false;
        return true;
    }
    
    /** Recycle or release a number. */
    public void release(int number) {
        if (pd[number]) {
        	pd[number] = false;
        	storedNumber--;
        }
    }
}

/**
 * Your PhoneDirectory object will be instantiated and called as such:
 * PhoneDirectory obj = new PhoneDirectory(maxNumbers);
 * int param_1 = obj.get();
 * boolean param_2 = obj.check(number);
 * obj.release(number);
 */

//20160809Tue11:56 CodingDuration:38m35s53 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
