public class Solution {
    public int maxKilledEnemies(char[][] grid) {
        if(grid==null || grid.length==0 || grid[0].length==0) return 0;
        int max=0, row=0;
        //col是数组 因为同一行有不同的col 到了下一行row重新算但col1仍是col0的值
        int[] col = new int[grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='W') continue;
                //只在row=0 || col==0或遇到墙时才更新
                if(j==0 || grid[i][j-1]=='W') row=killedERow(grid,i,j);
                if(i==0 || grid[i-1][j]=='W') col[j]=killedECol(grid,i,j);
                if(grid[i][j]=='0') max = Math.max(max,row+col[j]);
            }
        }
        return max;
    }

    private int killedERow(char[][] grid, int i, int j){
        int num = 0;
        while(j<=grid[0].length-1 && grid[i][j]!='W'){
            if(grid[i][j]=='E') num++;
            j++;
        }
        return num;
    }

    private int killedECol(char[][] grid, int i, int j){
        int num = 0;
        while(i<=grid.length-1 && grid[i][j]!='W'){
            if(grid[i][j]=='E') num++;
            i++;
        }
        return num;
    }
}