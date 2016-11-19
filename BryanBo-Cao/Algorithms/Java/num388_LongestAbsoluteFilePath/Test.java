package algorithms.num388_LongestAbsoluteFilePath;

public class Test {

	public static void main(String[] args) {
		String s = "dir\n\t";
		System.out.println(s.indexOf("\n"));
		System.out.println("dir/subdir2/subsubdir2/file2.ext".length());
		Solution stl = new Solution();
		String s1 = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
		String s2 = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
		String s4 = "a\n\tb\n\t\tc";
		System.out.println("solution result: " + stl.lengthLongestPath(s1));
		System.out.println("solution result: " + stl.lengthLongestPath(s2));
		System.out.println("solution result: " + stl.lengthLongestPath(s4));
		String s3 = "\n\t\tabc";
		System.out.println(s3.length());
		System.out.println(s1.length());
		String[] sArr = s1.split(";;");
		System.out.println(sArr.length);
		
	}

}
