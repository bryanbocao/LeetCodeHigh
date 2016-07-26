/**
258. Add Digits My Submissions QuestionEditorial Solution
Total Accepted: 99245 Total Submissions: 203411 Difficulty: Easy
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 */
package algorithms.num258_AddDigits;

public class Solution {
    public int addDigits(int num) {
        return (int) (num - 9*Math.floor((num - 1) / 9));
    }
}
//20160604Sat13:12 duration: 3m57s62 ACCEPTED @BryanBo-Cao