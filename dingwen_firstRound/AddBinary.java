/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode2;

/**
 *
 * @author dingwen
 * 
 * 67 Add Binary
 * My implementation is too complex, 3ms
 * the simple one, 4ms
 */
public class AddBinary {

    public static void main(String[] args) {
        String a = "11011111111";
        String b = "111111111111111111";
        AddBinary ab = new AddBinary();
        System.out.println(ab.addBinary_simple(a, b));
    }
    
    public String addBinary_simple(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
    
    public String addBinary_origin(String a, String b) {
        char[] as = a.toCharArray();
        char[] bs = b.toCharArray();

        int max_length = Math.max(as.length, bs.length);
        int min_length = Math.min(as.length, bs.length);
        char[] rs = new char[max_length + 1];
        boolean one_added = false;
        int i = as.length - 1;
        int j = bs.length - 1;
        int t = max_length;
        for (; i >= 0 && j >= 0; i--, j--, t--) {
            if (!one_added) {
                if ((as[i] == '1' && bs[j] == '0') || (as[i] == '0' && bs[j] == '1')) {
                    rs[t] = '1';
                } else if ((as[i] == '1' && bs[j] == '1')) {
                    rs[t] = '0';
                    one_added = true;
                } else {
                    rs[t] = '0';
                }
            } else if ((as[i] == '1' && bs[j] == '0') || (as[i] == '0' && bs[j] == '1')) {
                rs[t] = '0';//1+0, 1
            } else if ((as[i] == '1' && bs[j] == '1')) {//1+1,1
                rs[t] = '1';
            } else {//0+0,1
                rs[t] = '1';
                one_added = false;
            }
        }
        return new String(as.length > bs.length ? set(rs, as, one_added, max_length - min_length - 1) : set(rs, bs, one_added, max_length - min_length - 1)).trim();

    }

    private char[] set(char[] rs, char[] s, boolean one_added, int start) {
        //fill rest 
        if (start < s.length) {
            for (int i = start; i >= 0; i--) {
                if (one_added) {
                    if (s[i] == '0') {
                        rs[i + 1] = '1';
                        one_added = false;
                    } else {
                        rs[i + 1] = '0';
                    }
                } else if (s[i] == '0') {
                    rs[i + 1] = '0';
                } else {
                    rs[i + 1] = '1';
                }
            }
        }

        if (one_added) {
            rs[0] = '1';
        }

        return rs;
    }

}
