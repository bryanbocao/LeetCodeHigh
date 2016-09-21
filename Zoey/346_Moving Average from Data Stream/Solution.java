public class MovingAverage {

    Deque<Integer> queue;
    int max=0;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        queue = new ArrayDeque<Integer>();
        max = size;
    }

    public double next(int val) {
        queue.add(val);
        if(queue.size()>max){
            queue.poll();
        }
        int len = queue.size();
        int sum=0;
        for(Integer item:queue) sum+=item;
        return (double)sum/len;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */