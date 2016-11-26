public class NumMatrix {

    //这个是matrix的deep copy
    int[][] nums;
    //这个是binary index tree
    int[][] tree;
    int m;
    int n;

    public NumMatrix(int[][] matrix) {
        if(matrix.length==0||matrix[0].length==0) return;
        m = matrix.length;
        n = matrix[0].length;
        tree = new int[m+1][n+1];
        //因为matrix没有传参用全局变量代替 matrix只是从题目的全世界路过
        nums = new int[m][n];
        //这里是正常的boundary
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                //这个method同时初始化了nums, tree 酷炫!
                update(i,j,matrix[i][j]);
            }
        }
    }

    public void update(int row, int col, int val) {
        if(m==0||n==0) return;
        //这里决定了nums不能直接初始化为matrix
        int delta = val - nums[row][col];
        //更新matrix
        nums[row][col] = val;
        //BIT的index永远是[1,M], step是flip a bit
        for(int i=row+1;i<=m;i+=i&(-i)){
            for(int j=col+1;j<=n;j+=j&(-j)){
                //由于tree是个sum array, 更新包含(row, col)的tree
                tree[i][j]+=delta;
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        //这里看似很酷炫 其实画个图就明白了
        return sum(row2+1,col2+1)+sum(row1,col1)-sum(row1,col2+1)-sum(row2+1,col1);
    }

    public int sum(int row, int col){
        int res = 0;
        //注意BIT的boundary不走寻常路
        for(int i=row;i>0;i-=i&(-i)){
            for(int j=col;j>0;j-=j&(-j)){
                res+=tree[i][j];
            }
        }
        return res;
    }
}


// Your NumMatrix object will be instantiated and called as such:
// NumMatrix numMatrix = new NumMatrix(matrix);
// numMatrix.sumRegion(0, 1, 2, 3);
// numMatrix.update(1, 1, 10);
// numMatrix.sumRegion(1, 2, 3, 4);