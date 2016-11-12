public class Solution {
    public int findMinArrowShots(int[][] points) {
        int len = points.length;
        if(len==0) return 0;
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });

        Stack<int[]> stack = new Stack<>();
        stack.push(points[0]);

        for(int i=1;i<len;i++){
            int[] top = stack.pop();
            //System.out.println(points[i][0]+":"+points[i][1]);
            if(top[1]<points[i][0]){
                //System.out.println("no overlap push"+top[0]+":"+top[1]);
                stack.push(top);
                stack.push(points[i]);
            }
            else{
                top[0] = Math.max(top[0],points[i][0]);
                top[1] = Math.min(top[1],points[i][1]);
                //System.out.println("push"+top[0]+":"+top[1]);
                stack.push(top);
            }
        }
        return stack.size();
    }
}