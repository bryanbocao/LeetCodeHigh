public class Solution {
    Map<String,List<String>> map;
    List<List<String>> results;
    public List<List<String>> findLadders(String beginWord, String endWord, Set<String> wordList) {
        results = new ArrayList<List<String>>();
        if(wordList.size()==0) return results;
        int min = Integer.MAX_VALUE;

        Queue<String> queue = new ArrayDeque<String>();
        queue.add(beginWord);
        map=new HashMap<String,List<String>>();
        HashMap<String,Integer> ladder = new HashMap<String,Integer>();
        for(String word:wordList){
            ladder.put(word,Integer.MAX_VALUE);
        }
        ladder.put(beginWord,0);
        wordList.add(endWord);

        while(!queue.isEmpty()){
            String word = queue.poll();
            int step = ladder.get(word)+1;
            if(step>min) break;

            for(int i=0;i<word.length();i++){
                StringBuilder sb = new StringBuilder(word);
                for(char ch='a';ch<='z';ch++){
                    sb.setCharAt(i,ch);
                    String new_word = sb.toString();
                    if(ladder.containsKey(new_word)){
                        if(step>ladder.get(new_word)) continue;
                        else if(step<ladder.get(new_word)){
                            queue.add(new_word);
                            ladder.put(new_word,step);
                        }else;

                        if(map.containsKey(new_word)) map.get(new_word).add(word);
                        else{
                            List<String> list = new LinkedList<String>();
                            list.add(word);
                            map.put(new_word,list);
                        }

                        if(new_word.equals(endWord)) min=step;
                    }
                }
            }
        }
        LinkedList<String> result = new LinkedList<String>();
        backTrace(endWord,beginWord,result);
        return results;
    }

    private void backTrace(String word, String start, List<String> ls){
        if(word.equals(start)){
            ls.add(0,start);
            results.add(new ArrayList<String>(ls));
            ls.remove(0);
            return;
        }
        ls.add(0,word);
        if(map.get(word)!=null){
            for(String s:map.get(word)){
                backTrace(s,start,ls);
            }
            ls.remove(0);
        }
    }
}