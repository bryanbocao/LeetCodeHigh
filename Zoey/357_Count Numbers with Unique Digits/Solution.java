public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        int availableNum=9;
        int UniqueDig = 9;
        int res = 10;
        while(n>1 && availableNum>0){
            UniqueDig *= availableNum;
            res += UniqueDig;
            n--;
            availableNum--;
        }
        return res;
    }
}