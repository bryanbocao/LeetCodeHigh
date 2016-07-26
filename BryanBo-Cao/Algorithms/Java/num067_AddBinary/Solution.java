/**
https://leetcode.com/problems/add-binary/
67. Add Binary  QuestionEditorial Solution  My Submissions
Total Accepted: 93432 Total Submissions: 328956 Difficulty: Easy
Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
 */
package algorithms.num067_AddBinary;

public class Solution {
    public String addBinary(String a, String b) {
        StringBuffer sb = new StringBuffer();
        char carry = '0';
        while (!a.isEmpty() && !b.isEmpty()) {
        	char ca = a.charAt(a.length() - 1);
        	char cb = b.charAt(b.length() - 1);
        	if (ca == '0' && cb =='0') {
        		if (carry == '0') sb.append('0');
        		else {
        			sb.append('1');
        			carry = '0';
        		}
        	} else if ((ca == '0' && cb == '1') || (ca == '1' && cb == '0')) {
        		if (carry == '0') sb.append('1');
        		else {
        			sb.append('0');
        			carry = '1';
        		}
        	} else {// '1' + '1'
        		if (carry == '0') {
        			sb.append('0');
        			carry = '1';
        		} else {
        			sb.append('1');
        			carry = '1';
        		}
        	}
        	a = a.substring(0, a.length() - 1);
        	b = b.substring(0, b.length() - 1);
        }
        if (carry == '0') {
        	sb = sb.reverse();
        	if (!a.isEmpty()) {
        		StringBuffer sba = new StringBuffer(a);
        		sba.append(sb);
        		return sba.toString();
        	} else if (!b.isEmpty()) {
        		StringBuffer sbb = new StringBuffer(b);
        		sbb.append(sb);
        		return sbb.toString();
        	}
        } else {//carry == '1'
        	if (!a.isEmpty()) {
        		while (!a.isEmpty()) {
        			char ca = a.charAt(a.length() - 1);
        			if (ca == '0') {
        				if (carry == '0') sb.append('0');
        				else {//carry == '1'
            				sb.append('1');
            				carry = '0';
        				}
        			} else {//ca == '1'
        				if (carry == '0') {
            				sb.append('1');
            				carry = '0';
        				} else {
        					sb.append('0');
            				carry = '1';
        				}
        			}
        			a = a.substring(0, a.length() - 1);
        		}
        	} else if (!b.isEmpty()) {
        		while (!b.isEmpty()) {
        			char cb = b.charAt(b.length() - 1);
        			if (cb == '0') {
        				if (carry == '0') sb.append('0');
        				else {//carry == '1'
            				sb.append('1');
            				carry = '0';
        				}
        			} else {//cb == '1'
        				if (carry == '0') {
            				sb.append('1');
            				carry = '0';
        				} else {
        					sb.append('0');
            				carry = '1';
        				}
        			}
        			b = b.substring(0, b.length() - 1);
        		}
        	}
        	if (carry == '1') sb.append('1');
        	sb.reverse();
        }
        return sb.toString();
    }
}
//20160719Tue15:58 duration:33m08s70 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao