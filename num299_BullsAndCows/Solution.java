/**
 * 299. Bulls and Cows My Submissions QuestionEditorial Solution
Total Accepted: 31891 Total Submissions: 105130 Difficulty: Easy
You are playing the following Bulls and Cows game with your friend: You write down a number and ask your friend to guess what the number is. Each time your friend makes a guess, you provide a hint that indicates how many digits in said guess match your secret number exactly in both digit and position (called "bulls") and how many digits match the secret number but locate in the wrong position (called "cows"). Your friend will use successive guesses and hints to eventually derive the secret number.

For example:

Secret number:  "1807"
Friend's guess: "7810"
Hint: 1 bull and 3 cows. (The bull is 8, the cows are 0, 1 and 7.)
Write a function to return a hint according to the secret number and friend's guess, use A to indicate the bulls and B to indicate the cows. In the above example, your function should return "1A3B".

Please note that both secret number and friend's guess may contain duplicate digits, for example:

Secret number:  "1123"
Friend's guess: "0111"
In this case, the 1st 1 in friend's guess is a bull, the 2nd or 3rd 1 is a cow, and your function should return "1A1B".
You may assume that the secret number and your friend's guess only contain digits, and their lengths are always equal.
 */
package algorithms.num299_BullsAndCows;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {
    public String getHint(String secret, String guess) {
        char[] css = secret.toCharArray();
        char[] csg = guess.toCharArray();
        List<Character> lss = new ArrayList<Character>(),
        		lsg = new ArrayList<Character>();
        int a = 0, b = 0;
        for (int i = 0; i < css.length; i++) {
        	if (css[i] == csg[i]) a++;
        	else {
        		lss.add(css[i]);
        		lsg.add(csg[i]);
        	}
        }
        Iterator<Character> itg = lsg.iterator();
        while (itg.hasNext()) {
        	char gc = itg.next();
        	if (lss.contains(gc)) {
        		b++;
        		lss.remove(new Character(gc));
        	}
        }
        return a + "A" + b + "B";
    }
}
//20160614Tue11:49 duration:33m45s32 @BryanBo-Cao