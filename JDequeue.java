/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author dingwen
 */
public class JDequeue {

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
        int n = 6;
        int m = 2;

        int max = 0;
        int nums[] = {1, 2, 2, 3, 5, 9};
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            deque.add(nums[i]);
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (int i = m; i < n; i++) {
            int del = deque.removeFirst();
            max = max < map.size() ? map.size() : max;
            if (map.get(del) == 1) {
                map.remove(del);
            } else {
                map.put(del, map.get(del) - 1);
            }

            int num = nums[i];
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
            deque.add(num);
        }

        System.out.println(max < map.size() ? map.size() : max);
    }

    public void alternative(int n, int m, int[] nums) {
        Deque<Integer> deque = new ArrayDeque<Integer>();
        Map<Integer, Integer> map = new HashMap<>();
        int curr = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (deque.size() == m) {
                int last = deque.pollLast();
                int val = map.get(last) - 1;
                map.put(last, val);
                if (val == 0) {
                    --curr;
                }
            }
            if (!map.containsKey(num) || map.get(num) == 0) {
                ++curr;
            }
            deque.offerFirst(num);
            max = Math.max(max, curr);

            // add to map
            Integer val = map.get(num);
            if (val == null) {
                val = new Integer(0);
            }
            map.put(num, val + 1);
        }

        System.out.println(max);
    }
}
