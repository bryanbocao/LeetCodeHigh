//do left end binary search and right end binary search
public class Solution {
    public int[] searchRange(int[] nums, int target) {
            int[] res = new int[2];
            res[0] = leftEnd(nums,target,0,nums.length-1,-1);
            res[1] = rightEnd(nums,target,res[0]+1,nums.length-1,res[0]);
            return res;
    }
    
    private int leftEnd(int[] nums, int target,int start,int end,int i) {
        if(end>=start) {
            int mid = start + (end-start)/2;
            if(nums[mid]>target) {
                return leftEnd(nums,target,start,mid-1,i);
            } else if(nums[mid]==target){
                i=mid;
                return leftEnd(nums,target,start,mid-1,i);
            } else {
                return leftEnd(nums,target,mid+1,end,i);
            }
        } else {
            return i;
        }
    }
    
    private int rightEnd(int[] nums, int target,int start,int end,int i) {
        if(end>=start) {
             int mid = start + (end-start)/2;
            if(nums[mid]<target) {
                return rightEnd(nums,target,mid+1,end,i);
            } else if(nums[mid]==target){
                i=mid;
                return rightEnd(nums,target,mid+1,end,i);
            } else {
                return rightEnd(nums,target,start,mid-1,i);
            }
        } else {
            return i;
        }
    }
    
}