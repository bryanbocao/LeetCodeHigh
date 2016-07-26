/**
 *171. Excel Sheet Column Number My Su
bmissions QuestionEditorial Solution
Total Accepted: 82162 Total Submissions: 194377 Difficulty: Easy
Related to question Excel Sheet Column Title

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
 */
package algorithms.num171_ExcelSheetColumnNumber;

public class Solution {
    public int titleToNumber(String s) {
        char[] cs = s.toCharArray();
        int num = 0;
        for (int i = cs.length - 1; i >= 0; i--) {
        	int d = (int) cs[i] - 64;
        	int pw = cs.length - i - 1, dv = 1;
        	if (pw > 0) for (int j = 1; j <= pw; j++) dv *= 26;
        	num += d * dv;
        }
        return num;
    }
}
//20160609Fri11:05 duration:24m25s99 ACCEPTED @BryanBo-Cao