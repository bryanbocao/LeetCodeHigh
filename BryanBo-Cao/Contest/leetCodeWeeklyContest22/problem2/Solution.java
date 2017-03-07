package leetCodeWeeklyContest22.problem2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public int findLonelyPixel(char[][] picture) {
        if (picture == null || picture.length == 0) return 0;
        int row = picture.length, col = picture[0].length;
        Map<Integer, Integer> rowMap = new HashMap<Integer, Integer>(),
            colMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (picture[i][j] == 'B') {
                    if (rowMap.containsKey(i)) rowMap.put(i, rowMap.get(i) + 1);
                    else rowMap.put(i, 1);
                    if (colMap.containsKey(j)) colMap.put(j, colMap.get(j) + 1);
                    else colMap.put(j, 1);
                }
            }
        }
        int min0 = 0;
        Iterator<Integer> it0 = rowMap.values().iterator();
        while (it0.hasNext())
            if (it0.next() == 1) min0++;

        int min1 = 0;
        Iterator<Integer> it1 = colMap.values().iterator();
        while (it1.hasNext())
            if (it1.next() == 1) min1++;
        
        return Math.min(min0, min1);
    }
}
//https://leetcode.com/contest/leetcode-weekly-contest-22/problems/lonely-pixel-i/
/*
531. Lonely Pixel I My SubmissionsBack To Contest
User Accepted: 944
User Tried: 1094
Total Accepted: 955
Total Submissions: 2127
Difficulty: Medium
Given a picture consisting of black and white pixels, find the number of black lonely pixels.

The picture is represented by a 2D char array consisting of 'B' and 'W', which means black and white pixels respectively.

A black lonely pixel is character 'B' that located at a specific position where the same row and same column don't have any other black pixels.

Example:
Input: 
[['W', 'W', 'B'],
 ['W', 'B', 'W'],
 ['B', 'W', 'W']]

Output: 3
Explanation: All the three 'B's are black lonely pixels.
Note:
The range of width and height of the input 2D array is [1,500].
 */
/*
Input:
["BBB"]
Output:
1
Expected:
0
*/
//SolveOn20170304Sat CodingDuration:17m44s00
