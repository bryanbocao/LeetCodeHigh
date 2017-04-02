package algorithms.num340_LongestSubstringWithAtMostKDistinctCharacters.previousAttempts;

import java.util.HashMap;
import java.util.Map;

public class Solution20170316Thu4 {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int leftIndex = 0, res = 0;
        char[] cs = s.toCharArray();
        for (int rightIndex = 0; rightIndex < s.length(); rightIndex++) {
            if (map.get(cs[rightIndex]) == null) map.put(cs[rightIndex], 1);
            else map.put(cs[rightIndex], map.get(cs[rightIndex]) + 1);
            System.out.println();
            System.out.println("leftIndex: " + leftIndex + " rightIndex: " + rightIndex);
            System.out.println(cs[rightIndex]);
            System.out.println("cs[leftIndex]: " + cs[leftIndex] + "map.get(cs[leftIndex]): " + map.get(cs[leftIndex]));
            if (map.size() > k) {
                System.out.println();
                System.out.println(" > k");
                System.out.println("> k leftIndex: " + leftIndex + " rightIndex: " + rightIndex);
                System.out.println(cs[rightIndex]);
                System.out.println("> k cs[leftIndex]: " + cs[leftIndex] + "map.get(cs[leftIndex]): " + map.get(cs[leftIndex]));

                while (leftIndex++ < cs.length && map.get(cs[leftIndex - 1]) != null && map.get(cs[leftIndex - 1]) - 1 > 0) {
                    map.put(cs[leftIndex - 1], map.get(cs[leftIndex - 1]) - 1);
                    System.out.println(leftIndex - 1);
                    System.out.println("while leftIndex - 1: " + (leftIndex - 1) + " rightIndex: " + rightIndex);
                }
                map.remove(cs[leftIndex - 1]);
                System.out.println("line 24");
            }
            System.out.println("rightIndex - leftIndex + 1");
            System.out.println(rightIndex - leftIndex + 1);
            res = Math.max(res, rightIndex - leftIndex + 1);
        }
        return res;
    }
}
//https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters
/*
340. Longest Substring with At Most K Distinct Characters Add to List
DescriptionSubmissionsSolutions
Total Accepted: 19033
Total Submissions: 49579
Difficulty: Hard
Contributors: Admin
Given a string, find the length of the longest substring T that contains at most k distinct characters.

For example, Given s = “eceba” and k = 2,

T is "ece" which its length is 3.
 */
//Inspired By https://discuss.leetcode.com/topic/41671/15-lines-java-solution-using-slide-window
//Author: https://discuss.leetcode.com/user/jiangbowei2010
//TriedOn20170316Thu
/*
Input:
"bacc"
2
Output:
2
Expected:
3

Input:
"a"
1
Output:
0
Expected:
1

Input:
"eceba"
2
Output:
4
Expected:
3
 */