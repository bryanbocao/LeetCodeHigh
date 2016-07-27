package algorithms.num054_SpiralMatrix;

import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Solution slt = new Solution();
		int[][] mtx = new int[3][3];
		int num = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				mtx[i][j] = num++;
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(mtx[i][j] + " ");
			}
			System.out.println();
		}
		List<Integer> ls = slt.spiralOrder(mtx);
		Iterator<Integer> it = ls.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

}
