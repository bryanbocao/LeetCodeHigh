public class Solution {
    public String reverseWords(String s) {
        String[] parts = s.trim().split("\\s+");
        String res = "";
        for(int i=parts.length-1;i>0;i--){
            res+=parts[i]+" ";
        }
        return res+parts[0];  //avoid the last space
    }
}