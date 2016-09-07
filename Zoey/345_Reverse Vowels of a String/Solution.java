public class Solution {
    public String reverseVowels(String s) {
        if(s==null || s.length()==0) return "";
        String str = "aeiouAEIOU";
        char[] dict = s.toCharArray();
        int start=0,end=s.length()-1;
        while(start<end){
            while(start<end && !str.contains(dict[start]+"")){
                start++;
            }
            while(start<end && !str.contains(dict[end]+"")){
                end--;
            }
            char tmp = dict[start];
            dict[start] = dict[end];
            dict[end] = tmp;
            start++;
            end--;
        }
        return new String(dict);
    }
}