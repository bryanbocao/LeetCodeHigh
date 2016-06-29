package algorithms.num284_PeekingIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Java Iterator interface reference:
//https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {

	List<Integer> ls = null;
	Object[] ints = null;
	int crri = 0;
	
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
		ls = new ArrayList<Integer>();
		while (iterator.hasNext()) ls.add(iterator.next());
		ints = ls.toArray();
		crri = 0;
	}

 // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
		return Integer.parseInt(ints[crri].toString());
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		if (this.hasNext()) return Integer.parseInt(ints[crri++].toString());
		else return null;
	}

	@Override
	public boolean hasNext() {
	    if (crri < ls.size()) return true;
	    else return false;
	}

}
//20160629Wed16:07 duration:15m01s94 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao 