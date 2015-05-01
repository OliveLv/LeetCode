package olivelv.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * The set [1,2,3,…,n] contains a total of n! unique permutations.
 * 
 * By listing and labeling all of the permutations in order, We get the
 * following sequence (ie, for n = 3): 1."123" 2."132" 3."213" 4."231" 5."312"
 * 6."321"
 * 
 * 
 * Given n and k, return the kth permutation sequence.
 * 
 * 
 * @author olivelv
 * @version time: 2015年5月1日 下午12:53:31
 */
public class PermutationSequence {
	public String getPermutation(int n, int k) {
	    int fact=1;
	    for(int i=2;i<n;i++)fact*=i;
	    String str="";
	    List<Integer>list=new ArrayList<Integer>();
	    for(int i=1;i<=n;i++)list.add(i);
	    int base=n-1;
	    k--;
	    for(base=n-1;base>0;base--){
	    	int val=k/fact+1;
	    	//System.out.println(val+" "+fact);
	    	str+=list.get(val-1);
	    	list.remove(val-1);
	    	k%=fact;
	    	fact/=base;
	    }
	    str+=list.get(0);
	   // System.out.println(str);
		return str;
	}
	public void getNum(String s){
		int n=s.length();
		int fact=1;
		int val=0;
		for(int i=2;i<n;i++)fact*=i;
		for(int i=0;i<n;i++){
			
			int c=s.charAt(i)-'0';
			val+=(c-1)*fact;
			System.out.println(val);
			fact/=(n-i-1);
		}
		
	}
	public static void main(String []args){
		PermutationSequence test=new PermutationSequence();
		for(int i=1;i<=6;i++)
		test.getPermutation(3, i);
		//test.getNum("213");
	}
}
