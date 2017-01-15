package num271_EncodeAndDecodeStrings;

import java.util.*;

public class Practice_Solution_FromOther {
	public String encode(List<String> strs) {
		StringBuilder sb = new StringBuilder();
		for (String s : strs) sb.append(s.length()).append('/').append(s);
		return sb.toString();
	}
	public List<String> decode(String s) {
		List<String> ls = new ArrayList<String>();
		for (int i = 0; i < s.length();) {
			int slash = s.indexOf('/');
			int size = Integer.valueOf(s.substring(i, slash));
			ls.add(s.substring(slash + 1, slash + 1 + size));
			i = slash + 1 + size;
		}
		return ls;
	}
}
//PracticedOn20161216FriAt00:41 7Times
