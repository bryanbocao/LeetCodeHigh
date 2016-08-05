public class Solution{
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        res[0] = 0; //not necessary
        int offset=1;
        for(int i=1;i<=num;i++){
            if(i==offset*2) offset*=2;
            res[i] = res[i-offset]+1;
        }
        return res;
    }
}