public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] LinkCounts = new int[numCourses];
        List<List<Integer>> adjs = new ArrayList<>();
        initializeGraph(LinkCounts,adjs,prerequisites);
        return solveByBFS(LinkCounts, adjs);
    }

    public void initializeGraph(int[] LinkCounts, List<List<Integer>> adjs, int[][] prerequisites){
        int n = LinkCounts.length;
        while(n>0){
            adjs.add(new ArrayList<>());
            n--;
        }
        for(int[] edge:prerequisites){
            LinkCounts[edge[0]]++;
            adjs.get(edge[1]).add(edge[0]);
        }
    }

    public int[] solveByBFS(int[] LinkCounts, List<List<Integer>> adjs){
        int[] order = new int[LinkCounts.length];
        Queue<Integer> toVisit = new ArrayDeque<Integer>();
        for(int i=0;i<LinkCounts.length;i++){
            if(LinkCounts[i]==0) toVisit.offer(i);
        }
        int visited=0;
        while(!toVisit.isEmpty()){
            int from = toVisit.poll();
            order[visited++]=from;
            for(int tos: adjs.get(from)){
                LinkCounts[tos]--;
                if(LinkCounts[tos]==0) toVisit.offer(tos);
            }
        }
        return visited == LinkCounts.length? order:new int[0];
    }
}