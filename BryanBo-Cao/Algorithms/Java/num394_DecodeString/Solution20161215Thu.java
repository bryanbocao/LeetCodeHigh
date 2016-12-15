package num394_DecodeString;

import java.util.Stack;

public class Solution20161215Thu {
	public String decodeString(String s) {
		Stack<String> repeated_s = new Stack<String>();
		StringBuilder sb = new StringBuilder();

		int i = s.indexOf("[");

		if (i == -1) return s;

		int cnt = Integer.valueOf(s.substring(0, i));
		int lastI = s.lastIndexOf("]");
		String tempS = getInnterString(s.substring(i + 1, lastI));
		StringBuilder tempSB = new StringBuilder();
		for (int ii = 0; ii < cnt; ii++) tempSB.append(tempS);
		
		sb.append(s);
		return sb.toString();

	}

	private static String getInnterString(String innerS) {
		int i = innerS.indexOf("[");
		if (i == -1) return innerS;
		
		int cnt = Integer.valueOf(innerS.substring(0, i));
		int lastI = innerS.lastIndexOf("]");
		String tempS = getInnterString(innerS.substring(i + 1, lastI));
		StringBuilder tempSB = new StringBuilder();
		for (int ii = 0; ii < cnt; ii++) tempSB.append(tempS);
		return tempSB.toString();
	}
}