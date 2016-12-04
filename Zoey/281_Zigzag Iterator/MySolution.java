public class ZigzagIterator {

    Deque<Integer> queue;
    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        queue = new ArrayDeque<>();
        while(!v1.isEmpty() || !v2.isEmpty()){
            if(!v1.isEmpty()){
                queue.offer(v1.remove(0));
            }
            if(!v2.isEmpty()){
                queue.offer(v2.remove(0));
            }
        }
    }

    public int next() {
        int res = 0;
        if(!queue.isEmpty()){
            res = queue.poll();
        }
        return res;
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }
}

/**
 * Your ZigzagIterator object will be instantiated and called as such:
 * ZigzagIterator i = new ZigzagIterator(v1, v2);
 * while (i.hasNext()) v[f()] = i.next();
 */