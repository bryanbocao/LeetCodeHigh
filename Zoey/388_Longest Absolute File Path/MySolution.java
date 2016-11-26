public class MySolution {
    public int lengthLongestPath(String input) {
        String[] dirs = input.split("\n");
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for(int i=0;i<dirs.length;i++){
            int level = dirs[i].lastIndexOf('\t')+1;
            //System.out.println(level+":"+dirs[i]);
            String name = dirs[i].substring(level); //remove '\t' before file name
            if(level==0) map = new HashMap<>();
            map.put(level,name.length()+1); //for dir add '/'
            if(name.contains(".")){
                res = Math.max(res, getLength(map,level));
            }
        }
        return res;
    }

    public int getLength(Map<Integer, Integer> map, int end){
        int res = 0;
        for(Map.Entry<Integer, Integer> level:map.entrySet()){
            //System.out.println("length"+level.getValue());
            if(level.getKey()>end) break;
            res += level.getValue();
        }
        return res-1; //remove '/' for file
    }
}