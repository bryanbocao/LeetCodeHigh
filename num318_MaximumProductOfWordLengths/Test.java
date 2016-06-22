package algorithms.num318_MaximumProductOfWordLengths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		String s1 = "spdifj";
		String s2 = "spoijpweoirj";
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(2); ls.add(3); ls.add(1);
		Collections.sort(ls);
		Collections.reverse(ls);
		Iterator<Integer> it = ls.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		Set<Character> set1 = new HashSet<Character>(),
				set2 = new HashSet<Character>();
		char[] cs1 = s1.toCharArray(),
				cs2 = s2.toCharArray();
		for (int i = 0; i < s1.length(); i++) {
			set1.add(cs1[i]);
		}
		cs2 = s2.toCharArray();
		for (int i = 0; i < s2.length(); i++) {
			set2.add(cs2[i]);
		}
		set1.retainAll(set2);
		Iterator<Character> it2 = set1.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}

	}

}
