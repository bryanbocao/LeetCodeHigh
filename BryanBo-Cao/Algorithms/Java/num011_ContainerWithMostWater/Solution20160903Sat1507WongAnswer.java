package algorithms.num011_ContainerWithMostWater;
public class Solution20160903Sat1507WongAnswer {

    public int maxArea(int[] height) {
        int maxArea = 0, tempArea = 0, preMaxHI = 0, len = height.length;
        for (int i = 1; i < len; i++) {
        	if (i == len - 1) {
        		if (height[preMaxHI] <= height[i]) tempArea = height[preMaxHI] * (i - preMaxHI);
        		else {
        			int lastI = len - 1;
        			for (int j = lastI - 1; j >= preMaxHI; j--) {
        				if (height[j] >= height[lastI]) {
        					tempArea = height[lastI] * (lastI - j);
        					if (tempArea > maxArea) maxArea = tempArea;
        				}
        			}
        		}
        		if (tempArea > maxArea) maxArea = tempArea;
        	} else if (height[preMaxHI] <= height[i]) {
            	tempArea = height[preMaxHI] * (i - preMaxHI);
           		if (tempArea > maxArea) maxArea = tempArea;
            	preMaxHI = i;
        	}
        }
        return maxArea;
    }

}
//TriedOn20160903SatAt15:07 CodingDuration:1h13m17s23 WrongAnswer @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
