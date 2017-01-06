package num139_WordBreak;

import java.util.Set;

public class SolutionFromOther3 {
    public class TrieNode {
        boolean isWord;
        TrieNode[] c;
        
        public TrieNode(){
            isWord = false;
            c = new TrieNode[128];
        }
    }
    
    public void addWord(TrieNode t, String w) {
        for (int i = 0; i < w.length(); i++) {
            int j = (int)w.charAt(i); 
            if (t.c[j] == null) t.c[j] = new TrieNode();
            t = t.c[j];
        }
        t.isWord = true;
    }
    
    public boolean wordBreak(String s, Set<String> wordDict) {
        TrieNode t = new TrieNode(), cur;
        for (String i : wordDict) addWord(t, i);
        char[] str = s.toCharArray();
        int len = str.length;
        boolean[] f = new boolean[len + 1];
        f[len] = true;
        
        for (int i = len - 1; i >= 0; i--) {
            cur = t;
            for (int j = i; cur != null && j < len ; j++) {
                cur = cur.c[(int)str[j]];
                if (cur != null && cur.isWord && f[j + 1]) {
                    f[i] = true;
                    break;
                }
            }
        }
        return f[0];
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
//from https://discuss.leetcode.com/topic/6156/java-implementation-using-dp-in-two-ways/14
//from https://discuss.leetcode.com/user/oflucas