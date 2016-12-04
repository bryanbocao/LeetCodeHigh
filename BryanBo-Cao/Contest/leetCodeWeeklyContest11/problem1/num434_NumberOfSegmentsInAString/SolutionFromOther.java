package leetCodeWeeklyContest11.problem1.num434_NumberOfSegmentsInAString;

public class SolutionFromOther {
    public int countSegments(String s) {
        boolean isBlank = true;
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                if (isBlank) cnt++;
            }
            
            isBlank = (c == ' ');
        }
        
        return cnt;
    }
}
//from https://leetcode.com/forestschao/
//https://leetcode.com/contest/leetcode-weekly-contest-11/problems/number-of-words-in-a-string/
/*
434. Number of Segments in a String My SubmissionsBack To Contest
User Accepted: 451
User Tried: 861
Total Accepted: 484
Total Submissions: 997
Difficulty: Easy
Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.

For example,

Input: "Hello, my name is John"

Output: 5
*/