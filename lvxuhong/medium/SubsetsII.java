package lvxuhong.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Given a collection of integers that might contain duplicates, S, return all
 * possible subsets.
 * 
 * Note:
 * 
 * •Elements in a subset must be in non-descending order. •The solution set must
 * not contain duplicate subsets.
 * 
 * 
 * For example, If S = [1,2,2], a solution is: [ [2], [1], [1,2,2], [2,2],
 * [1,2], [] ]
 * 
 * 
 * @author xuhong
 *
 */
public class SubsetsII {
	public List<List<Integer>> subsetsWithDup(int[] num) {
	      List<List<Integer>>resl=new ArrayList<List<Integer>>();
	      Set<List<Integer>>res=new HashSet<List<Integer>>();
		     int n=num.length;
		     Arrays.sort(num);
		     List<Integer>list=new ArrayList<Integer>();
		     res.add(list);
		     for(int i=0;i<n;i++){
		    	 Set<List<Integer>>tmp=new HashSet<List<Integer>>();
		    	 Iterator<List<Integer>>it=res.iterator() ;
		    	 while(it.hasNext()){
		    		 list=new ArrayList<Integer>(it.next());
		    		 list.add(num[i]);
		    		 tmp.add(list);
		    	 }
		    	 res.addAll(tmp);
		     }
		     System.out.println(res.size());
		     Iterator<List<Integer>>it=res.iterator() ;
		     while(it.hasNext()){
	    		 list=new ArrayList<Integer>(it.next());
	    		 resl.add(list);
	    		 for(int ele:list){
		    		 System.out.print(ele+" ");
		    	 }
		    	 System.out.println();
	    	 }
		     return resl;  
	    }
	public static void main(String []args){
		int []S={1,2,2};
		SubsetsII test=new SubsetsII();
		test.subsetsWithDup(S);
	}
}
