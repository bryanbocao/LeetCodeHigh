public class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] tree = preorder.split(",");
        int diff = 1;
        for(String node:tree){
            diff--;
            if(diff<0) return false;
            if(!node.equals("#")) diff+=2;
        }
        return diff==0;
    }
}