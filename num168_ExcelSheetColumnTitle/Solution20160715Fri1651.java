/**
https://leetcode.com/problems/excel-sheet-column-title/
168. Excel Sheet Column Title  QuestionEditorial Solution  My Submissions
Total Accepted: 67107 Total Submissions: 297316 Difficulty: Easy
Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
 */
public class Solution20160715Fri1651 {
    public String convertToTitle(int n) {
    	StringBuffer sbresult = new StringBuffer();
        int pow = 1;
        while (n > Math.pow(26, pow)) pow++;
        pow--;
        while (pow >= 0) {
        	int digit;
        	int powNum = (int) Math.pow(26, pow);
        	if (pow > 0 && n % powNum == 0) {
        		System.out.println("line 12");
        		digit = (n - 1) / powNum;
        		n = n % powNum;
        		sbresult.append((char) (digit + 64));
        		pow--;
        		while (pow >= 0) {
        			sbresult.append('Z');
        			pow--;
        		}
        		break;
        	} else {
        		System.out.println("line 15");
        		digit = n / powNum;
        		n = n % powNum;
        		sbresult.append((char) (digit + 64));
        	}
        	pow--;
        }
        return sbresult.toString();
    }
}
//20160715Fri16:51 duration:1h06m28s16 Unsolved @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao
/*
Your input

701
Your stdout

line 15
line 15
line 15
Your answer

"A@Y"
Expected answer

"ZY"
*/