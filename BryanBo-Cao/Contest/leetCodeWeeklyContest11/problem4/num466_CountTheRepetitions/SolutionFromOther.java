package leetCodeWeeklyContest11.problem4.num466_CountTheRepetitions;

public class SolutionFromOther {
	public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
		int c1 = 0, c2 = 0;
		char[] cstr1 = s1.toCharArray(), cstr2 = s2.toCharArray();

		int i = 0, j = 0, l1 = cstr1.length, l2 = cstr2.length;
		while (c1 < n1) {
			if (cstr1[i] == cstr2[j]) {
				j++;
				if (j == l2) {
					j = 0;
					c2++;
				}
			}
			i++;
			if (i == l1) {
				i = 0;
				c1++;
			}
		}

		return c2 / n2;
	}
}
//from https://leetcode.com/forestschao/
//https://leetcode.com/contest/leetcode-weekly-contest-11/problems/count-the-repetitions/
/*
466. Count The Repetitions My SubmissionsBack To Contest
User Accepted: 0
User Tried: 0
Total Accepted: 0
Total Submissions: 0
Difficulty: Hard
Define S = [s,n] as the string S which consists of n connected strings s. For example, ["abc", 3] ="abcabcabc".

On the other hand, we define that string s1 can be obtained from string s2 if we can remove some characters from s2 such that it becomes s1. For example, “abc” can be obtained from “abdbec” based on our definition, but it can not be obtained from “acbbe”.

You are given two non-empty strings s1 and s2 (each at most 100 characters long) and two integers 0 ≤ n1 ≤ 106 and 1 ≤ n2 ≤ 106. Now consider the strings S1 and S2, where S1=[s1,n1] and S2=[s2,n2]. Find the maximum integer M such that [S2,M] can be obtained from S1.

Example:

Input:
s1="acb", n1=4
s2="ab", n2=2

Return:
2
*/