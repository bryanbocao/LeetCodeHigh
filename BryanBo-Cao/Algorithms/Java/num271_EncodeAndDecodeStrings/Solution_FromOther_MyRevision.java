package num271_EncodeAndDecodeStrings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution_FromOther_MyRevision {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
    	StringBuilder sb = new StringBuilder();
    	for (String s : strs) sb.append(s.length()).append('/').append(s);
    	return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
    	List<String> ls = new ArrayList<String>();
    	for (int i = 0; i < s.length();) {
    		int slash = s.indexOf('/', i);
    		int size = Integer.valueOf(s.substring(i, slash));
    		ls.add(s.substring(slash + 1, slash + 1 + size));
    		i = slash + 1 + size;
    	}
    	return ls;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));

//https://leetcode.com/problems/encode-and-decode-strings/
/*
271. Encode and Decode Strings   Add to List QuestionEditorial Solution  My Submissions
Total Accepted: 15164
Total Submissions: 57290
Difficulty: Medium
Contributors: Admin
Design an algorithm to encode a list of strings to a string. The encoded string is then sent over the network and is decoded back to the original list of strings.

Machine 1 (sender) has the function:

string encode(vector<string> strs) {
  // ... your code
  return encoded_string;
}
Machine 2 (receiver) has the function:
vector<string> decode(string s) {
  //... your code
  return strs;
}
So Machine 1 does:

string encoded_string = encode(strs);
and Machine 2 does:

vector<string> strs2 = decode(encoded_string);
strs2 in Machine 2 should be the same as strs in Machine 1.

Implement the encode and decode methods.

Note:
The string may contain any possible characters out of 256 valid ascii characters. Your algorithm should be generalized enough to work on any possible characters.
Do not use class member/global/static variables to store states. Your encode and decode algorithms should be stateless.
Do not rely on any library method such as eval or serialize methods. You should implement your own encode/decode algorithm.
Hide Company Tags Google
Hide Tags String
Hide Similar Problems (E) Count and Say (H) Serialize and Deserialize Binary Tree
*/
//from https://discuss.leetcode.com/topic/22848/ac-java-solution/8
//from https://discuss.leetcode.com/user/qianzhige 