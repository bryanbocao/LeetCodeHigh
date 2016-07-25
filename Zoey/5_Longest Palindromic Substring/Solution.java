public class Solution {
    private int start=0,maxLen=0;

    public String longestPalindrome(String s) {
        int len = s.length();
        if(len<2) return s;
        for(int i=0;i<len;i++){
            extendRes(s,i,i);
            extendRes(s,i,i+1);
        }
        return s.substring(start+1,start+maxLen-1);
    }

    public void extendRes(String s, int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        if(maxLen<right-left+1){
            maxLen = right-left+1;
            start=left;
        }
    }

}