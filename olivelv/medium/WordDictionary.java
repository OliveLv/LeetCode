package olivelv.medium;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Design a data structure that supports the following two operations: void
 * addWord(word) bool search(word)
 * 
 * 
 * search(word) can search a literal word or a regular expression string
 * containing only letters a-z or .. A . means it can represent any one letter.
 * 
 * For example: addWord("bad") addWord("dad") addWord("mad") search("pad") ->
 * false search("bad") -> true search(".ad") -> true search("b..") -> true
 * 
 * 
 * 
 * @author olivelv
 * @version time: 2015年5月29日 下午8:58:16
 */
/*class TrieNode {
	TrieNode[] nexts = new TrieNode[26];
}*/
/*class TrieNode {
	// Initialize your data structure here.
	TrieNode []nexts;
	int num;
	boolean isEnd;
	public TrieNode() {
       nexts=new TrieNode[26];
       num=1;
       isEnd=false;
	}
}*/
public class WordDictionary {
	TrieNode root = new TrieNode();
    boolean flag=false;
	// Adds a word into the data structure.
	public void addWord(String word) {
		TrieNode p = root;
		int n = word.length();
		for (int i = 0; i < n; i++) {
			int val = word.charAt(i) - 'a';
			if (p.nexts[val] == null)p.nexts[val] = new TrieNode();
				p = p.nexts[val];
			
			p.num++;
		}
		p.isEnd=true;
	}

	// Returns if the word is in the data structure. A word could
	// contain the dot character '.' to represent any one letter.
	public void dfs(String word,int idx,TrieNode root){
		if(flag||root==null)return ;
		if(idx==word.length()){
			if(root.isEnd)flag=true;
			return ;
		}
		int val=word.charAt(idx);
		if(val=='.'){
			for(int i=0;i<26;i++){
				if(root.nexts[i]!=null)dfs(word,idx+1,root.nexts[i]);
			}
		}else{
			if(root.nexts[val-'a']!=null)dfs(word,idx+1,root.nexts[val-'a']);
		}
	}
	public boolean search(String word){
		flag=false;
		dfs(word,0,root);
		return flag;
	}
	//BFS will lead to TLE
	public boolean search1(String word) {
		
		int n = word.length();
		TrieNode p;
		Queue<TrieNode> queue = new LinkedList<TrieNode>();
		queue.add(root);
		for(int i=0;i<n;i++){
			int val=word.charAt(i);
			int idx=val-'a';
			int l=queue.size();
			for(int k=0;k<l;k++){
				p=queue.poll();
				if(val=='.'){
					if(p.num==0)continue;
					for(int j=0;j<26;j++)
						if(p.nexts[j]!=null)queue.add(p.nexts[j]);
				}else{
					if(p.nexts[idx]!=null){
						queue.add(p.nexts[idx]);
					}
				}
			}
		}
		while(!queue.isEmpty()){
			p=queue.poll();
			System.out.println("yes");
			if(p.isEnd)return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// addWord("a"),addWord("a"),search("."),search("a"),search("aa"),search("a"),search(".a"),search("a.")
		WordDictionary wordDictionary = new WordDictionary();
		wordDictionary.addWord("a");
	
		System.out.println(wordDictionary.search("a"));

	}
}

// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");
