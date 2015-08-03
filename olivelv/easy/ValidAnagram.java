package olivelv.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, write a function to determine if t is an anagram
 * of s.
 * 
 * For example, s = "anagram", t = "nagaram", return true. s = "rat", t = "car",
 * return false.
 * 
 * Note: You may assume the string contains only lowercase alphabets.
 * 
 * ValidAnagram.java
 * 
 * @author olivelv
 * @version time: Aug 3, 2015 10:54:14 PM
 */
public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		int n=s.length();
		if(n!=t.length())return false;
		Map<String,Integer>map=new HashMap<String,Integer>();
		for(int i=0;i<n;i++){
			String val=String.valueOf(s.charAt(i));
			int count=0;
			if(map.containsKey(val))count=map.get(val);
			map.put(val, count+1);
			val=String.valueOf(t.charAt(i));
			count=0;
			if(map.containsKey(val))count=map.get(val);
			map.put(val, count-1);
		}
		for(String str:map.keySet()){
			if(map.get(str)!=0)return false;
		}
		return true;
		
	}
}
