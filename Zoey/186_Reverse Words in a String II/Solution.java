public class Solution {
    public void reverseWords(char[] s) {
        if(s==null || s.length==0) return;
        reverse(s,0,s.length-1);
        int ind = 0;
        for(int i=0;i<s.length;i++){
            if(s[i]==' '){
                reverse(s,ind,i-1);
                ind=i+1;
            }
        }
        reverse(s,ind,s.length-1);
    }

    public void reverse(char[] s, int start, int end){
        while(start<end){
            char tmp = s[start];
            s[start] = s[end];
            s[end] = tmp;
            start++;
            end--;
        }
    }
}