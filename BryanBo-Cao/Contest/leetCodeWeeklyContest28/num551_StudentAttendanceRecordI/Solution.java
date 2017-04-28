package leetCodeWeeklyContest28.num551_StudentAttendanceRecordI;

public class Solution {
    public boolean checkRecord(String s) {
    	int index = s.indexOf('A');
    	if (s.contains("LLL") || (index > -1 && index < s.length() - 1 && s.substring(index + 1).indexOf('A') > -1)) return false;
        return true;
    }
}
/*
https://leetcode.com/contest/leetcode-weekly-contest-28/problems/student-attendance-record-i/
551. Student Attendance Record I My SubmissionsBack To Contest
User Accepted: 30
User Tried: 98
Total Accepted: 30
Total Submissions: 112
Difficulty: Easy
You are given a string representing an attendance record for a student. The record only contains the following three characters:

'A' : Absent.
'L' : Late.
'P' : Present.
A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

You need to return whether the student could be rewarded according to his attendance record.

Example 1:
Input: "PPALLP"
Output: True
Example 2:
Input: "PPALLL"
Output: False
*/
//SolvedOn20170415Sat CodingDuration:7m30s99