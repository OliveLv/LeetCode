package olivelv.easy;

/**
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 * 
 * @author olivelv
 * @version time: 2015年5月30日 下午2:53:22
 */
public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		String str="";
		int n=strs.length;
		if(n==0)return str;
		for(int i=0;;i++){
			if(i>=strs[0].length())return str;
			char val=strs[0].charAt(i);
			for(int j=1;j<n;j++){
				if(i>=strs[j].length())return str;
				char c=strs[j].charAt(i);
				if(c!=val)return str;
			}
			str+=val;
		}
	}
}
