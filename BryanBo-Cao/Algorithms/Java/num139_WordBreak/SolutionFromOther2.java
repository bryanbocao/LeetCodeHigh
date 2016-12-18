package num139_WordBreak;

import java.util.Set;

public class SolutionFromOther2 {
	public boolean wordBreak(String s, Set<String> wordDict) {
		int n = s.length();
		boolean[] f = new boolean[n + 1];
		f[0] = true;
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= i && !f[i]; j++)
				f[i] = wordDict.contains(s.substring(j - 1, i)) && f[j - 1];
		return f[n];
	}
}
//https://leetcode.com/problems/word-break/
/*
139. Word Break   Add to List QuestionEditorial Solution  My Submissions
Total Accepted: 118779
Total Submissions: 425322
Difficulty: Medium
Contributors: Admin
Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

For example, given
s = "leetcode",
dict = ["leet", "code"].

Return true because "leetcode" can be segmented as "leet code".

Hide Company Tags Google Uber Facebook Amazon Yahoo Bloomberg Pocket Gems
*/
//from https://discuss.leetcode.com/topic/6156/java-implementation-using-dp-in-two-ways/15
//from https://discuss.leetcode.com/user/oflucas