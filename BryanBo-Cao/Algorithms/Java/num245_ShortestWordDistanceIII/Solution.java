/**
https://leetcode.com/problems/shortest-word-distance-iii/
Locked Question
 */
package algorithms.num245_ShortestWordDistanceIII;

public class Solution {
    public int shortestWordDistance(String[] words, String word1, String word2) {
        int minD = -1;
        if (word1.equals(word2)) {
            int preI = -1;
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(word1)) {
                    if (preI == -1) preI = i;
                    else if (minD == -1 || i - preI < minD) {
                        minD = i - preI;
                        preI = i;
                    }
                }
            }
        } else {
            for (int i = 0; i < words.length; i++) {
            	if (words[i].equals(word1)) {
            		for (int j = i + 1; j < words.length; j++) {
            			if (words[j].equals(word1)) {
            			    i = j - 1;
            			    break;
            			} else if (words[j].equals(word2)) {
            				if (minD == -1 || j - i < minD) minD = j - i;
            				i = j - 1;
            				break;
            			}
            		}
            	}
            	if (words[i].equals(word2)) {
            		for (int j = i + 1; j < words.length; j++) {
            			if (words[j].equals(word2)) {
            			    i = j - 1;
            			    break;
            			} else if (words[j].equals(word1)) {
            				if (minD == -1 || j - i < minD) minD = j - i;
            				i = j - 1;
            				break;
            			}
            		}
            	}
            }
        }
        return minD;
    }
}
//FinishedOn20160814Sun20:57 CodingDuration:29m11s26 Accpeted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 

/**
Input:
["a","c","b","a"]
"a"
"b"
Output:
2
Expected:
1

Input:
["a","b","c","d","d"]
"a"
"d"
Output:
1
Expected:
3

Input:
["a","c","a","a"]
"a"
"a"
Output:
2
Expected:
1
/*