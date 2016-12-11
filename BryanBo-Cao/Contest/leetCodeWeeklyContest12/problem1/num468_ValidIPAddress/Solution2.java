package leetCodeWeeklyContest12.problem2.num468_ValidIPAddress;


public class Solution2 {
    public String validIPAddress(String IP) {
    	int len = IP.length();
    	if (len < 7 || (IP.contains(".") && IP.contains(":"))) return "Neither";
    	else if (IP.contains(".")) {
    		String[] nums = IP.split("\\.");
    		for (int i = 0; i < nums.length; i++) {
    			char[] cs = IP.toCharArray();
    		    for (int j = 0; j < cs.length; j++) {
    		        int intV = (int) cs[j];
    		        if (j == 0 && (intV < 49 || intV > 57)) return "Neither";
    		        if (intV < 48 || intV > 57) return "Neither";
    		    }
    		    if (Integer.parseInt(nums[i]) < 0 || Integer.parseInt(nums[i]) > 255) return "Neither";
    		}
    		return "IPv4";
    	} else if (IP.contains(":")) {
    		String[] nums = IP.split(":");
    		for (int i = 0; i < nums.length; i++) {
    		    String upperS = nums[i].toUpperCase();
    		    char[] cs = upperS.toCharArray();
    		    for (int j = 0; j < cs.length; j++) {
    		        int intV = (int) cs[j];
    		        if (intV < 48 || (intV > 57 && intV < 65) || (intV > 70 && intV < 97) || intV > 102) return "Neither";
    		    }
    		    if (upperS.length() > 4 || upperS.isEmpty()) return "Neither";
    			int numsValue = Integer.parseInt(upperS, 16);
    			if ((numsValue == 0 && upperS.length() > 1) || numsValue < 0 || numsValue > 65535) return "Neither";
    		}
    		return "IPv6";
    	}
    	return "Neither";
    }
}
/*
Runtime Error Message:
Line 9: java.lang.NumberFormatException: For input string: "A"
Last executed input:
"A.a.aA.2"

Runtime Error Message:
Line 16: java.lang.NumberFormatException: For input string: "FGb8"
Last executed input:
"20EE:FGb8:85a3:0:0:8A2E:0370:7334"

Input:
"172.16.254.1"
Output:
"Neither"
Expected:
"IPv4"
*/