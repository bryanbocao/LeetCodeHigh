public class Solution {
    public boolean verifyPreorder(int[] preorder) {
        int minValue = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        for(int node:preorder){
            if(node<minValue) return false;
            while(!stack.isEmpty() && stack.peek()<node) minValue = stack.pop();
            stack.push(node);
        }
        return true;
    }
}