public class Solution {
    private int row,col;
    public int numIslands(char[][] grid) {
        if(grid==null||grid.length==0||grid[0].length==0) return 0;
        row=grid.length;
        col=grid[0].length;
        int counter=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    DFS(grid,i,j);
                    counter++;
                }
            }
        }
        return counter;
    }

    public void DFS(char[][] grid, int i, int j){
        if(i<0 || j<0 || i>=row || j>= col || grid[i][j]!='1') return;
        grid[i][j]='0';
        DFS(grid,i-1,j);
        DFS(grid,i+1,j);
        DFS(grid,i,j+1);
        DFS(grid,i,j-1);
    }
}