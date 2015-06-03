package olivelv.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a collection of candidate numbers (C) and a target number (T), find all
 * unique combinations in C where the candidate numbers sums to T.
 * 
 * Each number in C may only be used once in the combination.
 * 
 * Note:
 * 
 * •All numbers (including target) will be positive integers. •Elements in a
 * combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤
 * … ≤ ak). •The solution set must not contain duplicate combinations.
 * 
 * 
 * For example, given candidate set 10,1,2,7,6,1,5 and target 8, A solution set
 * is: [1, 7] [1, 2, 5] [2, 6] [1, 1, 6]
 * 
 * 
 * @author olivelv
 * @version time: 2015年6月3日 上午9:42:27
 */
public class CombinationSumII {
	List<List<Integer>>res=null;
	Map<String,Integer>map=null;
	public void dfs(int []candidates,int idx,int remain,List<Integer>list,String str){
		if(remain==0){
			if(!map.containsKey(str)){
				res.add(new ArrayList<Integer>(list));
				map.put(str, 1);
			}
			return ;
		}
		if(idx>=candidates.length||remain<candidates[idx])return ;
		list.add(candidates[idx]);
		dfs(candidates,idx+1,remain-candidates[idx],list,str+candidates[idx]);
		list.remove(list.size()-1);
		dfs(candidates,idx+1,remain,list,str);
		
	}
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		res=new ArrayList<List<Integer>>();
		map=new HashMap<String,Integer>();
		Arrays.sort(candidates);
		dfs(candidates,0,target,new ArrayList<Integer>(),"");
		/*for(int i=0;i<res.size();i++){
			List<Integer>list=res.get(i);
			for(int ele:list){
				System.out.print(ele+" ");
			}
			System.out.println();
		}*/
		return res;
	}
	public static void main(String []args){
		CombinationSumII test=new CombinationSumII();
		int []candidates={10,1,2,7,6,1,5};
		test.combinationSum2(candidates, 8);
	}
}
