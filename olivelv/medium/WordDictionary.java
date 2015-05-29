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
class TrieNode {
	TrieNode[] nexts = new TrieNode[26];
}

public class WordDictionary {
	TrieNode root = new TrieNode();

	// Adds a word into the data structure.
	public void addWord(String word) {
		TrieNode p = root;
		int n = word.length();
		for (int i = 0; i < n; i++) {
			int val = word.charAt(i) - 'a';
			if (p.nexts[val] != null)
				p = p.nexts[val];
			else {
				p.nexts[val] = new TrieNode();

			}
		}
	}

	// Returns if the word is in the data structure. A word could
	// contain the dot character '.' to represent any one letter.
	public boolean search(String word) {
		int n = word.length();
		TrieNode p;
		Queue<TrieNode> queue = new LinkedList<TrieNode>();
		queue.add(root);
		for (int i = 0; i < n; i++) {
			int val = word.charAt(i);
			int l = queue.size();
			for (int k = 0; k < l; k++) {
				p = queue.poll();
				if (val == '.') {
					boolean flag = false;
					for (int j = 0; j < 26; j++) {
						if (p.nexts[j] != null) {
							flag = true;
							queue.add(p.nexts[j]);
						}

					}
					if (!flag)
						return false;
					continue;
				}
				val = word.charAt(i) - 'a';
				if (p.nexts[val] != null)
					queue.add(p.nexts[val]);
				else
					return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		// addWord("a"),addWord("a"),search("."),search("a"),search("aa"),search("a"),search(".a"),search("a.")
		WordDictionary wordDictionary = new WordDictionary();
		wordDictionary.addWord("a");
		wordDictionary.addWord("a");
		System.out.println(wordDictionary.search("."));
		System.out.println(wordDictionary.search("aa"));

		System.out.println(wordDictionary.search("a"));
		System.out.println(wordDictionary.search(".a"));
		System.out.println(wordDictionary.search("a."));
	}
}

// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");
