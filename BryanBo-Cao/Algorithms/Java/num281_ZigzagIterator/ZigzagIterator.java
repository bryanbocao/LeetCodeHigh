/**
https://leetcode.com/problems/zigzag-iterator/
Locked Question
 */
package algorithms.num281_ZigzagIterator;

import java.util.Iterator;
import java.util.List;

public class ZigzagIterator {

	// BryanBo-cao's Code ====== start
	List<Integer> ls1 = null, ls2 = null;
	Iterator<Integer> it1 = null, it2 = null;
	boolean lastLs1;
    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        ls1 = v1;
        ls2 = v2;
        it1 = ls1.iterator();
        it2 = ls2.iterator();
        lastLs1 = true;
    }

    public int next() {
        if (lastLs1) {
            lastLs1 = false;
        	if (it1.hasNext()) return it1.next();
        	else if (it2.hasNext()) return it2.next();
        } else {
        	lastLs1 = true;
        	if (it2.hasNext()) return it2.next();
        	else if (it1.hasNext()) return it1.next();
        }
        return 0;
    }

    public boolean hasNext() {
        if (it1.hasNext() || it2.hasNext()) return true;
        return false;
    }
    // BryanBo-Cao's code ====== end
}

/**
 * Your ZigzagIterator object will be instantiated and called as such:
 * ZigzagIterator i = new ZigzagIterator(v1, v2);
 * while (i.hasNext()) v[f()] = i.next();
 */
//SolvedOn20160816TueAt22:23 CodingDuration:14m02s52 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao
