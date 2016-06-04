/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author dingwen
 * 
 * (a) 34
 * (b) 34,222
 * if 34(a) rank before 222, then 34 is before 34222
 * 
 * this is elegant implementation by comparing string's natural order
 */
public class LargestNumber {
   
    
    public String largestNumber(int[] nums) {
        if(nums.length==0) return "";
        if(nums.length==1) return String.valueOf(nums[0]);
        
        List<String> numstr = new ArrayList<>(nums.length);
        for(int i=0; i<nums.length;i++) {
            numstr.add(String.valueOf(nums[i]));
        }
        
        
        Collections.sort(numstr, new Comparator<String>() {
        @Override
        public int compare(String a, String b) {
            String aa = a+b;
            String bb = b+a;
            return bb.compareTo(aa);
        }
        });
        
        StringBuilder sb = new StringBuilder();
        for(String s:numstr) {
            sb.append(s);
        }
        
        return sb.indexOf("0")==0?"0":sb.toString();
    }
    
 
}
