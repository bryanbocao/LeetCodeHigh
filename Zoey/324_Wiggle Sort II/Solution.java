public class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int slow=0,fast=0;
        while(fast<nums.length-1){
            slow++;
            fast+=2;
        }
        int mid=nums[slow];
        int left=0,i=0,right=nums.length-1;
        while(i<=right){
            if(nums[newInd(i,len)]<mid){
                swap(nums,newInd(i,len),newInd(right--,len));
            }else if(nums[newInd(i,len)]>mid){
                swap(nums,newInd(i++,len),newInd(left++,len));
            }else{
                i++;
            }
        }
    }

    public int newInd(int i, int len){
        return (2*i+1)%(len|1);
    }

    public void swap(int[] nums,int a, int b){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}