public class Solution {
    public int lengthLongestPath(String input) {
        String[] tokens = input.split("\n");
        int result = 0;
        int curLen = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for(String s:tokens){
            int level = getLevel(s);
            while(stack.size()>level){
                curLen -= stack.pop();
            }
            int len = s.replaceAll("\t","").length()+1;
            curLen += len;
            if(s.contains(".")){
                result = curLen-1>result? curLen-1:result;
            }
            stack.push(len);
        }
        return result;
    }

    public int getLevel(String s){
        String after = s.replaceAll("\t","");
        return s.length()-after.length();
    }
}