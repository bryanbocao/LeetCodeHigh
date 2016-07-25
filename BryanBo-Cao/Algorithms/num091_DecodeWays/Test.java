package algorithms.num091_DecodeWays;

public class Test {

	public static void main(String[] args) {
		String str = new String("abcdef");
		System.out.println(str.substring(1, 3));
		System.out.println(str.substring(2));
		System.out.println("0: " + (int) '0');
		System.out.println("1: " + (int) '1');
		System.out.println("6: " + (int) '6'); 
		System.out.println("9: " + (int) '9'); 
		Solution20160724Sun1734 slt = new Solution20160724Sun1734();
		System.out.println(slt.numDecodings("1212"));
	}

}
