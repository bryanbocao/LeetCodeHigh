public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<String>();
        backtracking(res,s,"",0);
        return res;
    }

    public void backtracking(List<String> list, String s, String tmp, int counter){
        if(counter==4){
            if(s.length()==0) list.add(tmp.substring(0,tmp.length()-1)); //remove the last dot
            return;
        }
        for(int k=1;k<=3;k++){
            if(s.length()<k) continue; //last block with 2 digit
            int val = Integer.parseInt(s.substring(0,k));
            if(val>255 || k!=String.valueOf(val).length()) continue; //case for 010
            backtracking(list,s.substring(k),tmp+s.substring(0,k)+".",counter+1);
        }
    }

}