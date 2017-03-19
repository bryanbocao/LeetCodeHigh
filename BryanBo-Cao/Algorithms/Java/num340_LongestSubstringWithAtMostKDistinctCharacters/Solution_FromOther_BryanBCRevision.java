package com.num340_LongestSubstringWithAtMostKDistinctCharacters;

public class Solution_FromOther_BryanBCRevision {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] count = new int[256];
        char[] cs = s.toCharArray();
        int distinctNum = 0, leftI = 0, res = 0;
        for (int rightI = 0; rightI < cs.length; rightI++) {
            if (count[cs[rightI]]++ == 0) distinctNum++;
            if (distinctNum > k) {
                while (--count[cs[leftI++]] > 0);
                distinctNum--;
            }
            res = Math.max(res, rightI - leftI + 1);
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
//Improvements: https://discuss.leetcode.com/topic/83261/share-my-java-solution-using-slide-window-beating-98-03-inspired-by-jiangbowei2010
//Beating 98.03% https://leetcode.com/submissions/detail/97037506/