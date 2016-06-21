/**
https://leetcode.com/problems/counting-bits/
338. Counting Bits My Submissions QuestionEditorial Solution
Total Accepted: 28656 Total Submissions: 50312 Difficulty: Medium
Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.

Example:
For num = 5 you should return [0,1,1,2,1,2].

Follow up:

It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass?
Space complexity should be O(n).
Can you do it like a boss? Do it without using any builtin function like __builtin_popcount in c++ or in any other language.
Hint:

You should make use of what you have produced already.
Divide the numbers in ranges like [2-3], [4-7], [8-15] and so on. And try to generate new range from previous.
Or does the odd/even status of the number help you in calculating the number of 1s?
 */
package algorithms.num338_CountingBits;

public class Solution {
    public int[] countBits(int num) {
    	int[] arr = new int[num + 1];
    	int v = 0;
    	for (int i = 0; i <= num; i++) {
    		if (i % 2 == 0 && i != 0) {
    			int it = i;
    			while (it % 2 == 0 && it != 1){
    				it /= 2;
        			v--;
    			}
    		}
    		arr[i] = v++;
    	}
        return arr;
    }
}
//https://leetcode.com/problems/counting-bits/
//20160621Tue12:04 duration:40m02s91 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao