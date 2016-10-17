/**
https://leetcode.com/problems/valid-word-square/
422. Valid Word Square   QuestionEditorial Solution  My Submissions
Total Accepted: 794
Total Submissions: 2144
Difficulty: Easy
Contributors: Admin
Given a sequence of words, check whether it forms a valid word square.

A sequence of words forms a valid word square if the kth row and column read the exact same string, where 0 ≤ k < max(numRows, numColumns).

Note:
The number of words given is at least 1 and does not exceed 500.
Word length will be at least 1 and does not exceed 500.
Each word contains only lowercase English alphabet a-z.
Example 1:

Input:
[
  "abcd",
  "bnrt",
  "crmy",
  "dtye"
]

Output:
true

Explanation:
The first row and first column both read "abcd".
The second row and second column both read "bnrt".
The third row and third column both read "crmy".
The fourth row and fourth column both read "dtye".

Therefore, it is a valid word square.
Example 2:

Input:
[
  "abcd",
  "bnrt",
  "crm",
  "dt"
]

Output:
true

Explanation:
The first row and first column both read "abcd".
The second row and second column both read "bnrt".
The third row and third column both read "crm".
The fourth row and fourth column both read "dt".

Therefore, it is a valid word square.
Example 3:

Input:
[
  "ball",
  "area",
  "read",
  "lady"
]

Output:
false

Explanation:
The third row reads "read" while the third column reads "lead".

Therefore, it is NOT a valid word square.
Hide Company Tags Google
Show Similar Problems

 */
package algorithms.num422_ValidWordSquare;
import java.util.Iterator;
import java.util.List;
public class Solution {
    public boolean validWordSquare(List<String> words) {
    	int maxlen = words.size();
        char[][] cs = new char[maxlen][maxlen];
        Iterator<String> it = words.iterator();
        int iRow = 0;
        while (it.hasNext() && iRow < maxlen) {
        	String word = it.next();
        	if (word.length() > maxlen) return false;
        	else if (word.length() < maxlen) {
        	    for (int i = 0; i < maxlen; i++) {
        	        if (i < word.length()) cs[iRow][i] = word.charAt(i);
        	        else cs[iRow][i] = ' ';
        	    }
        	} else cs[iRow] = word.toCharArray();
        	iRow++;
        }
        Iterator<String> it2 = words.iterator();
        for (int i = 0; i < maxlen && it2.hasNext(); i++ ) {
        	int iC = 0, iR = 0;
        	String word = it2.next();
        	while (iC < maxlen && iR < maxlen && iC < word.length() && iR < word.length()) {
        		if (cs[i][iC++] != cs[iR++][i]) return false;
        	}
        }
        return true;
    }
}
//SolvedOn20161015SatAt22:12 CodingDuration:moreThan30m Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao