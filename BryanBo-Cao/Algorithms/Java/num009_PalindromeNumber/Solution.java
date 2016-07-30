/**
https://leetcode.com/problems/palindrome-number/
9. Palindrome Number  QuestionEditorial Solution  My Submissions
Total Accepted: 137172 Total Submissions: 421142 Difficulty: Easy
Determine whether an integer is a palindrome. Do this without extra space.

click to show spoilers.

Some hints:
Could negative integers be palindromes? (ie, -1)

If you are thinking of converting the integer to string, note the restriction of using extra space.

You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?

There is a more generic way of solving this problem.
 */
package algorithms.num009_PalindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
    	if (x < 0) return false;
    	else {
    		char[] cs = Integer.toString(x).toCharArray();
            int len = cs.length;
            
            if (len < 2) return true;
            else {
                int midI = len / 2;
                if (len % 2 == 0) {
                	int step = 0;
                	for (int i = midI; i < len; i++) {
                		if (cs[i] != cs[i - step * 2 - 1]) return false;
                		step++;
                	}
                } else {
                	for (int step = 1; midI + step < len; step++) {
                		if (cs[midI + step] != cs[midI - step]) return false;
                	}
                }
                return true;
            }
    	}
    }
}
//20160730Sat13:01 duration:9m56s94 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
