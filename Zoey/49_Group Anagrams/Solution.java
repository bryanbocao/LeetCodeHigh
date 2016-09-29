public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();
        if(strs==null || strs.length==0) return res;
        HashMap<String,List<String>> map = new HashMap<String,List<String>>();

        for(String str:strs){
            String original = str;
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            List<String> val = new ArrayList<String>();
            val.add(original);
            if(!map.containsKey(String.valueOf(chars))) map.put(String.valueOf(chars),val);
            else{
                val = map.get(String.valueOf(chars));
                val.add(original);
                map.put(String.valueOf(chars),val);
            }
        }

        return new ArrayList<List<String>>(map.values());
    }
}