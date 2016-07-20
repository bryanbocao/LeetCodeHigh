public class Solution {
    public String getPermutation(int n, int k) {
        int p=1;
        StringBuilder sb = new StringBuilder();
        List<Integer> nums = new ArrayList<Integer>();

        for(int i=1;i<=n;i++){
            nums.add(i);
            p *= i;
        }
        k--;//zero index
        for(int i=0;i<n;i++){
            p/=(n-i);
            int index = k/p;
            sb.append(nums.remove(index));
            k %= p;
        }
        return sb.toString();
    }
}