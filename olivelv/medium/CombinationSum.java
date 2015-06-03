package olivelv.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a set of candidate numbers (C) and a target number (T), find all unique
 * combinations in C where the candidate numbers sums to T.
 * 
 * The same repeated number may be chosen from C unlimited number of times.
 * 
 * Note:
 * 
 * •All numbers (including target) will be positive integers. •Elements in a
 * combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤
 * … ≤ ak). •The solution set must not contain duplicate combinations.
 * 
 * 
 * For example, given candidate set 2,3,6,7 and target 7, A solution set is: [7]
 * [2, 2, 3]
 * 
 * 
 * @author olivelv
 * @version time: 2015年6月3日 上午8:34:01
 */
public class CombinationSum {
	List<List<Integer>>res=null;
	public void dfs(int []candidates,int remain,int idx,List<Integer>list){
		//System.out.println(remain);
		if(remain==0){
			res.add(new ArrayList<Integer>(list));
		}
		if(idx>=candidates.length)return ;
		if(candidates[idx]>remain)return ;
		for(int i=1;candidates[idx]*i<=remain;i++){
			/*for(int k=0;k<i;k++)list.add(candidates[idx]);
			dfs(candidates,remain-candidates[idx],idx+1,list);
			for(int k=0;k<i;k++)list.remove(list.size()-1);*/
			list.add(candidates[idx]);
			dfs(candidates,remain-candidates[idx]*i,idx+1,list);
		}
		for(int i=1;candidates[idx]*i<=remain;i++)list.remove(list.size()-1);
		dfs(candidates,remain,idx+1,list);
	}
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		res=new ArrayList<List<Integer>>();
		Arrays.sort(candidates);
		dfs(candidates,target,0,new ArrayList<Integer>());
		
		/*System.out.println(res.size());
		for(int i=0;i<res.size();i++){
			List<Integer>list=res.get(i);
			for(int ele:list){
				System.out.print(ele+" ");
			}
			System.out.println();
		}*/
		return res;
	}
	public static void main(String []args){
		CombinationSum test=new CombinationSum();
		int []candidates={8,7,4,3};
		test.combinationSum(candidates, 11);
	}
}
