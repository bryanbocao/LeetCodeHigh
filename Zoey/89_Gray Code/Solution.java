public class Solution{
    public List<Integer> grayCode(int n){
        List<Integer> res = new ArrayList<Integer>();
        res.add(0);
        for(int i=0;i<n;i++){
            for(int j=res.size()-1;j>=0;j--){
                int tmp=res.get(j);
                res.add(tmp|1<<i);
            }
        }
        return res;
    }
}