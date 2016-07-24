/**
https://leetcode.com/problems/decode-ways/
91. Decode Ways  QuestionEditorial Solution  My Submissions
Total Accepted: 76655
Total Submissions: 427170
Difficulty: Medium
A message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
...
'Z' -> 26
Given an encoded message containing digits, determine the total number of ways to decode it.

For example,
Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).

The number of ways decoding "12" is 2.
 */
package algorithms.num091_DecodeWays;

public class Solution20160724Sun1734 {
    public int numDecodings(String s) {
        int len = s.length();
        if (len == 0) return 0;
        else if (len < 2) {
        	if (s.equals("0")) return 0;
        	else return 1;
        } else {
        	StringBuffer sb = new StringBuffer(s);
        	if (s.contains("0")) {
        		int zeroI = sb.indexOf("0");
        		while(zeroI > -1) {
            		if (zeroI == 0) return 0;
            		else if ((int) sb.charAt(zeroI - 1) < 49 || 50 < (int) sb.charAt(zeroI - 1)) return 0;
            		else {
            			sb = sb.delete(zeroI - 1, zeroI + 1);
            			System.out.println("zeroI: " + zeroI);
            			System.out.println("sb: " + sb);
            			zeroI = sb.indexOf("0");
            		}
//            		zeroI = s.substring(zeroI + 1).indexOf('0');
        		}
        	}
        	s = sb.toString();
        	int i1 = s.indexOf('1'), i2 = s.indexOf('2');
        	int i = -1;
        	if (i1 >= 0 && i2 >= 0) i = i1 < i2 ? i1 : i2;
        	else if (i1 == -1 && i2 == -1) return 1;
        	else {
        		if (i1 == -1) i = i2;
        		else if (i2 == -1) i = i1;
        	}
        	int cnt = 1;
        	while (i < s.length() - 1 && i > -1) {
        		System.out.println("line 26: i: " + i);
        		if (s.charAt(i) == '1') {
        			if (s.charAt(i + 1) > 48) cnt++;
        		} else if (s.charAt(i) == '2') {
        			System.out.println("line 30 s.substring(i): " + s.substring(i));
        			System.out.println("line 31 s.charAt(i + 1): " + (int)s.charAt(i + 1));
        			if (48 <= (int) s.charAt(i + 1) && (int) s.charAt(i + 1) <= 54) {
        				System.out.println("line 33 cnt++");
        				cnt++; 
        				System.out.println("line 35 cnt: " + cnt);
        			}
        		}
        		s = s.substring(i + 1);
        		i1 = s.indexOf('1'); i2 = s.indexOf('2');
            	if (i1 >= 0 && i2 >= 0) i = i1 < i2 ? i1 : i2;
            	else {
            		if (i1 == -1) i = i2;
            		else if (i2 == -1) i = i1;
            	}
        	}
        	return cnt;
        }
    }
}
//20160724Sun17:34 duration:1h29m08s61 WrongAnswer(Haven't taken the continuous two digits into consideration) @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
/**
Input:
"0"
Output:
1
Expected:
0

Input:
"6065812287883668764831544958683283296479682877898293612168136334983851946827579555449329483852397155"
Output:
0
Expected:
0

Input:
"11"
Output:
1
Expected:
2

Input:
"27"
Output:
2
Expected:
1

Input:
"100"
Output:
1
Expected:
0

Input:
"110"
Output:
2
Expected:
1

Input:
"230"
Output:
1
Expected:
0

Runtime Error Message:
Line 14: java.lang.StringIndexOutOfBoundsException: String index out of range: -1
Last executed input:
"00"

Input:
"1212"
Output:
4
Expected:
5

*/