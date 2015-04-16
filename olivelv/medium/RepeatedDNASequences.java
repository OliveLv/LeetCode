package olivelv.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T,
 * for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to
 * identify repeated sequences within the DNA.
 * 
 * Write a function to find all the 10-letter-long sequences (substrings) that
 * occur more than once in a DNA molecule.
 * 
 * For example, Given s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT",
 * 
 * Return: ["AAAAACCCCC", "CCCCCAAAAA"].
 * 
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月15日 下午11:27:22
 */
public class RepeatedDNASequences {
	public List<String> findRepeatedDnaSequences(String s) {
		List<String>res=new ArrayList<String>();
		Map<Integer,Integer>map=new HashMap<Integer,Integer>();
		int n=s.length();
		if(n<=10)return res;
		String str=s.substring(0, 10);
		int val=getVal(str);
		map.put(val, 1);
		for(int i=10;i<n;i++){
			val=changeVal(val,s.charAt(i-10),s.charAt(i));
			if(map.get(val)!=null){
				int cno=(Integer)map.get(val);
				if(cno==1)res.add(s.substring(i-9, i+1));
				map.put(val, cno+1);
			}else{
				map.put(val, 1);
			}
					
		}
		return res;

	}
	public int getC(char c){
		if(c=='A')return 0;
		if(c=='C')return 1;
		if(c=='G')return 2;
		if(c=='T')return 3;
		return -1;
	}
	public int pow(int a,int n){
		int x=a;
		int y=1;
		while(n!=0){
			if((n&1)!=0)y*=x;
			x*=x;
			n>>=1;
		}
		return y;
	}
	public int getVal(String s){
		int sum=0;
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			sum=sum*4+getC(c);
		}
		return sum;
	}
	public int changeVal(int val,char a,char b){
		int x=getC(a);
		int y=getC(b);
		return (val-x*pow(4,9))*4+y;
		
	}
	public static void main(String []args){
		RepeatedDNASequences test=new RepeatedDNASequences();
		String s = "GAGAGAGAGAGA";
		List<String>res=test.findRepeatedDnaSequences(s);
		System.out.println(test.pow(2, 5));
		for(String str:res){
			System.out.println(str);
		}
	}
}
