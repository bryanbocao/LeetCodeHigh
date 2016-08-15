public class Solution {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int m = nums1.length, n = nums2.length;
        PriorityQueue<Tuple> pq = new PriorityQueue<>();
        List<int[]> res = new ArrayList<int[]>();
        if(nums1==null || nums2==null || m==0 || n==0 || k<=0) return res;
        for(int j=0;j<n;j++) pq.offer(new Tuple(0,j,nums1[0]+nums2[j]));
        for(int i=0;i<Math.min(m*n,k);i++){
            Tuple t = pq.poll();
            res.add(new int[]{nums1[t.x],nums2[t.y]});
            if(t.x==m-1) continue;
            pq.offer(new Tuple(t.x+1,t.y,nums1[t.x+1]+nums2[t.y]));
        }
        return res;
    }
}

class Tuple implements Comparable<Tuple>{
    int x, y, val;
    public Tuple(int x, int y, int val){
        this.x = x;
        this.y = y;
        this.val = val;
    }

    public int compareTo(Tuple that){
        return this.val-that.val;
    }
}