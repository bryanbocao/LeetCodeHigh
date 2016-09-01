public class Solution {
    public void solve(char[][] board) {
        if(board.length==0||board[0].length==0) return;
        int m = board.length, n = board[0].length;

        for(int i=0;i<board.length;i++){
            floodFill(board,i,0);
            floodFill(board,i,board[0].length-1);
        }
        for(int i=0;i<board[0].length;i++){
            floodFill(board,0,i);
            floodFill(board,board.length-1,i);
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++)
                board[i][j] = (board[i][j]=='#')?'O':'X';
        }
    }

    public void floodFill(char[][] board, int i, int j){
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{i,j});
        while(!stack.isEmpty()){
            int[] pos = stack.pop();
            i = pos[0];
            j = pos[1];
            if(board[i][j]!='O') continue;

            board[i][j]='#';
            if(i>0) stack.push(new int[]{i-1,j});
            if(j>0) stack.push(new int[]{i,j-1});
            if(i<board.length-1) stack.push(new int[]{i+1,j});
            if(j<board[i].length-1) stack.push(new int[]{i,j+1});
        }
    }
}