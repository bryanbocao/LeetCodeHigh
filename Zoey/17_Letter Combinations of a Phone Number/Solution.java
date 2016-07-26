public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if(digits.length()==0) return res;
        String[] mapping = new String[] {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        res.add("");
        for(int i=0;i<digits.length();i++){
            String cur = mapping[digits.charAt(i)-'0'];
            List<String> tmp = new ArrayList<String>();
            for(int j=0;j<cur.length();j++){
                for(String s:res){
                    tmp.add(s+cur.charAt(j));
                }
            }
            res=tmp;
        }
        return res;
    }
}