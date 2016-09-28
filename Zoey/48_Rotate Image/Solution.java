public class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length/2;i++){
            for(int j=0;j<matrix[0].length;j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length-i-1][j];
                matrix[matrix.length-i-1][j]=tmp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                if(i!=j){
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = tmp;
                }
            }
        }
    }
}