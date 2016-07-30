/**
https://leetcode.com/problems/longest-palindromic-substring/
5. Longest Palindromic Substring  QuestionEditorial Solution  My Submissions
Given a string S, find the longest palindromic substring in S. You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.
 */
package algorithms.num005_LongestPalindromicSubstring;

public class Solution20160729Fri1858 {
	public String longestPalindrome(String s) {
		if (s.length() <= 1) return s;
		else {
			char[] cs = s.toCharArray();
			int len = cs.length;
			int maxlen = 0;
			StringBuffer sb = new StringBuffer();
			System.out.println("line 11 " + (len / 2 - 1));
			int mid = len / 2, di = 0;
			for (int i = 1; i < len; i++) {
				int step = 0;
				while (i - step >= 0 && i + step < len && cs[i - step] == cs[i + step]) step++;
				step--;
				int dis = step * 2 + 1;
				System.out.println("i: " + i);
				System.out.println("line 15: step: " + step);
				if (step > 0 && dis > 1 && dis > maxlen) {
					sb = new StringBuffer();
					maxlen = dis;
					for (int j = i - step; j <= i + step; j++) sb.append(cs[j]);
				}
				System.out.println("line 22");
				step = 0;
				while (i - step >= 0 && i + step - 1 < len && cs[i - step] == cs[i + step - 1]) {
					System.out.println("line 25");
					step++;
				}
				step--;
				dis = step * 2;
				if (step > 0 && dis > maxlen) {
					sb = new StringBuffer();
					maxlen = dis;
					for (int j = i - step; j <= i + step - 1; j++) sb.append(cs[j]);
				}
				System.out.println("i: " + i);
				System.out.println("line 35: step: " + step);
			}
			return sb.toString();
		}
	}
}
//20160729Fri18:58 duration:1h19m48s39 TimeLimitExceeded @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 

/**
"bb" Output: "" Expected: "bb" Stdout: line 11 0 i: 1 line 15: step: 0 line
22 line 25 i: 1 line 35: step: 0
 
"abb" Output: "" Expected: "bb" Stdout: line 11 0 i: 1 line 15: step: 0 line
22 i: 1 line 35: step: -1

"rgczcpratwyqxaszbuwwcadruayhasynuxnakpmsyhxzlnxmdtsqqlmwnbxvmgvllafrpmlfuqpbhjddmhmbcgmlyeypkfpreddyencsdmgxysctpubvgeedhurvizgqxclhpfrvxggrowaynrtuwvvvwnqlowdihtrdzjffrgoeqivnprdnpvfjuhycpfydjcpfcnkpyujljiesmuxhtizzvwhvpqylvcirwqsmpptyhcqybstsfgjadicwzycswwmpluvzqdvnhkcofptqrzgjqtbvbdxylrylinspncrkxclykccbwridpqckstxdjawvziucrswpsfmisqiozworibeycuarcidbljslwbalcemgymnsxfziattdylrulwrybzztoxhevsdnvvljfzzrgcmagshucoalfiuapgzpqgjjgqsmcvtdsvehewrvtkeqwgmatqdpwlayjcxcavjmgpdyklrjcqvxjqbjucfubgmgpkfdxznkhcejscymuildfnuxwmuklntnyycdcscioimenaeohgpbcpogyifcsatfxeslstkjclauqmywacizyapxlgtcchlxkvygzeucwalhvhbwkvbceqajstxzzppcxoanhyfkgwaelsfdeeviqogjpresnoacegfeejyychabkhszcokdxpaqrprwfdahjqkfptwpeykgumyemgkccynxuvbdpjlrbgqtcqulxodurugofuwzudnhgxdrbbxtrvdnlodyhsifvyspejenpdckevzqrexplpcqtwtxlimfrsjumiygqeemhihcxyngsemcolrnlyhqlbqbcestadoxtrdvcgucntjnfavylip"

"tembwxtvddsttolegryohdlhxhycymqybzfzcbkzdwcekzfapmpfyeivfoeeqoqdhylziqpnyzuzeeutpqpalbddlliuehvkhqevgjdkskvphidcjmpcmetzwqkzcnxjcjywhfzplntbkuddmbcovearburjqyirbladcrhfkfdfgsmyhdsfmmxmslwkymkgaguilxghmfgaldcogtfnbqakctqtqakupwrxkmbjpmzqngwldmaugzizgwmediyzxevspxdwruyzrmnhchtxlgtb"
 */
