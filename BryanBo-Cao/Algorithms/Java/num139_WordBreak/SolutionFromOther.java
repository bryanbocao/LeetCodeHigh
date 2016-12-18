package num139_WordBreak;

import java.util.Set;

public class SolutionFromOther {
    public boolean wordBreak(String s, Set<String> dict) {
        boolean[] f = new boolean[s.length() + 1];
        f[0] = true;
        // First DP
        /*
        for(int i = 1; i <= s.length(); i++){
            for(String str: dict){
                if(str.length() <= i){
                    if(f[i - str.length()]){
                        if(s.substring(i-str.length(), i).equals(str)){
                            f[i] = true;
                            break;
                        }
                    }
                }
            }
        }
        */
        
        //Second DP
        for(int i=1; i <= s.length(); i++){
            for(int j=0; j < i; j++){
                if(f[j] && dict.contains(s.substring(j, i))){
                    f[i] = true;
                    break;
                }
            }
        }
        return f[s.length()];
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
//from https://discuss.leetcode.com/topic/6156/java-implementation-using-dp-in-two-ways
//from https://discuss.leetcode.com/user/segfault