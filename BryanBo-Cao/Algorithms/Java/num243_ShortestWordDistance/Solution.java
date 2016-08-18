/**
https://leetcode.com/problems/shortest-word-distance/
Locked Question
 */
package algorithms.num243_ShortestWordDistance;

public class Solution {
	public int shortestDistance(String[] words, String word1, String word2) {
    	int minD = -1;
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
        	} else if (words[i].equals(word2)) {
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
        return minD;
    }
}
//20160813Sat CodingDuration:25m36s29 Accpeted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
