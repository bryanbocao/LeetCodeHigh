public class Solution {
    public boolean isPerfectSquare(int num) {
        long lo=1, hi=num; //Avoid Integer Overflow
        long nums = (long) num;
        while(lo<=hi){
            long mid = lo+(hi-lo)/2;
            if(mid*mid<nums) lo=mid+1;
            if(mid*mid>nums) hi=mid-1;
            if(mid*mid==nums) return true;
        }
        return false;
    }
}