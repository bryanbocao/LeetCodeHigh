package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author dingwen
 * 220. Contains Duplicate III, 14 ms solution, beats 95%
 *   if t>> nums.length, 
 *                  brute force is selected ([-1,2147483647] 1 2147483647)
 *   if nums.length>>t, 
 *                  then map scheme is seleceted [....] 1 10000
 */
public class ContainDupliThree {
    //0,2147483647 1
//2147483647

//[-1,2147483647]
//1
//2147483647 
    public static void main(String[] args) {
        int[] nums = {-1,2147483647}; 
        ContainDupliThree cdt = new ContainDupliThree();
        System.out.println(cdt.containsNearbyAlmostDuplicate(nums, 1, 2147483647));
    }
     public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
         // if t>> nums.length, brute force is selected ([-1,2147483647] 1 2147483647)
         // if nums.length>>t, then map scheme is seleceted [....] 1 10000
        return t>nums.length?containsNearbyAlmostDuplicate_map(nums,k,t):containsNearbyAlmostDuplicate_BF(nums,k,t);
    }
    
    public boolean containsNearbyAlmostDuplicate_BF(int[] nums, int k, int t) {
        Map<Long,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            for(long j=0;j<=t;j++) {
                if(map.containsKey(nums[i]+j) 
                && i-map.get(nums[i]+j)<=k){
                    return true;
                } else {
                    map.put(nums[i]+j,i);
                }
            }
        }
        return false;
    }
    
    public boolean containsNearbyAlmostDuplicate_map(int[] nums, int k, int t) {
        for(int i=0;i<nums.length-k;i++) {
            for(int j=i;j<i+k;j++) {
                if(Math.abs((long)nums[j]-(long)nums[i+k])<=(long)t) {
                    return true;
                }
            }
        }
        return false;
    }
}
