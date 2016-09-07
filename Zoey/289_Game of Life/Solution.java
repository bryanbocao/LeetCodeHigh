public class Solution {
    public void gameOfLife(int[][] board) {
        if(board==null || board.length==0) return;
        int row = board.length;
        int col = board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int lives = neighbors(board,i,j);
                if(board[i][j]==1 && lives<=3 && lives>=2) board[i][j]=3;
                if(board[i][j]==0 && lives==3) board[i][j]=2;
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                board[i][j]>>=1;
            }
        }
    }

    public int neighbors(int[][] board, int row, int col){
        int count=0;
        for(int i=Math.max(0,row-1);i<=Math.min(row+1,board.length-1);i++){
            for(int j=Math.max(0,col-1);j<=Math.min(col+1,board[0].length-1);j++){
                count+=board[i][j]&1;
            }
        }
        count-=board[row][col]&1;
        return count;
    }
}