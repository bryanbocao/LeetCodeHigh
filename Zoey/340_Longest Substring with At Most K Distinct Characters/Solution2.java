public class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        //这其实是个Hashmap
        int[] count = new int[256];
        //num用来记录不一样字幕的个数
        int start=0, num = 0, res = 0;
        for(int end=0;end<s.length();end++){
            //count[]==0说明遇到了新字母
            if(count[s.charAt(end)]==0)
                num++;
            count[s.charAt(end)]++;
            //滑动窗
            while(num>k && start<s.length()){
                count[s.charAt(start)]--;
                if(count[s.charAt(start)]==0)
                    num--;
                start++;
            }
            res = Math.max(res, end-start+1);
        }
        return res;
    }
}