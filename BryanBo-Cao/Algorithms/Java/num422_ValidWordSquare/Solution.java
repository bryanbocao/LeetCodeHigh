package num422_ValidWordSquare;
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