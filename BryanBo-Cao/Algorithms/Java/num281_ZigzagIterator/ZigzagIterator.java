package num281_ZigzagIterator;

import java.util.ArrayList;
import java.util.List;

public class ZigzagIterator {
    boolean v1Turn;
    List<Integer> v1, v2;
    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        this.v1Turn = true;
        this.v1 = v1;
        this.v2 = v2;
    }

    public int next() {
        if (hasNext()) {
            if (v1Turn) {
            	v1Turn = false;
                if (v1.size() > 0) {
                	Integer itg = v1.get(0);
                    v1.remove(0);
                    return itg;
                } else {
                	Integer itg = v2.get(0);
                    v2.remove(0);
                    return itg;
                }
            } else {
            	v1Turn = true;
                if (v2.size() > 0) {
                	Integer itg = v2.get(0);
                    v2.remove(0);
                    return itg;
                } else {
                	Integer itg = v1.get(0);
                    v1.remove(0);
                    return itg;
                }
            }
        } else return -1;
    }

    public boolean hasNext() {
        if (v1.size() == 0 && v2.size() == 0) return false;
        else return true;
    }
}

/**
 * Your ZigzagIterator object will be instantiated and called as such:
 * ZigzagIterator i = new ZigzagIterator(v1, v2);
 * while (i.hasNext()) v[f()] = i.next();
 */
//SolvedOn20170301WedNight CodingDuration:8m00s90