public class Solution {
    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        Set<String> beginSet = new HashSet<>();
        Set<String> endSet = new HashSet<>();
        HashSet<String> visited = new HashSet<>();
        int len = 1;
        beginSet.add(beginWord);
        endSet.add(endWord);
        while(!beginSet.isEmpty() && !endSet.isEmpty()){
            if(beginSet.size()>endSet.size()){
                Set<String> swap = beginSet;
                beginSet = endSet;
                endSet = swap;
            }
            Set<String> tmp = new HashSet<>();
            for(String word:beginSet){
                char[] chrs = word.toCharArray();
                for(int i=0;i<chrs.length;i++){
                    for(char c='a';c<='z';c++){
                        char old = chrs[i];
                        chrs[i] = c;
                        String target = String.valueOf(chrs);

                        if(endSet.contains(target)) return len+1;
                        if(!visited.contains(target) && wordList.contains(target)){
                            tmp.add(target);
                            visited.add(target);
                        }
                        chrs[i] = old;
                    }
                }
            }
            beginSet = tmp;
            len++;
        }
        return 0;
    }
}