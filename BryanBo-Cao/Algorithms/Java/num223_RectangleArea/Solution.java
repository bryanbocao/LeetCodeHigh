/**
https://leetcode.com/problems/rectangle-area/
223. Rectangle Area My Submissions QuestionEditorial Solution
Total Accepted: 40802 Total Submissions: 133938 Difficulty: Easy
Find the total area covered by two rectilinear rectangles in a 2D plane.

Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.

Rectangle Area
Assume that the total area is never beyond the maximum possible value of int.
 */
package algorithms.num223_RectangleArea;

public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
    	int interArea = 0;
    	int rec0 = (D - B) * (C - A),
    			rec1 = (H - F) * (G - E);
        if (!(C <= E || G <= A || H <= B || D <= F)) {
        	int lbx, lby, rtx, rty;
        	lbx = E > A ? E : A;
        	lby = B > F ? B : F;
        	rtx = C < G ? C : G;
        	rty = D < H ? D : H;
        	interArea = (rtx - lbx) * (rty - lby);
        }
        return rec0 + rec1 - interArea;
    }
}
//20160630Wed13:35 duration:5m40s78 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao