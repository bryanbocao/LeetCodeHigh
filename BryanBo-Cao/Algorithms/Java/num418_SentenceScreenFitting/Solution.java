package num418_SentenceScreenFitting;
public class Solution {
    public int wordsTyping(String[] sentence, int rows, int cols) {
        int cnt = 0, i = 0, j = 0, sI = 0;
        while (i < rows) {
            int wordLen = sentence[sI].length();
        	if (wordLen > cols) return 0;
        	if (wordLen + j - 1 <= cols) {
        	    if (wordLen + j == cols - 1) {
        	        i++;
        	        j = 0;
        	    } else j += wordLen + 1;
        	} else {
        	    System.out.println("line 15");
        		i++;
        		j = wordLen + 1;
        	}
        	if (i >= rows) break;
        	if (sI == sentence.length - 1) {
        		cnt++;
        		System.out.println("line 20: i, j: " + i + " " + j);
        		sI = 0;
        	} else {
        	    System.out.println("line 24");
        	    sI++;
        	}
        	//if (j >= cols - 1) {
        //	    i++;
        	//    j = 0;
        //	}
        }
        System.out.println("line 28: i, j: " + i + " " + j);
        return cnt;
    }
}
/*
https://leetcode.com/problems/sentence-screen-fitting/
418. Sentence Screen Fitting   Add to List QuestionEditorial Solution  My Submissions
Total Accepted: 3994
Total Submissions: 15318
Difficulty: Medium
Contributors: Admin
Given a rows x cols screen and a sentence represented by a list of words, find how many times the given sentence can be fitted on the screen.

Note:

A word cannot be split into two lines.
The order of words in the sentence must remain unchanged.
Two consecutive words in a line must be separated by a single space.
Total words in the sentence won't exceed 100.
Length of each word won't exceed 10.
1 ≤ rows, cols ≤ 20,000.
Example 1:

Input:
rows = 2, cols = 8, sentence = ["hello", "world"]

Output: 
1

Explanation:
hello---
world---

The character '-' signifies an empty space on the screen.
Example 2:

Input:
rows = 3, cols = 6, sentence = ["a", "bcd", "e"]

Output: 
2

Explanation:
a-bcd- 
e-a---
bcd-e-

The character '-' signifies an empty space on the screen.
Example 3:

Input:
rows = 4, cols = 5, sentence = ["I", "had", "apple", "pie"]

Output: 
1

Explanation:
I-had
apple
pie-I
had--

The character '-' signifies an empty space on the screen.
Hide Company Tags Google
Hide Tags Dynamic Programming
 */
//Result: TriedOn20161123Wed CodingDuration:43m33s03 WrongAnswer 
/*
Input:
["ab","cde","f"]
3
5
Output:
2
Expected:
1

Input:
["f","p","a"]
8
7
Output:
9
Expected:
10

Input:
["a", "bcd", "e"]
4
6
Output:
3
Expected:
2
*/