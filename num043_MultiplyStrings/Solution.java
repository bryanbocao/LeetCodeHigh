package algorithms.num043_MultiplyStrings;

public class Solution {
    public String multiply(String num1, String num2) {
    	int len1 = num1.length(), len2 = num2.length();
        if (len1 == 0 || len2 == 0) return new String("0");
        else if (len1 == 1) return num2;
        else if (len2 == 1) return num1;
        else {
        	if (len1 < len2) {
        		String s = num1;
        		num1 = num2;
        		num2 = s;
        		len1 = num1.length();
        		len2 = num2.length();
        	}
        	char[] cs1 = num1.toCharArray(), cs2 = num2.toCharArray();
        	int result = 0;
        	
        }
    }
    
    private int selfPlusSelf(char[] nums) {
    	int carry = 0, result = 0;
    	for (int i = nums.length - 1; i >= 0; i--) {
    		int currentDigit = nums[i] + nums[i] - 100 + carry;
    		if (currentDigit >= 10) {
    			currentDigit -= 10;
    			carry = 1;
    		} else carry = 0;
    		result += currentDigit * Math.pow(10, nums.length - 1 - i);
    	}
    	if (carry == 1) result += Math.pow(10, nums.length);
    	return result;
    }
}
//20160719Tue00:23 duration:25m34s28 NotFinished @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao