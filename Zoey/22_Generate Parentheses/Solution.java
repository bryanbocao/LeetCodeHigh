public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        backtracking(res,"",0,0,n);
        return res;
    }

    public void backtracking(List<String> list, String str, int open, int close, int max){
        if(str.length()==max*2){
            list.add(str);
            return;
        }

        if(open<max){
            backtracking(list,str+"(",open+1,close,max);
        }
        if(close<open){
            backtracking(list,str+")",open,close+1,max);
        }
    }
}