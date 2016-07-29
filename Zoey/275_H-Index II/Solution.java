public class Solution {
    public int hIndex(int[] citations) {
        if(citations==null||citations.length==0) return 0;
        int low=0,high=citations.length;
        int len=citations.length;
        while(low<high){
            int mid=low+(high-low)/2;
            if(citations[mid]==len-mid) return len-mid;
            if(citations[mid]>len-mid) high=mid;
            else low=mid+1;
        }
        return len-low;
    }
}