public class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<String>();
        Set<String> skip = new HashSet<String>(Arrays.asList("..",".",""));
        for(String dir:path.split("/")){
            if(dir.equals("..") && !stack.isEmpty()) stack.pop();
            if(!skip.contains(dir)) stack.push(dir);
        }
        String res="";
        for(String d:stack){
            res+="/"+d;
        }
        return res.isEmpty()?"/":res; //for case "///"
    }
}