public class Solutionpq {
    public int findKthLargest(int[] nums, int k) {
        final PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int val:nums){
            pq.offer(val);
            if(pq.size()>k) pq.poll();
        }
        return pq.peek();
    }
}