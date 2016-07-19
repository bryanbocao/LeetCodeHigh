/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dingwen
 * 93. Restore IP Addresses (backtracking)
 */
public class RestoreIP {

    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        restoreIp(s, res, "", 1);
        return res;
    }

    private void restoreIp(String s, List<String> res, String restored, int t) {
        if (s.length() != 0) {
            if (t == 4) {
                if (s.length() < 4 && Integer.valueOf(s) < 256) {
                    if (s.length() >= 2 && s.startsWith("0")) {
                        return;
                    }
                    res.add(restored + s);
                }
            } else {
                for (int i = 1; i <= Math.min(s.length(), 3); i++) {
                    String temp = s.substring(0, i);
                    if (temp.length() >= 2 && temp.startsWith("0")) {
                        return;
                    }
                    if (Integer.valueOf(temp) < 256) {
                        restoreIp(s.substring(i, s.length()), res, restored + temp + ".", t + 1);
                    }
                }
            }
        }
    }

    public static void main(String... args) {
        RestoreIP rip = new RestoreIP();
        String input = "25525511135";
        List<String> list = rip.restoreIpAddresses(input);

        for (String l : list) {
            System.out.println(l);
        }
    }
}
