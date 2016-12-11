package leetCodeWeeklyContest12.problem2.num468_ValidIPAddress;

public class Solution {
    public String validIPAddress(String IP) {
    	int len = IP.length();
    	if (len < 7 || (IP.contains(".") && IP.contains(":"))) return "Neither";
    	else if (IP.contains(".")) {
    		String[] nums = IP.split("\\.");
    		if (nums.length != 4) return "Neither";
    		for (int i = 0; i < nums.length; i++) {
    			try {
    				if (Integer.parseInt(nums[i]) < 0 || Integer.parseInt(nums[i]) > 255 || 
    				    (nums[i].startsWith("0") && nums[i].length() > 1)) return "Neither";
    			} catch (NumberFormatException nfe) {
    				return "Neither";
    			}
    		}
    		return "IPv4";
    	} else if (IP.contains(":")) {
    		String[] nums = IP.split(":");
    		if (nums.length != 8) return "Neither";
    		for (int i = 0; i < nums.length; i++) {
    		    String upperS = nums[i].toUpperCase();
    		    char[] cs = upperS.toCharArray();
    		    for (int j = 0; j < cs.length; j++) {
    		        int intV = (int) cs[j];
    		        if (intV < 48 || (intV > 57 && intV < 65) || (intV > 70 && intV < 97) || intV > 102) return "Neither";
    		    }
    		    if (upperS.length() > 4 || upperS.isEmpty()) return "Neither";
    			int numsValue = Integer.parseInt(upperS, 16);
    			if ((upperS.startsWith("0") && upperS.length() > 4) || numsValue < 0 || numsValue > 65535) return "Neither";
    		}
    		return "IPv6";
    	}
    	return "Neither";
    }
}
//https://leetcode.com/contest/leetcode-weekly-contest-12/problems/validate-ip-address/
/*
468. Validate IP Address My SubmissionsBack To Contest
User Accepted: 406
User Tried: 443
Total Accepted: 418
Total Submissions: 1352
Difficulty: Medium
In this problem, your job to write a function to check whether a input string is a valid IPv4 address or IPv6 address or neither.

IPv4 addresses are canonically represented in dot-decimal notation, which consists of four decimal numbers, each ranging from 0 to 255, separated by dots ("."), e.g.,172.16.254.1;

Besides, you need to keep in mind that leading zeros in the IPv4 is illegal. For example, the address 172.16.254.01 is illegal.

IPv6 addresses are represented as eight groups of four hexadecimal digits, each group representing 16 bits. The groups are separated by colons (":"). For example, the address 2001:0db8:85a3:0000:0000:8a2e:0370:7334 is a legal one. Also, we could omit some leading zeros among four hexadecimal digits and some low-case characters in the address to upper-case ones, so 2001:db8:85a3:0:0:8A2E:0370:7334 is also a valid IPv6 address(Omit leading zeros and using upper cases).

However, we don't replace a consecutive group of zero value with a single empty group using two consecutive colons (::) to pursue simplicity. For example, 2001:0db8:85a3::8A2E:0370:7334 is an invalid IPv6 address.

Besides, you need to keep in mind that extra leading zeros in the IPv6 is also illegal. For example, the address 02001:0db8:85a3:0000:0000:8a2e:0370:7334 is also illegal.

Note: You could assume there is no extra space in the test cases and there may some special characters in the input string.

Example 1:
Input: "172.16.254.1"

Output: "IPv4"

Explanation: This is a valid IPv4 address, return "IPv4".
Example 2:
Input: "2001:0db8:85a3:0:0:8A2E:0370:7334"

Output: "IPv6"

Explanation: This is a valid IPv6 address, return "IPv6".
Example 3:
Input: "256.256.256.256"

Output: "Neither"

Explanation: This is neither a IPv4 address nor a IPv6 address.
 */

//SolvedOn20161210SatNight CodingDuration:1h32m58s37 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao
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

Input:
"01.01.01.01"
Output:
"IPv4"
Expected:
"Neither"

Input:
"12.12.12.12.12"
Output:
"IPv4"
Expected:
"Neither"

Input:
"2001:0db8:85a3:0:0:8A2E:0370:7334"
Output:
"Neither"
Expected:
"IPv6"

Input:
"12.12.12"
Output:
"IPv4"
Expected:
"Neither"

Input:
"2001:0db8:85a3:0000:0:8A2E:0370:7334"
Output:
"Neither"
Expected:
"IPv6"
*/