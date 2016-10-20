public class Solution {
    public String reverseString(String s) {
        if(s==null||s.length()==0) return s;
        char[] chs = s.toCharArray();
        int l=0,h=s.length()-1;
        while(l<h){
            char tmp = chs[l];
            chs[l] = chs[h];
            chs[h] = tmp;
            l++;
            h--;
        }
        return new String(chs);
    }
}