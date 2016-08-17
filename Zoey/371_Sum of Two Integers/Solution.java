//Iterative
public class Solution{
    public int getSum(int a, int b){
        if(a==0) return b;
        if(b==0) return a;
        while(b!=0){
            int carry = a&b;
            a = a^b;
            b=carry<<1;
        }
        return a;
    }
}

//Recursive
public class Solution{
    public int getSum(int a, int b){
        return (b==0?) a:getSum(a^b,(a&b)<<1);
    }
}

//Iterative
public class Solution{
    public int getDiff(int a, int b){
        while(b!=0){
            int borrow = (~a)&b;
            a = a^b;
            b = borrow<<1;
        }
        return a;
    }
}

//Recursive
public class Solution{
    public int getDiff(int a, int b){
        return (b==0?) a:getDiff(a^b,((~a)&b)<<1);
    }
}