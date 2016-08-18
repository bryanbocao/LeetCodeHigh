public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] diff = new int[gas.length];
        for(int i=0;i<gas.length;i++){
            diff[i] = gas[i]-cost[i];
        }
        int sum =0, startnode = 0, leftGas = 0;
        for(int i=0;i<gas.length;i++){
            leftGas += diff[i];
            sum += diff[i];
            if(sum<0){
                startnode=i+1;
                sum=0;
            }
        }
        return leftGas>=0?startnode:-1;
    }
}