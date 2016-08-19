public class Solution {
    public int maxProduct(String[] words) {
        int max=0;
        if(words==null||words.length==0) return max;
        int[] value = new int[words.length];
        for(int i=0;i<words.length;i++){
            String tmp = words[i];
            for(int j=0;j<tmp.length();j++){
                value[i] |= 1<<(tmp.charAt(j)-'a');
            }
        }
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if((value[i]&value[j])==0 && words[i].length()*words[j].length()>max){
                    max = words[i].length()*words[j].length();
                }
            }
        }
        return max;
    }
}