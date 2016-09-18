public class Solution {
    public boolean isStrobogrammatic(String num) {
        HashMap<Character,Character> map = new HashMap<>();
        map.put('0','0');
        map.put('8','8');
        map.put('1','1');
        map.put('6','9');
        map.put('9','6');
        int start=0,end=num.length()-1;
        while(start<=end){
            if(!map.containsKey(num.charAt(start)) || !map.containsKey(num.charAt(end))) return false;
            else{
                if(map.get(num.charAt(start))!=num.charAt(end)) return false;
            }
            start++;
            end--;
        }
        return true;
    }
}