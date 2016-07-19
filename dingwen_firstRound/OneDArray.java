/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author dingwen
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OneDArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = in.nextInt();
            }
            String res = "NO";
            int[] reachable = new int[n];
            if (m == 0) {
                if (isReachable(n - 1, nums, m, reachable, 0)) {
                    res = "YES";
                }
            } else {
                for (int j = 0; j <= m; j++) {
                    if (isReachable(n - j - 1, nums, m, reachable, 0)) {
                        res = "YES";
                        break;
                    }
                }
            }
            System.out.println(res);
            testCases--;
        }
    }

    private static boolean isReachable(int i, int[] nums, int m, int reachable[], int dir) {//1,+1,-1,0
        if (i > 0 && i < nums.length) {
            boolean a = false;
            boolean b = false;
            boolean c = false;
            if (nums[i] == 1) {
                reachable[i] = -1;
                return false;
            }

            if (i - 1 >= 0 && reachable[i - 1] == 0 && dir != 1) {
                a = isReachable(i - 1, nums, m, reachable, -1);
            }

            if (i >= m && reachable[i - m] == 0 && m != 0) {
                c = isReachable(i - m, nums, m, reachable, 0);
            }

            if (i + 1 < nums.length && reachable[i + 1] == 0 && dir != -1) {
                b = isReachable(i + 1, nums, m, reachable, 1);
            }

            if (a || b || c) {
                reachable[i] = 1;
                return true;
            } else {
                reachable[i] = -1;
                return false;
            }

        } else if (i == 0 && nums[0] == 0) {
            reachable[0] = 1;
            return true;
        }
        return false;
    }
}
