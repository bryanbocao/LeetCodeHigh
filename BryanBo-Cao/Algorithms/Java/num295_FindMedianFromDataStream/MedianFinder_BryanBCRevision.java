package leetCode.num295_FindMedianFromDataStream;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder_BryanBCRevision {

    PriorityQueue<Integer> min, max;
    
    /** initialize your data structure here. */
    public MedianFinder_BryanBCRevision() {
        min = new PriorityQueue<>();
        max = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        max.offer(num);
        min.offer(max.poll());
        if (max.size() < min.size()) max.offer(min.poll());
    }
    
    public double findMedian() {
        if (max.size() == min.size()) return (max.peek() + min.peek()) /  2.0;
        return max.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
/*
https://leetcode.com/problems/find-median-from-data-stream
295. Find Median from Data Stream Add to List
DescriptionSubmissionsSolutions
Total Accepted: 37820
Total Submissions: 152424
Difficulty: Hard
Contributor: LeetCode
Median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value. So the median is the mean of the two middle value.

Examples: 
[2,3,4] , the median is 3

[2,3], the median is (2 + 3) / 2 = 2.5

Design a data structure that supports the following two operations:

void addNum(int num) - Add a integer number from the data stream to the data structure.
double findMedian() - Return the median of all elements so far.
For example:

addNum(1)
addNum(2)
findMedian() -> 1.5
addNum(3) 
findMedian() -> 2
Credits:
Special thanks to @Louis1992 for adding this problem and creating all test cases.
*/
/*
From https://discuss.leetcode.com/topic/27620/share-my-java-solution-logn-to-insert-o-1-to-query
Author https://discuss.leetcode.com/user/kennethliaoke
*/
//PracticedOn20170404Tue 7Times

