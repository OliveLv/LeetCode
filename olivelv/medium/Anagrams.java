package olivelv.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
		if(strs.length<=1) return (list);
		Map<String,String>map=new HashMap<String,String>();
		Map<String,Integer>map1=new HashMap<String,Integer>();
		for(String str:strs){
			char []tmp=str.toCharArray();
			Arrays.sort(tmp);
			String s=new String(tmp);
			if(!map.containsKey(s)){
				map.put(s, str);
			}else{
				list.add(str);
				map1.put(s, 1);
			}
		}
		for(String str:map1.keySet()){
			list.add(map.get(str));
			
		}
		/*System.out.println(list.size());
		for(String str:list){
			System.out.println(str);
		}*/
		return (list);
	}
	public static void main(String []args){
		Anagrams test=new Anagrams();
		String []strs={"and","dan"};
		test.anagrams(strs);
	}
}
