public class Solution {
    public boolean validWordSquare(List<String> words) {
        int row = words.size();
        int col = words.get(0).length();
        if(row!=col) return false;
        for(int i=0;i<row;i++){
            String r = words.get(i);
            StringBuilder sb = new StringBuilder();
            for(int j = 0;j<r.length();j++){
                if(words.get(j).length()<=i || r.length()>row) return false;
                sb.append(words.get(j).charAt(i));
            }
            if(!r.equals(sb.toString())) return false;
        }
        return true;
    }
}
