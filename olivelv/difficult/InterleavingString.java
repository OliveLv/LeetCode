package olivelv.difficult;

import java.util.HashMap;
import java.util.Map;

/**
 * Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.
 * 
 * For example, Given: s1 = "aabcc", s2 = "dbbca",
 * 
 * When s3 = "aadbbcbcac", return true. 
 * When s3 = "aadbbbaccc", return false.
 * 
 * 
 * @author olivelv
 * @version time: 2015年5月5日 下午8:18:14
 */
public class InterleavingString {
    boolean flag=false;
    int n1;
	int n2;
	int n3;
	Map<Integer,Integer>map;
	public boolean isInterleave(String s1, String s2, String s3) {
		flag=false;
		n1=s1.length();
		n2=s2.length();
		n3=s3.length();
		map=new HashMap<Integer,Integer>();
		if(n1+n2!=n3)return flag;
		dfs(s1,s2,s3,0,0,0);
		return flag;
	}
	public void dfs(String s1,String s2,String s3,int idx1,int idx2,int idx3){
		int hash=idx1*n3+idx2;
		if(map.containsKey(hash)){
			flag=false;
			return ;
		}
		if(n3==idx3||flag){
			flag=true;
			return ;
		}
		if(n1==idx1){
			flag=s3.substring(idx3).equals(s2.substring(idx2));
			return ;
		}
		if(flag)return ;
		if(n2==idx2){
			flag=s3.substring(idx3).equals(s1.substring(idx1));
			return ;
		}
		if(flag)return ;
		if(s1.charAt(idx1)==s3.charAt(idx3))dfs(s1,s2,s3,idx1+1,idx2,idx3+1);
		if(flag)return ;
		if(s2.charAt(idx2)==s3.charAt(idx3))dfs(s1,s2,s3,idx1,idx2+1,idx3+1);
		map.put(hash, 1);
	}
	public static void main(String []args){
		InterleavingString test=new InterleavingString();
		System.out.println(test.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
	}
	
}
