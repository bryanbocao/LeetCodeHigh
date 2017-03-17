package com.num340_LongestSubstringWithAtMostKDistinctCharacters;

public class Solution_FromOther {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] count = new int[256];
        int num = 0, i = 0, res = 0;
        for (int j = 0; j < s.length(); j++) {
            if (count[s.charAt(j)]++ == 0) num++;
            if (num > k) {
                while (--count[s.charAt(i++)] > 0);
                num--;
            }
            res = Math.max(res, j - i + 1);
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
//From https://discuss.leetcode.com/topic/41671/15-lines-java-solution-using-slide-window
//Author: https://discuss.leetcode.com/user/jiangbowei2010
//PracticedOn20170316Thu 5Times