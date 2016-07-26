package algorithms.num048_RotateImage;

public class Test {

	public static void main(String[] args) {
		Solution slt = new Solution();
		int[][] mtx4 = new int[4][4];
		mtx4[0][0] = 1;
		mtx4[0][1] = 2;
		mtx4[0][2] = 3;
		mtx4[0][3] = 4;
		mtx4[1][0] = 5;
		mtx4[1][1] = 6;
		mtx4[1][2] = 7;
		mtx4[1][3] = 8;
		mtx4[2][0] = 9;
		mtx4[2][1] = 10;
		mtx4[2][2] = 11;
		mtx4[2][3] = 12;
		mtx4[3][0] = 13;
		mtx4[3][1] = 14;
		mtx4[3][2] = 15;
		mtx4[3][3] = 16;
		slt.rotate(mtx4);
		
		int[][] mtx3 = new int[3][3];
		mtx3[0][0] = 1;
		mtx3[0][1] = 2;
		mtx3[0][2] = 3;
		mtx3[1][0] = 4;
		mtx3[1][1] = 5;
		mtx3[1][2] = 6;
		mtx3[2][0] = 7;
		mtx3[2][1] = 8;
		mtx3[2][2] = 9;
		slt.rotate(mtx3);
	}

}
