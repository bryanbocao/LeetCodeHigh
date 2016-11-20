public class Solution {
    int m,n;
    public int islandPerimeter(int[][] grid) {
        if(grid==null || grid.length==0) return 0;
        m = grid.length;
        n = grid[0].length;
        int res = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1)
                    res+=check(grid, i, j);
            }
        }
        return res;
    }

    public int check(int[][] grid, int i, int j){
        int res=0;

        if(i-1<0 || grid[i-1][j]==0) res++;
        if(i+1==m || grid[i+1][j]==0) res++;
        if(j-1<0 || grid[i][j-1]==0) res++;
        if(j+1==n || grid[i][j+1]==0) res++;
        return res;
    }
}