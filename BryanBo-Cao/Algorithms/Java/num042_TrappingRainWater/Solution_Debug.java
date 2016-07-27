/**
https://leetcode.com/problems/trapping-rain-water/
42. Trapping Rain Water  QuestionEditorial Solution  My Submissions
Total Accepted: 73165 Total Submissions: 220792 Difficulty: Hard
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

For example, 
Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.

The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped. Thanks Marcos for contributing this image!
 */
package algorithms.num042_TrappingRainWater;

public class Solution_Debug {
    public int trap(int[] height) {
    	int rain = 0;
    	if (height.length > 0) {
    		int pre = height[0], prePeakI = -1, postPeakI = -1;
            int h = -2;
            if (pre > 0) h = 1;
            boolean gotPeak = false;
        	for (int i = 1; i < height.length; i++) {
        		if (pre <= height[i]) {
        			if (i == height.length - 1) {
        				postPeakI = i;
        				gotPeak = true;
        			}
        			if (pre < height[i]) h = 1;
        			else h = 0;
        		} else {
        			if (h >= 0) gotPeak = true;
        			h = -1;
        		}
        		System.out.println("line 17: ");
        		System.out.println("line 18 prePeakI: " + prePeakI);
				System.out.println("line 19 postPeakI: " + postPeakI);
        		if (gotPeak) {
        			if (prePeakI == -1) prePeakI = i - 1;
        			else if (postPeakI == -1) postPeakI = i - 1;
        			if (postPeakI > -1) {
        				//add rain
        				int maxHeight;
        				if (height[prePeakI] < height[postPeakI]) maxHeight = height[prePeakI];
        				else maxHeight = height[postPeakI];
        				System.out.println("maxHeight: " + maxHeight);
    					for (int j = prePeakI; j < postPeakI; j++) {
    						int diff = maxHeight - height[j];
    						if (diff > 0) {
    							height[j] = maxHeight;
    							rain += diff;
    						}
    					}
        				///add rain
    					System.out.println("prePeakI: " + prePeakI);
    					System.out.println("postPeakI: " + postPeakI);
    					System.out.println(rain);
    					System.out.println();
    					if (height[prePeakI] < height[postPeakI]) prePeakI = postPeakI;
        				postPeakI = -1;
        			}
        			gotPeak = false;
        		}
        		pre = height[i];
        	}
    	}
    	return rain;
    }
}
//20160724Sun19:46 duration:57m14s79 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
/**
Input:
[2,0,2]
Output:
0
Expected:
2

Input:
[5,2,1,2,1,5]
Output:
2
Expected:
14

Input:
[5,3,7,7]
Output:
0
Expected:
2
*/