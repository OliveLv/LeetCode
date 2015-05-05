package olivelv.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of strings, return all groups of strings that are anagrams.
 * 
 * Note: All inputs will be in lower-case.
 * 
 * 
 * @author olivelv
 * @version time: 2015年5月5日 下午9:25:24
 */
public class Anagrams {
	public List<String> anagrams(String[] strs) {
		List<String>list=new ArrayList<String>();
		if(strs.length<=1) return list;
		Map<String,String>map=new HashMap<String,String>();
		for(String str:strs){
			if(map.containsKey(str)){
				list.add(str);
				list.add(map.get(str));
			}else{
				int n=str.length();
				String s="";
				for(int i=n-1;i>=0;i--){
					s+=str.charAt(i);
				}
				map.put(str, s);
			}
			list.add(str);
		}
		for(String str:list){
			System.out.println(str);
		}
		return list;
	}
	public static void main(String []args){
		Anagrams test=new Anagrams();
		String []strs={"a"};
		test.anagrams(strs);
	}
}
