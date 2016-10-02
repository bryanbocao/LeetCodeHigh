public class Solution {
    public int myAtoi(String str) {
        //case1
        if(str==null||str.length()==0) return 0;
        int index=0,sign=1,total=0;
        //case 2
        while(str.charAt(index)==' ' && index<str.length()) index++;
        //case 3
        if(str.charAt(index)=='+' || str.charAt(index)=='-'){
            sign=str.charAt(index)=='+'? 1:-1;
            index++;
        }
        //case 4
        for(int i=index;i<str.length();i++){
            int digit = str.charAt(i)-'0';

            if(digit < 0 || digit > 9) break;
            if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE%10<digit)
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            total = 10*total+digit;
        }
        return sign*total;
    }
}