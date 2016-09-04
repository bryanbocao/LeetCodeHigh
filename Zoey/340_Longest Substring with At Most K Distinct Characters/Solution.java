public class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if(s==null||k==0) return 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int l=0,h=0,res=0;
        while(h<s.length()){
            if(map.size()<=k) map.put(s.charAt(h),h);
            if(map.size()>k){
                int leftmost = Integer.MAX_VALUE;
                for(int p:map.values()){
                    leftmost=Math.min(leftmost,p);
                }
                l=leftmost+1;
                map.remove(s.charAt(leftmost));
            }
            res=Math.max(res,h-l+1);
            h++;
        }
        return res;
    }
}