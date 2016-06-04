/**
 *171. Excel Sheet Column Number My Submissions QuestionEditorial Solution
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
package algorithms.num171ExcelSheetColumnNumber;

public class Solution {
    public int titleToNumber(String s) {
        char[] cs = s.toCharArray();
        int num = 0;
        for (int i = cs.length - 1; i >= 0; i--) {
        	System.out.println((int) cs[i] - 64);
        	System.out.println(cs.length - i - 1);
        	System.out.println(26 ^ (cs.length - i - 1));
        	num += ((int) cs[i] - 64) * 26 ^ (cs.length - i - 1);
        	System.out.println();
        }
        return num;
    }
}
//20160604Sat14:07 duration:28m15s61 Not Finished @BryanBo-Cao