public class Solution {
    public int longestPalindrome(String s) {
        if(s==null||s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chs = s.toCharArray();
        for(int i=0;i<chs.length;i++){
            if(map.containsKey(chs[i])){
                map.put(chs[i],map.get(chs[i])+1);
            }else{
                map.put(chs[i],1);
            }
        }
        int res = 0;
        boolean odd = false;
        for(Character c:map.keySet()){
            if(map.get(c)%2==0){
                res+=map.get(c);
            }else{
                res+=map.get(c)-1;
                odd=true;
            }
        }
        return odd==true?res+1:res;
    }
}