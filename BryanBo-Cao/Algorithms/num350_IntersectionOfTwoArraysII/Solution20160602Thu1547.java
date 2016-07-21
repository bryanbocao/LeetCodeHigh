package algorithms.num350_IntersectionOfTwoArraysII;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution20160602Thu1547 {
	
    public static int[] intersect(int[] nums1, int[] nums2) {
    	System.out.println();
    	System.out.println("l1: ");
    	for (int i : nums1) System.out.print(nums1[i] + " ");
        List<Integer> l1 = new ArrayList<Integer>(),
        		l2 = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++) l1.add(nums1[i]);
        for (int i = 0; i < nums2.length; i++) l2.add(nums2[i]);
    	System.out.println();
    	System.out.println("l1: ");
    	for (int i : nums1) System.out.print(nums1[i] + " ");
        Iterator<Integer> it;
        List<Integer> itl = new ArrayList<Integer>();
        int[] its;
        if (nums1.length < nums2.length) {
        	System.out.println("l1 smaller");
        	l1.retainAll(l2);
        	it = l1.iterator();
        	its = new int[nums1.length];
        } else {
        	System.out.println("l2 smaller");
//        	l2.retainAll(l1);
        	it = l2.iterator();
        	while (it.hasNext()) {
        		
        	}
        	its = new int[nums2.length];
        }
    	for (int i : its) its[i] = it.next();
    	System.out.println();
    	System.out.println("l1: ");
    	for (int i : nums1) System.out.print(nums1[i] + " ");
    	System.out.println();
    	System.out.println("l2: ");
    	for (int i = 0; i < nums2.length; i++) System.out.print(nums2[i] + " ");
    	System.out.println();
    	System.out.println("its: ");
    	for (int i = 0; i < its.length; i++) System.out.print(its[i] + " ");
        return its;
    }
}

//20160602Thu15:47 duration:38m59s81 @BryanBo-Cao not passed
