package olivelv.medium;

/**
 * Implement a trie with insert, search, and startsWith methods.
 * 
 * Note: You may assume that all inputs are consist of lowercase letters a-z.
 * 
 * 
 * @author olivelv
 * @version time: 2015年5月31日 上午9:28:48
 */
class TrieNode {
	// Initialize your data structure here.
	TrieNode []nexts;
	int num;
	boolean isEnd;
	public TrieNode() {
       nexts=new TrieNode[26];
       num=1;
       isEnd=false;
	}
}

public class Trie {
	private TrieNode root;

	public Trie() {
		root = new TrieNode();
	}

	// Inserts a word into the trie.
	public void insert(String word) {
		int n=word.length();
		TrieNode p=root;
		for(int i=0;i<n;i++){
			int val=word.charAt(i)-'a';
			if(p.nexts[val]==null)p.nexts[val]=new TrieNode();
			p.num++;
			p=p.nexts[val];
		}
		p.isEnd=true;
	}

	// Returns if the word is in the trie.
	public boolean search(String word) {
		int n=word.length();
		TrieNode p=root;
		for(int i=0;i<n;i++){
			int val=word.charAt(i)-'a';
			if(p.nexts[val]==null)return false;
			p=p.nexts[val];
		}
		if(p.isEnd)return true;
		return false;
	}

	// Returns if there is any word in the trie
	// that starts with the given prefix.
	public boolean startsWith(String prefix) {
		int n=prefix.length();
		TrieNode p=root;
		for(int i=0;i<n;i++){
			int val=prefix.charAt(i)-'a';
			if(p.nexts[val]==null)return false;
			p=p.nexts[val];
		}
		return true;
	}
	/*public static void main(String []args){
		Trie trie=new Trie();
		trie.insert("somestring");
		System.out.println(trie.startsWith("s"));
		;
	}*/
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");
