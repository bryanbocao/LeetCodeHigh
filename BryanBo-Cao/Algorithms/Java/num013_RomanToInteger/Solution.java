/**
https://leetcode.com/problems/roman-to-integer/
13. Roman to Integer My Submissions QuestionEditorial Solution
Total Accepted: 89977 Total Submissions: 223425 Difficulty: Easy
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.
 */
package algorithms.num013_RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<Character, Integer>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        char[] roman = s.toCharArray();
        int intv = 0;
        for (int i = roman.length - 1; i >= 0;) {
        	int prei = i - 1;
        	int thisv = romanMap.get(roman[i]);
        	if (prei >= 0) {
        		int prev = romanMap.get(roman[prei]);
        		if (prev < thisv) {
        			intv += thisv - prev;
        			i -= 2;
        			continue;
        		}
        	}
        	intv += thisv;
        	i--;
        }
        return intv;
    }
}
//20160617Fri16:59 duration:27m46s30 Accepted @github.com/BryanBo-Cao