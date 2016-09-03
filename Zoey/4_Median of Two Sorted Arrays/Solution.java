public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int l = (len1+len2+1)/2;
        int r = (len1+len2+2)/2;
        return (getkth(nums1,0,nums2,0,l)+getkth(nums1,0,nums2,0,r))/2.0;
    }

    public int getkth(int[] a, int aStart, int[] b, int bStart, int k){
        if(aStart>a.length-1) return b[bStart+k-1];
        if(bStart>b.length-1) return a[aStart+k-1];
        if(k==1) return Math.min(a[aStart],b[bStart]);

        int aMid = Integer.MAX_VALUE;
        int bMid = Integer.MAX_VALUE;
        if(aStart+k/2 - 1<a.length) aMid = a[aStart+k/2 - 1];
        if(bStart+k/2 - 1<b.length) bMid = b[bStart+k/2 - 1];
        if(aMid<bMid){
            return getkth(a,aStart+k/2,b,bStart, k - k/2);
        }else{
            return getkth(a,aStart,b,bStart+k/2, k - k/2);
        }
    }
}