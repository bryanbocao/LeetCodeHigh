# LeetCodeHigh
# 正确即是正义
# 王牌程序猿
# 代码狂人

**Spoiler Attention!**
Solutions are listed in this repository, if you haven't tried these problems yet, it is highly recommended for you to solve them yourself, rather than viewing these answers before solving them yourself.

If you want to test these code, please delete the first comment block, package statement and the last few comments, then submit the rest of the code.
For example, the solution of CompareTheTriplets is:
```
/**
https://leetcode.com/problems/two-sum/
1. Two Sum  QuestionEditorial Solution  My Submissions
Total Accepted: 263740 Total Submissions: 1051214 Difficulty: Easy
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
UPDATE (2016/2/13):
The return format had been changed to zero-based indices. Please read the above updated description carefully.
 */
package algorithms.num001_TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) return new int[]{map.get(target - nums[i]), i};
			else map.put(nums[i], i);
		}
		return new int[2];
	}
}
//20160726Tue23:29 duration:6m53s73 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
```
Delete 
```
https://leetcode.com/problems/two-sum/
1. Two Sum  QuestionEditorial Solution  My Submissions
Total Accepted: 263740 Total Submissions: 1051214 Difficulty: Easy
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
UPDATE (2016/2/13):
The return format had been changed to zero-based indices. Please read the above updated description carefully.
 */
```
and
```
package algorithms.num001_TwoSum;
```
You would submit the code like this:
```
import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) return new int[]{map.get(target - nums[i]), i};
			else map.put(nums[i], i);
		}
		return new int[2];
	}
}
```

##Option 2:
Some problems just need some blocks of the code but not the entire scripts, in this case just copy the scrips inside these two tags
```
// BryanBo-Cao's code ====== start 

// BryanBo-Cao's code ====== end
```

##Reference:
leetcode.com

##Useful Links:
http://coolshell.cn/articles/12052.html
https://www.youtube.com/watch?v=264b_f6828Y&list=PLGvfHSgImk4ZR3v2drDwHrmwu2a645sxL
https://www.zhihu.com/question/20368410

##Courses
Dynamic Programming

https://www.topcoder.com/community/data-science/data-science-tutorials/dynamic-programming-from-novice-to-advanced/

https://people.eecs.berkeley.edu/~vazirani/algorithms/chap6.pdf

https://www.cs.cmu.edu/~avrim/451f09/lectures/lect1001.pdf
