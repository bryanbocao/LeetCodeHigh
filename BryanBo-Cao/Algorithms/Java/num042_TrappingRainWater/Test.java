package algorithms.num042_TrappingRainWater;

public class Test {

	public static void main(String[] args) {
		Solution slt = new Solution();
		int[] h = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
		int[] h2 = new int[]{2,0,2};
		int[] h3 = new int[]{5,2,1,2,1,5};
		int[] h4 = new int[]{5,3,7,7};
		System.out.println(slt.trap(h3));
	}

}
