/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author dingwen
 * Super Ugly Number
 * DP solution
 */
public class SuperUglyNumber {

    public static void main(String[] args) {
        SuperUglyNumber un = new SuperUglyNumber();
        int[] primes = {2, 7, 13, 19};
        System.out.println(un.nthSuperUglyNumber(12, primes));

    }

    public int nthSuperUglyNumber(int n, int[] primes) {

        int[] uglyNums = new int[n];
        int[] index = new int[primes.length];//record the ith factor group's index on ugly nums
        uglyNums[0] = 1;

        for (int i = 1, min=1; i < n; i++) {
            while (min == uglyNums[i - 1]) {//if duplicate then continue to update indices, but not assign value;
                min = min(uglyNums, index, primes);
            }
            uglyNums[i] = min;
        }
        return uglyNums[n - 1];
    }

    private int min(int[] uglyNums, int[] index, int[] primes) {
        int min = Integer.MAX_VALUE;
        int min_index = 0;
        for (int t = 0; t < primes.length; t++) {
            int current = uglyNums[index[t]] * primes[t];
            if (min > current) {
                min = current;
                min_index = t;
            }
        }
        index[min_index]++;
        return min;
    }

}
