package leetCodeWeeklyContest11.problem3.num467_UniqueSubstringsInWraparoundString;

import java.util.List;

public class SolutionFromOther {
	public int findSubstringInWraproundString(String p) {
		int[] maxLen = new int[26]; // End with letter, the longest number

		char[] cstr = p.toCharArray();
		int len = p.length();

		int[] letterLen = new int[len]; // The longest ascending sequence end
										// with letter

		for (int i = 0; i < cstr.length; i++) {
			int currLen = 1;
			if (0 < i && (cstr[i] == cstr[i - 1] + 1 || (cstr[i - 1] == 'z' && cstr[i] == 'a'))) {
				currLen = letterLen[i - 1] + 1;
			}
			letterLen[i] = currLen;

			int id = cstr[i] - 'a';
			maxLen[id] = Math.max(maxLen[id], currLen);
		}

		int prev = 0;

		int wrapping = 0;
		for (int i = 0; i < 26; i++) {
			wrapping += maxLen[i];
		}
		return wrapping;
	}
}
// from https://leetcode.com/forestschao/
//https://leetcode.com/contest/leetcode-weekly-contest-11/problems/unique-substrings-in-wraparound-string/
/*
467. Unique Substrings in Wraparound String My SubmissionsBack To Contest
User Accepted: 0
User Tried: 0
Total Accepted: 0
Total Submissions: 0
Difficulty: Medium
Consider the string s to be the infinite wraparound string of "abcdefghijklmnopqrstuvwxyz", so s will look like this: "...zabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcd....".

Now we have another string p. Your job is to find out how many unique non-empty substrings of p are present in s. In particular, your input is the string p and you need to output the number of different non-empty substrings of p in the string s.

Note: p consists of only lowercase English letters.

Example 1:
Input: "a"
Output: 1

Explanation: Only the substring "a" of string "a" is in the string s.
Example 2:
Input: "cac"
Output: 2
Explanation: There are two substrings "a", "c" of string "cac" in the string s.
Example 3:
Input: "zab"
Output: 6
Explanation: There are six substrings "z", "a", "b", "za", "ab", "zab" of string "zab" in the string s.
*/