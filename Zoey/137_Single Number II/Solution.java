public class Solution{
    public int singleNumber(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])) map.put(nums[i],1);
            else{
                if(map.get(nums[i])==2) map.remove(nums[i]);
                else map.put(nums[i],map.get(nums[i])+1);
            }
        }
        Iterator it = map.entrySet().iterator();
        Map.Entry item = (Map.Entry) it.next();
        return (int) item.getKey();
    }
}