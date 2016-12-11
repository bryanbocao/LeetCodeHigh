package leetCodeWeeklyContest12.problem4.num471_EncodeStringWithShortestLength;

import java.util.HashMap;
import java.util.Map;

public class SolutionFromOther {

    Map<String, String> map = new HashMap<>();

    public String encode(String s) {
        if (s == null || s.length() <= 0) return s;
        if (map.containsKey(s)) return map.get(s);
        String ans = s;

        // Consider self-compress
        for (int len = 1; len < s.length(); len++)
            if (s.length() % len == 0) {
                boolean canCompress = true;
                for (int i = 0, j = 0; i < s.length(); i++, j = (j + 1) % len)
                    if (s.charAt(i) != s.charAt(j)) {
                        canCompress = false;
                        break;
                    }

                if (canCompress) {
                    String tmp = String.format("%d[%s]", s.length() / len, encode(s.substring(0, len)));
                    if (tmp.length() < ans.length()) {
                        ans = tmp;
                    }
                }
            }


        // Split into two parts
        for (int len = 1; len < s.length(); len++) {
            String tmp = encode(s.substring(0, len)) + encode(s.substring(len, s.length()));
            if (tmp.length() < ans.length()) {
                ans = tmp;
            }
        }

        map.put(s, ans);
        return ans;
    }

    public static void main(String[] args) {
        SolutionFromOther sol = new SolutionFromOther();
        System.out.println(sol.encode(""));
    }
}
//from https://leetcode.com/lixx2100
//https://leetcode.com/contest/leetcode-weekly-contest-12/problems/encode-string-with-shortest-length/
/*
471. Encode String with Shortest Length My SubmissionsBack To Contest
User Accepted: 0
User Tried: 0
Total Accepted: 0
Total Submissions: 0
Difficulty: Hard
Given a non-empty string, encode the string such that its encoded length is the shortest.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times.

Note:
k will be a positive integer and encoded string will not be empty or have extra space.
You may assume that the input string contains only lowercase English letters. The string's length is at most 160.
If an encoding process does not make the string shorter, then do not encode it. If there are several solutions, return any of them is fine.
Example 1:

Input: "aaa"
Output: "aaa"
Explanation: There is no way to encode it such that it is shorter than the input string, so we do not encode it.
Example 2:

Input: "aaaaa"
Output: "5[a]"
Explanation: "5[a]" is shorter than "aaaaa" by 1 character.
Example 3:

Input: "aaaaaaaaaa"
Output: "10[a]"
Explanation: "a9[a]" or "9[a]a" are also valid solutions, both of them have the same length = 5, which is the same as "10[a]".
Example 4:

Input: "aabcaabcd"
Output: "2[aabc]d"
Explanation: "aabc" occurs twice, so one answer can be "2[aabc]d".
Example 5:

Input: "abbbabbbcabbbabbbc"
Output: "2[2[abbb]c]"
Explanation: "abbbabbbc" occurs twice, but "abbbabbbc" can also be encoded to "2[abbb]c", so one answer can be "2[2[abbb]c]"
*/