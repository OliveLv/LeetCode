package lvxuhong.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Given a set of distinct integers, S, return all possible subsets.
 * 
 * Note:
 * 
 * •Elements in a subset must be in non-descending order. •The solution set must
 * not contain duplicate subsets.
 * 
 * 
 * For example, If S = [1,2,3], a solution is: [ [3], [1], [2], [1,2,3], [1,3],
 * [2,3], [1,2], [] ]
 * 
 * 
 * @author xuhong
 *
 */
public class Subsets {
/*	public List<List<Integer>> subsets(int[] S) {
     //  List<List<Integer>>res=new ArrayList<List<Integer>>();
	//	List<Integer>list=new ArrayList<Integer>();
		//res.add(list);
		int n=S.length;
		Set<Set<Integer>>res=new HashSet<Set<Integer>>();
		Set<Integer>set=new HashSet<Integer>();
		res.add(set);
		Iterator<Set<Integer>> it=res.iterator();
		
		for(int i=0;i<n;i++){
			set=it.next();
			for(int j=0;j<n;j++){
				set.add(S[j]);
				res.add(set);
			}
			int l=res.size();
			System.out.println(l);
		}
		
		//for(int i=0;i<l;i++);
		//return res;
		return null;
	}*/
	 public List<List<Integer>> subsets(int[] S) {
	     List<List<Integer>>res=new ArrayList<List<Integer>>();
	     int n=S.length;
	     Arrays.sort(S);
	     List<Integer>list=new ArrayList<Integer>();
	     res.add(list);
	     for(int i=0;i<n;i++){
	    	 List<List<Integer>>tmp=new ArrayList<List<Integer>>();
	    	 for(int j=0;j<res.size();j++){
	    		 list=new ArrayList<Integer>(res.get(j));
	    		 list.add(S[i]);
	    		 tmp.add(list);
	    	 }
	    	 res.addAll(tmp);
	     }
	     /*System.out.println(res.size());
	     for(int i=0;i<res.size();i++){
	    	 list=res.get(i);
	    	 for(int ele:list){
	    		 System.out.print(ele+" ");
	    	 }
	    	 System.out.println();
	     }*/
	     return res;
	    }
	public static void main(String []args){
		int []S={1,2,3};
		Subsets test=new Subsets();
		test.subsets(S);
	}
}
