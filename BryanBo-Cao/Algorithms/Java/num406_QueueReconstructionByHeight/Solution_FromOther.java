package leetCode.num406_QueueReconstructionByHeight;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution_FromOther {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
        List<int[]> list = new LinkedList<>();
        for (int[] p : people) {
            list.add(p[1], p);
        }
        return list.toArray(new int[list.size()][]);
    }
}
/*
https://leetcode.com/problems/queue-reconstruction-by-height/#/description
406. Queue Reconstruction by Height Add to List
DescriptionSubmissionsSolutions
Total Accepted: 20258
Total Submissions: 37013
Difficulty: Medium
Contributor: LeetCode
Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k), where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h. Write an algorithm to reconstruct the queue.

Note:
The number of people is less than 1,100.

Example

Input:
[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]

Output:
[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
*/
/*
From https://discuss.leetcode.com/topic/60394/easy-concept-with-python-c-java-solution/10
Author https://discuss.leetcode.com/user/hotpro
*/