package algorithms.num208_ImplementTrie_PrefixTree;

import java.util.HashMap;
import java.util.Map;

class TrieNode {
    // Initialize your data structure here.
	TrieNode next;
	Map<Character, TrieNode> map;
	boolean endOfWord;
    public TrieNode() {
        this.map = new HashMap<Character, TrieNode>();
    	this.next = null;
    	this.endOfWord = false;
    }
}

public class Trie20160806Sat0119 {
    private TrieNode root;

    public Trie20160806Sat0119() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        char[] cs = word.toCharArray();
        TrieNode thisTN = this.root;
        if (thisTN.map.containsKey(cs[0])) {
            int i = 0;
            while (i < cs.length && thisTN.map.containsKey(cs[i])) {
            	if (i == cs.length - 1) thisTN.endOfWord = true;
            	thisTN = thisTN.map.get(cs[i++]);
            }
            while (i < cs.length) {
            	TrieNode tn = new TrieNode();
            	if (i == cs.length - 1) thisTN.endOfWord = true;
            	thisTN.map.put(cs[i++], tn);
            	thisTN = tn;
            }
        } else {
            for (int j = 0; j < cs.length; j++) {
            	TrieNode tn = new TrieNode();
            	if (j == cs.length - 1) thisTN.endOfWord = true;
            	thisTN.map.put(cs[j], tn);
            	thisTN = tn;
            }
        }
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        char[] cs = word.toCharArray();
        TrieNode thisTN = this.root;
        int i = 0;
        while (i < cs.length && !thisTN.endOfWord) {
        	System.out.println("line 50: i: " + i);
        	if (thisTN.map.containsKey(cs[i])) thisTN = thisTN.map.get(cs[i++]);
        	else return false;
        }
        System.out.println("line 54: i: " + i + " thisTN: " + thisTN);
        if (i == 0 || i < cs.length) return false;
        else {
        	if (thisTN.endOfWord) return true;
        	else {
        		System.out.println("line 59 return false");
        		return false;
        	}
        }
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        char[] cs = prefix.toCharArray();
        TrieNode thisTN = this.root;
        int i = 0;
        while (i < cs.length && !thisTN.endOfWord) {
        	if (!thisTN.map.containsKey(cs[i])) return false;
        	thisTN = thisTN.map.get(cs[i++]);
        }
        if (i == 0 || i < cs.length) return false;
        else return true;
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");

//20160806Sat1:19 duration:1h09m23s92 WrongAnswer @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 

/**
More Details 

Input:
insert("ab"),search("a"),startsWith("a")
Output:
[true,true]
Expected:
[false,true]

Input:
insert("a"),search("a"),startsWith("a")
Output:
[false,false]
Expected:
[true,true]
Stdout:
line 54: i: 0 thisTN: TrieNode@79fc0f2f
*/
