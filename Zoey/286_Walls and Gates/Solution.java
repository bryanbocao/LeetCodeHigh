public class Solution {
    public void wallsAndGates(int[][] rooms) {
        if(rooms==null || rooms.length==0) return;
        int[] dict = {0,1,0,-1,0};
        Deque<Integer> queue = new ArrayDeque<>();
        int m = rooms.length, n = rooms[0].length;
        for(int i=0;i<rooms.length;i++){
            for(int j=0;j<rooms[0].length;j++){
                if(rooms[i][j]==0) queue.offer(i*n+j);
            }
        }

        while(!queue.isEmpty()){
            int ind = queue.poll();
            int i = ind/n, j = ind % n;
            for(int k=0;k<4;k++){
                int p = i+dict[k], q = j+dict[k+1];
                if(p>=0 && p<m && q>=0 && q<n && rooms[p][q]==Integer.MAX_VALUE){
                    rooms[p][q] = rooms[i][j]+1;
                    queue.offer(p*n+q);
                }
            }
        }
    }
}