package olivelv.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 Find all possible combinations of k numbers that add up to a number n, given
 * that only numbers from 1 to 9 can be used and each combination should be a
 * unique set of numbers.
 * 
 * Ensure that numbers within the set are sorted in ascending order.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: k = 3, n = 7
 * 
 * Output:
 * 
 * [[1,2,4]]
 * 
 * 
 * 
 * 
 * Example 2:
 * 
 * Input: k = 3, n = 9
 * 
 * Output:
 * 
 * [[1,2,6], [1,3,5], [2,3,4]]
 * 
 * 
 * 
 * @author olivelv
 * @version time: 2015年6月3日 上午9:30:51
 */
public class CombinationSumIII {
	List<List<Integer>>res=null;
	public void dfs(int idx,int remain,List<Integer>list,int remainN){
		if(remain==0&&remainN==0){
			res.add(new ArrayList<Integer>(list));
			return ;
		}
		if(remainN==0||idx>=10||idx>remain)return ;
		list.add(idx);
		dfs(idx+1,remain-idx,list,remainN-1);
		list.remove(list.size()-1);
		dfs(idx+1,remain,list,remainN);
		
	}
	public List<List<Integer>> combinationSum3(int k, int n) {
		res=new ArrayList<List<Integer>>();
		dfs(1,n,new ArrayList<Integer>(),k);
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
		CombinationSumIII test=new CombinationSumIII();
		test.combinationSum3(3, 7);
		test.combinationSum3(3, 9);
	}
}
