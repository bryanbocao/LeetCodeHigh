package algorithms.num350_IntersectionOfTwoArraysII;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		int[] nums1 = new int[5], nums2 = new int[2];
		nums1[0] = 1; nums1[1] = 2; nums1[2] = 2; nums1[3] = 3; nums1[4] = 2;
    	nums2[0] = 2; nums2[1] = 2;
        List<Integer> l1 = new ArrayList<Integer>(),
        		l2 = new ArrayList<Integer>();
        for (int i: nums1) l1.add(nums1[i]);
        for (int i = 0; i < nums2.length; i++) {
        	l2.add(nums2[i]);
        }
//        for (int j: nums2) l2.add(nums2[j]);
        l2.retainAll(l2);
        Iterator<Integer> it = l1.iterator();
        while (it.hasNext()) {
        	System.out.println(it.next());
        }
	}
}
