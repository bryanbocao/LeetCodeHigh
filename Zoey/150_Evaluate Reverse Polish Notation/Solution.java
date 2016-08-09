public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for(String item:tokens){
            if(item.equals("+")) stack.add(stack.pop()+stack.pop());
            else if(item.equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                stack.add(b-a);
            }
            else if(item.equals("*")) stack.add(stack.pop()*stack.pop());
            else if(item.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                stack.add(b/a);
            }
            else{
                stack.push(Integer.parseInt(item));
            }
        }
        return stack.pop();
    }
}