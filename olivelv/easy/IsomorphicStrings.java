package olivelv.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * 
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * 
 * All occurrences of a character must be replaced with another character while
 * preserving the order of characters. No two characters may map to the same
 * character but a character may map to itself.
 * 
 * For example, Given "egg", "add", return true.
 * 
 * Given "foo", "bar", return false.
 * 
 * Given "paper", "title", return true.
 *
 * @author olivelv
 * @version time: 2015Äê4ÔÂ30ÈÕ ÏÂÎç9:18:54
 */
public class IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
		Map<String,String>map1=new HashMap<String,String>();
		Map<String,String>map2=new HashMap<String,String>();
		if(s.length()!=t.length())return false;
		int n=s.length();
		for(int i=0;i<n;i++){
			String val=String.valueOf(s.charAt(i));
			String val2=String.valueOf(t.charAt(i));
			if(map1.containsKey(val))map1.put(val, map1.get(val)+i);
			else
				map1.put(val, String.valueOf(i));
			if(map2.containsKey(val2))map2.put(val2, map2.get(val2)+i);
			else
				map2.put(val2, String.valueOf(i));
		}
		for(int i=0;i<n;i++){
			String val=String.valueOf(s.charAt(i));
			String val2=String.valueOf(t.charAt(i));
			if(!map1.get(val).equals(map2.get(val2)))return false;
		}
		return true;
	}
	public static void main(String []args){
		IsomorphicStrings test=new IsomorphicStrings();
		System.out.println(test.isIsomorphic("ab", "ca"));
	}
}
