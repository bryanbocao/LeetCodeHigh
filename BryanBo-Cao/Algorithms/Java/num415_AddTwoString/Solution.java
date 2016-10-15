
/**
https://leetcode.com/problems/add-strings/
415. Add Strings   QuestionEditorial Solution  My Submissions
Total Accepted: 5003
Total Submissions: 11601
Difficulty: Easy
Contributors: Admin
Given two non-negative numbers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.
*/
 
package algorithms.num415_AddTwoString;

public class Solution {

    public String addStrings(String num1, String num2) {
        int len1 = num1.length(), len2 = num2.length();
        if (len1 == 0) return num2;
        if (len2 == 0) return num1;
        char[] cs1 = num1.toCharArray(), cs2 = num2.toCharArray();
        StringBuffer sumSB = new StringBuffer();
        int i1 = cs1.length - 1, i2 = cs2.length - 1, carry = 0;
        while (i1 >= 0 && i2 >= 0) {
        	int dSum = cs1[i1--] + cs2[i2--] + carry - 96;
        	if (dSum >= 10) {
        		dSum -= 10;
        		carry = 1;
        	} else carry = 0;
        	sumSB.append(dSum);
        }
        while (i2 >= 0) {
        	int dSum = cs2[i2--] + carry - 48;
        	if (dSum >= 10) {
        		dSum -= 10;
        		carry = 1;
        	} else carry = 0;
        	sumSB.append(dSum);
        }
        while (i1 >= 0) {
        	int dSum = cs1[i1--] + carry - 48;
        	if (dSum >= 10) {
        		dSum -= 10;
        		carry = 1;
        	} else carry = 0;
        	sumSB.append(dSum);
        }
        if (carry == 1) sumSB.append(1);
        return sumSB.reverse().toString();
    }

}
//SolvedOn20161014FriAt21:10 CodingDuration:22m42s24 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao
