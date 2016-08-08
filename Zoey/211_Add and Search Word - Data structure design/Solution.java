public class WordDictionary {

    public class TrieNode{
        public boolean isWord;
        public TrieNode[] children = new TrieNode[26];
    }

    private TrieNode root = new TrieNode();

    // Adds a word into the data structure.
    public void addWord(String word) {
        TrieNode ws = root;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(ws.children[c-'a']==null) ws.children[c-'a']=new TrieNode();
            ws=ws.children[c-'a'];
        }
        ws.isWord=true;
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        return helper(word,0,root);
    }

    public boolean helper(String word,int ind,TrieNode ws){
        if(ind==word.length()) return ws.isWord;
        char c = word.charAt(ind);
        if(c!='.') return ws.children[c-'a']!=null && helper(word,ind+1,ws.children[c-'a']);
        else{
            for(int i=0;i<ws.children.length;i++){
                if(ws.children[i]!=null){
                    if(helper(word,ind+1,ws.children[i])) return true;
                }
            }
        }
        return false;
    }
}

// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");