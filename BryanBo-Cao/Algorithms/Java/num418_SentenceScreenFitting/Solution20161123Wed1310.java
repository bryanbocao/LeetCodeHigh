package num418_SentenceScreenFitting;
public class Solution20161123Wed1310 {
    public int wordsTyping(String[] sentence, int rows, int cols) {
        int cnt = 0, i = 0, j = 0, sI = 0;
        while ((i + 1) * (j + 1) <= rows * cols) {
        	if (sentence[sI].length() > cols) return 0;
        	if (sentence[sI].length() <= cols - j + 2) j += sentence[sI].length() + 1;
        	else {
        		i++;
        		j = sentence[sI].length() + 1;
        	}
        	if (sI == sentence.length - 1) {
        		cnt++;
        		sI = 0;
        	} else sI++;
        }
        return cnt;
    }
}
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
*/